package models.db

import java.text.SimpleDateFormat
import java.time.Instant
import java.util.Date
import java.util.concurrent.TimeUnit
import org.joda.time.{DateTime, DateTimeZone}
import play.api.data.{Form, Mapping}
import play.api.data.Forms.{date, list, optional, _}
import play.api.data.format.Formats._
import play.api.libs.json.OFormat
import play.api.libs.json._
import reactivemongo.bson.BSONObjectID


trait SuperFormT extends TransformersTrait {

  val adminFormData: Mapping[Option[AdminM]] = {

    optional(mapping(
      "_id" -> ignored(Option.empty[BSONObjectID]),
      "adminCreatedId" -> optional(number),
      "dateCreated" -> optional(date),
      "adminModifiedId" -> optional(number),
      "lastModified" -> optional(date).transform(date2Date, date2NowDate)
    )(AdminM.apply)(AdminM.unapply))

  }

  def ccToJsonStr(oDoc: Option[SuperVarT]): Option[String] = oDoc match {
    case Some(_) =>
      oDoc.map(doc => {
        val jsVal = Json.toJson(doc)
        Json.stringify(jsVal("data"))
      })
    case None => None
  }

}

trait SuperVarT extends ReadAndWriteTrait with AdminCollectionTrait {

  val admin_e: Option[AdminM]
  def oAdminAsObj: AdminM = admin_e.get
  def vTuple: (String, String) // visual identifier used in all html collection tables in admin

  def ccToJsonStr2(oDoc: Option[SuperVarT]): Option[String] = oDoc match {
    case Some(_) =>
      oDoc.map(doc => {
        val jsVal = Json.toJson(doc)
        Json.stringify(jsVal("data"))
      })
    case None => None
  }

}

object SuperVarT extends ReadAndWriteTrait {

  val adminFormData: Mapping[Option[AdminM]] = {

    optional(mapping(
      "_id" -> ignored(Option.empty[BSONObjectID]),
      "adminCreatedId" -> optional(number),
      "dateCreated" -> optional(date),
      "adminModifiedId" -> optional(number),
      "lastModified" -> optional(date)
    )(AdminM.apply)(AdminM.unapply))

  }

  implicit val ctyMFormat: OFormat[CtyM] = Json.format[CtyM]
  implicit val superVarTFormat: OFormat[SuperVarT] = Json.format[SuperVarT]

  def apply(`class`: String, data: JsValue): SuperVarT = {
    (`class` match {
      case "CtyM" => Json.fromJson[CtyM](data)(ctyMFormat)
      case _ => Json.fromJson[CtyM](data)(ctyMFormat)
    }).get
  }

  def unapply(varData: SuperVarT) = {
    val (prod: Product, sub) = varData match {
      case ctyM: CtyM => (ctyM, Json.toJson(ctyM)(ctyMFormat))
      case u: SuperVarT => (u, Json.toJson(u)(superVarTFormat))
    }
    Some(s"varData_e.${prod.productPrefix}" -> sub) // todo - remove "varData_e." here??
  }

}


trait AllCollectionsTrait extends DateTransformTrait {

  // data types - id (BSONObjectID)
  def idAsBsonId(oId: Option[BSONObjectID]) = oId.get

  def idAsString(oId: Option[BSONObjectID]) = idAsBsonId(oId).stringify

  def idAsStringLast6(oId: Option[BSONObjectID]) = {
    val idString = idAsString(oId)
    idString.substring(idString.length - 6)
  }

}

trait StringTransformTrait {

  // data types - lists
  def strList2String(oList: Option[List[String]]): String = oList.getOrElse(List()).mkString(", ")
  def intList2String(oList: Option[List[Int]]): String = strList2String(Some(oList.getOrElse(List()).map(x => x.toString)))
  def filterEmptyStringList(list: List[String]): List[String] = list.filter(_.nonEmpty)

  def bson2str(id: BSONObjectID): String = id.stringify
  def str2bson(idString: String): BSONObjectID = BSONObjectID.parse(idString).get

}

trait DateTransformTrait {

  // data types - date/time
  def simpleDateFormat(format: String) = new java.text.SimpleDateFormat(format)

  def dateFormat = simpleDateFormat("yyyy-MM-dd")
  def dateTimeFormat = simpleDateFormat("yyyy-MM-dd HH:mm:ss")

  def date2String(oDate: Option[Date], format: SimpleDateFormat = dateFormat): String = format.format(Date.from(Instant.ofEpochMilli(oDate.getOrElse(new Date()).getTime)))

  def str2Date(dateStr: String): Option[Date] = {

    val date = dateFormat.parse(dateStr)

    date match {
      case d: Date => Some(date)
      case _ => None
    }

  }

  def date2DateTime(oDate: Option[Date]): Option[DateTime] = {

    oDate.map(x =>

      DateTime.parse(
        date2String(oDate)
      )

    )

  }

  def getSouthernHemisphereSeasonFormat(oDate: Option[Date]): String = date2String(oDate, simpleDateFormat("YYYY"))

