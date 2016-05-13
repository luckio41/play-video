
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Luckio/PlayVideo/conf/routes
// @DATE:Thu May 12 18:00:19 CLT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
