package views

import play.api.data.Form

object ViewHelper {

  //def getPolyForm[T <: Any](thisType: T): Form[T]
  //def getPolyForm[T <: Any](trace: ImmutableSortedMap[OffsetDateTime, Option[T]], renderer: (T) => Html): Html =

  def getAllCollections: Seq[String] = List("cty", "our2", "rgn", "rst", "scr") // ** todo - move to collection trait OR add collections here

  def getSidebarNavigationContent: Map[String, Seq[String]] = {
    Map("dbCollectionNames" -> getAllCollections)
  }

  def getCollapseAttributes(collapseId: String):String = {
    if(collapseId!="") { s" data-toggle=collapse data-target=#$collapseId" }
    else { "" }
  }

  def camelize(text: String): String = {

    def _camelize(oldLetterList: List[String], capitalisedText: String = "", thisCamelCaseBool: Boolean = false): String = {

      oldLetterList match {

        case Nil => capitalisedText.trim.replaceAll(" ", "")
        case x :: xs =>

          val thisX = thisCamelCaseBool match {
            case true => x.toUpperCase
            case false => x
          }

          val nextCamelCaseBool = thisX match {
            case " " => true
            case _ => false
          }

          _camelize(xs, capitalisedText + thisX, nextCamelCaseBool)
      }
    }

    val letterList = text.toList.map(x => x.toString)
    _camelize(letterList)

  }

}