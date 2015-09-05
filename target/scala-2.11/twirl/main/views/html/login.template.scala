
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!--"""),_display_(/*3.6*/main("Welcome to Play")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

    """),_display_(/*5.6*/play20/*5.12*/.welcome(message, style = "Java")),format.raw/*5.45*/("""

""")))}),format.raw/*7.2*/("""-->
"""),_display_(/*8.2*/main("hahaha")/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
    """),_display_(/*9.6*/play20/*9.12*/.welcome(message, style = "Scala")),format.raw/*9.46*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 15:02:02 CST 2015
                  SOURCE: D:/workspace/workspace_self/note-play/app/views/login.scala.html
                  HASH: d889428bca5dcb5679e094fddf7ea80ea2fd0edc
                  MATRIX: 745->1|857->18|885->20|915->25|946->48|985->50|1017->57|1031->63|1084->96|1116->99|1146->104|1168->118|1206->119|1237->125|1251->131|1305->165|1337->167
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10
                  -- GENERATED --
              */
          