  def getNorthernHemisphereSeasonFormat(oDate: Option[Date]): String = {

    val firstYear: String = getSouthernHemisphereSeasonFormat(oDate)
    val secondYear: String = (firstYear.toInt + 1).toString.substring(0, 2)
    List(firstYear, secondYear).mkString("/")

  }

  def getSeasonOpts(numOfYears: Int, oDate: Option[Date] = Some(new Date())): List[Int] = {

    val seasonFormat = getSouthernHemisphereSeasonFormat(oDate).toInt + 1
    List.range(seasonFormat - numOfYears, seasonFormat).reverse

  }

  def getDateDiff(startDate: Date, endDate: Date, timeUnit: TimeUnit): Long = {
    val diffInMillies = endDate.getTime() - startDate.getTime
    timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS)
  }

  def date2Long(oDate: Option[Date]): Option[Long] = {

    oDate match {

      case Some(_) => Some(

        new DateTime(oDate.get.getTime())
          .withZoneRetainFields(DateTimeZone.UTC)
          .withZone(DateTimeZone.getDefault())
          .getMillis

      )

      case _ => None
    }

  }

  def dateStr2Long(dateStr: String): Option[Long] = {
    val parseDate = str2Date(dateStr)
    date2Long(parseDate)
  }

  def str2MongoDate(dateStr: String, dateFieldName: String): JsObject = {
    val oLongDate: Option[Long] = dateStr2Long(dateStr)

    Json.obj(s"$$$dateFieldName" -> JsNumber(oLongDate.get))
  }

  def getMongoDateRange(fromDate: String, toDate: String, dateFieldName: String): JsObject = {

    val fromDateJsObj = str2MongoDate(fromDate, dateFieldName)
    val toDateJsObj = str2MongoDate(toDate, dateFieldName)

    Json.obj("date" -> Json.obj("$gte" -> fromDateJsObj, "$lt" -> toDateJsObj))

  }

  def getNowDate: Option[Date] = Some(new Date())

  def getYearStartDate(oDate: Option[Date] = getNowDate): Option[Date] = {
    str2Date(date2String(oDate, dateTimeFormat))
  }

  def date2Date(oDate: Option[Date]): Option[Date] = oDate
  def date2NowDate(oDate: Option[Date]): Option[Date] = getNowDate

}

trait TransformersTrait extends JsTransformTrait with StringTransformTrait with DateTransformTrait {

  def defaultAdminModifiedId(oAdminId: Option[Int]): Option[Int] = Some(1) // todo - change when set-up admin session

}

trait JsTransformTrait {

  def tryTransformer(obj: JsObject, transformer: Reads[JsObject]) = {

    obj.transform(transformer) match {
      case JsSuccess(r: JsObject, _) => r
      case e: JsError => JsError.toJson(e)
    }

  }

}

trait AdminCollectionTrait {

  // layout
  def oddOrEvenTableRow(num: Int): String = num match {
    case x if((x % 2)==0) => "odd"
    case _ => "even"
  }

  // content
  def getTitle(action: String, collectionName: String): String = s"""$collectionName collection"""

  def getFormValues(action: String, value: String, inputType: String = "input"): String = action match {
    case "Edit" => value
    case _ => ""
  }

}

trait NumbersFormattingTrait {

  def roundBy(num: Double)(dp: Int): String = s"%1.${dp}f".format(num)

}

trait ReadAndWriteTrait {

  implicit val dateRead: Reads[Date] = (__ \ "$date").read[Long].map { date =>
    new Date(date)
  }

  implicit val dateRead2: Reads[JsObject] = (__ \ "date").read[Long].map { date =>
    Json.obj("$date" -> JsNumber(date))
  }

  implicit val dateWrite: Writes[Date] = new Writes[Date] {
    def writes(date: Date): JsValue = Json.obj(
      "$date" -> JsNumber(date.getTime)
    )
  }

  implicit val dateWrite2: Writes[Long] = new Writes[Long] {
    def writes(long: Long): JsValue = Json.obj(
      "$date" -> JsNumber(long)
    )
  }

}

trait SelectOptionsTrait {

  def getOpts: Option[Map[String, Seq[(String, String)]]] = None // default no options for select inputs

  def getAllOpts(optsMap: Map[String, Seq[Any]]): Map[String, Seq[(String, String)]] = optsMap map {

    case (key, value) => value match {

      case seq: Seq[_] => (key, seq.map(x =>

        x match {
          case s: String => s -> s
          case i: Int => i.toString -> i.toString
          case d: Double => d.toString -> d.toString
          case (a: String, b: String) => a -> b
          // todo - error handling here ??
        }

      ))
      // todo - error handling here ??
    }

  }

  def getRatingsList10: Seq[Int] = List.range(1, 11)

}

trait DoubleTrait {

  def betweenZeroAndOne(num: Double): Double = num match {
    case num if(num < 0) => 0
    case num if(num > 1) => 1
    case _ => num
  }

  def double2double(num: Double): Double = num

}