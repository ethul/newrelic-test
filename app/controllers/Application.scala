package controllers

import scala.concurrent.Future

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("")
  }

  def indexOne = Action {
    Ok("One")
  }

  def indexTwo = Action {
    Ok("Two")
  }

  def options(path: String) = Action.async {
    Future.successful(NoContent)
  }

}
