
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 12:08:49 BST 2018


package admin {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
