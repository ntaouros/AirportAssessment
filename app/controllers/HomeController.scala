package controllers

import javax.inject._

import models.Country
import play.api._
import play.api.mvc._
import zamblauskas.csv.parser._
import scala.reflect.io.File
import com.typesafe.config.ConfigFactory
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    val file= scala.io.Source.fromFile("conf/countries.csv").mkString
//    println(Parser.parse[Country](file))
    Ok(views.html.index())
  }
}
