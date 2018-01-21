package models

import zamblauskas.csv.parser._
import zamblauskas.functional._

case class Country(id:Int,code:String,name:String,continent:String,wikipedia_link:String,keywords:String) {
    implicit val personReads: ColumnReads[Country] = (
        column("id").as[Int] and
        column("code").as[String] and
        column("name").as[String] and
        column("continent").as[String] and
        column("wikipedia_link").as[String] and
        column("keywords").as[String]
    ) (Country)
}

