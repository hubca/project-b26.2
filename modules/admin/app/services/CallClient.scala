package services

import javax.inject.Inject
import akka.stream.Materializer
import play.api.libs.json._
import play.api.libs.ws._
import scala.concurrent.{ExecutionContext, Future}


class CallClient @Inject() (ws: WSClient)(implicit exec: ExecutionContext, mat: Materializer) {

  def makeCall(queryType: String, url: String, oDocJSO: Option[JsObject]): Future[WSResponse] = queryType match {

    case "c" => makeCallPost(url)(oDocJSO)
    case "r" => makeCallGet(url)
    case "u" => makeCallPut(url)(oDocJSO)
    case "d" => makeCallDelete(url)
    case _ => ws.url(url).get() // todo - parse error here **

  }

  def makeCallGet(url: String): Future[WSResponse] = ws.url(url).get()
  def makeCallPost(url: String)(oDocJSO: Option[JsObject]): Future[WSResponse] = ws.url(url).post(oDocJSO.get)
  def makeCallPut(url: String)(oDocJSO: Option[JsObject]): Future[WSResponse] = ws.url(url).put(oDocJSO.get)
  def makeCallDelete(url: String): Future[WSResponse] = ws.url(url).delete()

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

}