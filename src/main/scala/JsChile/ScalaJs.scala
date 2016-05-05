package JsChile

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

import org.scalajs.dom
import dom.document

/**
  * Clase básica para el tuto de ScalaJs
  */
@JSExport
object BasicStep extends JSApp {

  @JSExport
  def main: Unit = {
    println("Javascript Chile - Bienvenidos")
    document.body.appendChild(document.createTextNode("Hola"))
  }

  @JSExport
  def alReves(recibe: String) : String = {
    recibe.reverse
  }

  @JSExport
  def rompePalabra(recibe: String) : Array[String] = {
    recibe.split("")
  }

  @JSExport
  def getNewPersona(nombre: String, apellido: String, edad: Int): Persona = {
    new Persona(nombre, apellido, edad)
  }

}

@JSExport
class Persona(nombre: String, apellido: String, edad: Int) {
  val nombreCompleto: String = s"$nombre $apellido, $edad"
  val amigos = getAmigos

  @JSExport
  def getAmigos = {
    List[String](nombre, nombre, nombre, nombre)
  }
}