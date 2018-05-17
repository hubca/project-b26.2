package services

import javax.inject.Inject

import akka.stream.Materializer
import play.api.libs.json._

import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.ws._


//@Singleton
class CallClient @Inject() (ws: WSClient)(implicit exec: ExecutionContext, mat: Materializer) {

  def makeCall(queryType: String, url: String, oDocJSO: Option[JsObject]): Future[WSResponse] = queryType match {

    case "c" => ws.url(url).post(oDocJSO.get)
    case "r" => ws.url(url).get()
    case "u" => ws.url(url).put(oDocJSO.get)
    case "d" => ws.url(url).delete()
    case _ => ws.url(url).get() // todo - parse error here **

  }

  def makeCallGet(url: String): Future[WSResponse] = ws.url(url).get()
  def makeCallPost(url: String, docJSO: JsObject): Future[WSResponse] = ws.url(url).post(docJSO)
  def makeCallPut(url: String, docJSO: JsObject): Future[WSResponse] = ws.url(url).put(docJSO)
  def makeCallDelete(url: String): Future[WSResponse] = ws.url(url).delete()

  //def makePutCall(url: String, data: JsValue): Future[WSResponse] = ws.url(url).put(data)//.get()

  // todo - make admin and main site separation
  def makeServiceCall(inputSource: String)(serviceName: String): Future[String] = {
    makeCallGet(s"http://localhost:9000/admin/api/$inputSource/$serviceName").map(_.body)
  }

  // NEEDED ?
  def mapCall[T](url: String)(implicit reads: Reads[T]): Future[JsResult[T]] = {
    makeCallGet(url).map { response =>
      val jsonString = response.json
      Json.fromJson[T](jsonString)
    }
  }

  // NEEDED ???
  def makeServiceCall2(collName: String): Future[String] = {
    makeCallGet(s"http://localhost:9000/admin/rest/db/getAll/$collName").map(_.body)
  }

  // NEEDED ???
  def mapCall2(collName: String, idStr: String)(implicit reads: Reads[JsObject]): Future[JsResult[JsObject]] = {
    makeCallGet(s"http://localhost:9000/admin/rest/db/getAll/$collName/5a3bda2287c04c4bd2aa121b").map { response =>
      val jsonString = response.json
      Json.fromJson[JsObject](Json.toJson(jsonString))
    }
  }

}
