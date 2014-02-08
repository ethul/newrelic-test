package controllers

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._

import play.api._
import play.api.mvc._

object Test extends Controller {

  def index = Action.async {
    Future(Ok("async"))
  }

}
