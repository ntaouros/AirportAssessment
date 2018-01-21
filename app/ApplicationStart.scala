import javax.inject.{Inject, Singleton}

import com.google.inject.AbstractModule
import models.Country
import play.api.inject.ApplicationLifecycle
import zamblauskas.csv.parser._

class Module extends AbstractModule {
  def configure(): Unit = bind(classOf[SystemGlobal]).asEagerSingleton()
}

@Singleton
class SystemGlobal @Inject()(appLifecycle: ApplicationLifecycle) {
  def initialize(): Unit = {

    val file= scala.io.Source.fromFile("conf/countries.csv").mkString
        println(Parser.parse[Country](file))

  }

  initialize()
}