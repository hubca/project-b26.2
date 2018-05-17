package views.generic.form

object FormHelper {

  /*
  def getPlace(text: String): String = {
    "fds"
  }
  */

  def getPlaceholder(text: String): String = {

    text match {
      case text if text.contains("date") => "e.g. 2017-11-22"
      case text if text.contains("bson") => "e.g. 59ea36d3fdc2ce3d73c4be94"
      case _ => ""
    }
  }

  def getFormActionLabel(actionInitial: String): String = actionInitial match {
    case "u" => "update"
    case _ => "create"
  }

}