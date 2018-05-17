package models.db

import java.util.Date
import play.api.data.{Form, Mapping}
import play.api.data.Forms.{date, list, optional, _}
import reactivemongo.bson.BSONObjectID
import play.api.data.format.Formats._
import play.api.libs.json.OFormat
import play.api.libs.json._
import reactivemongo.play.json.BSONFormats.BSONObjectIDFormat


trait SuperAdminT

object SuperAdminT {

  implicit val adminMFormat: OFormat[AdminM] = Json.format[AdminM]

  def apply(data: JsValue): AdminM = {
    Json.fromJson[AdminM](data)(adminMFormat).get
  }

  def unapply(data: AdminM) = {
    val (prod: Product, sub) = (data, Json.toJson(data)(adminMFormat))
    Some(s"${prod.productPrefix}" -> sub)
  }

}

// todo all Dates are currently one hour behind what is inputted - so format time correctly according to uk (for admin)
case class AdminM(_id: Option[BSONObjectID], adminCreatedId: Option[Int] = Some(1), dateCreated: Option[Date] = Some(new Date()),
                  adminModifiedId: Option[Int] = Some(1), lastModified: Option[Date] = Some(new Date())
                 ) extends SuperAdminT with AllCollectionsTrait with ReadAndWriteTrait with AdminCollectionTrait with StringTransformTrait {

  def adminCreatedIdAsString = adminCreatedId.get
  def dateCreatedAsString = date2String(dateCreated, format = dateTimeFormat)
  def adminModifiedIdAsString = adminModifiedId.get
  def lastModifiedAsString = date2String(lastModified, format = dateTimeFormat)

  
}

object AdminM extends SuperAdminT with ReadAndWriteTrait {

  implicit val adminMFormat: OFormat[AdminM] = Json.format[AdminM] // todo - remove if never needed

  def getAdminAsJSO(queryType: String): JsObject = {
    val oAdminModifiedId = Some(1) // same as adminCreatedId for now - todo hook up admin id (in session?)

    val adminM = queryType match {
      case "u" => AdminM(None, None, None, oAdminModifiedId, Some(new Date()))
      case _ => AdminM(None, oAdminModifiedId, Some(new Date()), oAdminModifiedId, Some(new Date()))
    }
    Json.toJsObject(adminM)
  }

}

//-- collections --\\
case class CtyM(countryName: String = "", countryCode: Option[String] = None, continent: Option[String] = None,
                 hemisphere: Option[String] = None, languagesArr: Option[List[String]] = None, currencyCode: Option[String] = None,
                 admin_e: Option[AdminM]
                ) extends SuperVarT with AllCollectionsTrait with ReadAndWriteTrait with AdminCollectionTrait with StringTransformTrait {

  override def vTuple = ("country name" -> countryName) // visual identifier used in all html collection tables in admin

  def getDocsTabList = ???

  def oCountryCodeAsString = countryCode.getOrElse("")
  def oContinentAsString = continent.getOrElse("")
  def oHemisphereAsString = hemisphere.getOrElse("")
  def oCurrencyCodeAsString = currencyCode.getOrElse("")
  def oLanguagesArrAsString = strList2String(languagesArr)

}

object CtyM extends SuperFormT with ReadAndWriteTrait with SelectOptionsTrait {

  val tabNames: Option[List[String]] = Some(List("Main", "Admin"))//None

  // options for select inputs (dropdowns)
  val continentList: List[String] = List("Africa", "Antarctica", "Asia", "Europe", "North America", "South America")
  val hemisphereList: List[String] = List("Northern", "Southern")

  implicit val adminMFormat: OFormat[AdminM] = Json.format[AdminM]
  implicit val ctyMFormat: OFormat[CtyM] = Json.format[CtyM]

  // arrange select input options
  override def getOpts: Option[Map[String, Seq[(String, String)]]] = {

    val optsMap = Map(
      "continents" -> continentList,
      "hemispheres" -> hemisphereList
    )

    val opts = getAllOpts(optsMap)
    Some(opts)

  }

  val form = Form(
    mapping(
      "countryName" -> nonEmptyText,
      "countryCode" -> optional(text),
      "continent" -> optional(text),
      "hemisphere" -> optional(text),
      "languagesArr" -> optional(
        list(text).transform(filterEmptyStringList, filterEmptyStringList)
      ),
      "currencyCode" -> optional(text),
      "admin_e" -> adminFormData
    )(CtyM.apply)(CtyM.unapply)
  )

  def getMyFormAndData_tup(queryType: String, oDocs: Option[Seq[CtyM]], oId: Option[BSONObjectID]) = queryType match {

    case "u" => {
      val oDoc = oDocs.get.find(_.oAdminAsObj._id.get == oId.get)
      val updateForm = form.fill(oDoc.get)
      (updateForm, this.ccToJsonStr(oDoc))
    }
    case _ => (form, None)

  }

}