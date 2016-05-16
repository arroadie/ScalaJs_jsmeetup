package JsChile

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
  * Says Hello
  */
@JSExport
object HelloWorld extends JSApp {

  @JSExport
  def main: Unit = {
    println("HELLO WORLD")
  }

}
