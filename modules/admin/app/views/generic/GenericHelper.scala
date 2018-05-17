package views.generic

object GenericHelper {

  def isActive(idx: Int, oActiveTabIdx: Option[Int], suffix: String = ""): String = idx match {
    case idx if ((oActiveTabIdx.getOrElse(1) - 1) == idx) => "active" + suffix
    case _ => ""
  }

  def getCollapseAttributes(collapseId: String):String = {
    if(collapseId!="") { s" data-toggle=collapse data-target=#$collapseId" }
    else { "" }
  }

}