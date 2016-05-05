package JsChile

import scala.scalajs.js.JSApp

import org.scalajs.dom
import dom._

import scala.scalajs.js.annotation.JSExport

/**
  * Created by thiago on 5/5/16.
  */
@JSExport
object TouchingTheDom extends JSApp {

  @JSExport
  def main: Unit = {
    document.body.appendChild(document.createTextNode("Directamente al document"))
    val node = document.createElement("img")
    node.setAttribute("src", "img/me_so_funny.gif")
    document.body.appendChild(node)
  }

}
