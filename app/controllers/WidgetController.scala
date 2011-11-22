package controllers
 
import play._
import play.mvc._
 
object WidgetController extends Controller {
 
    import views.Widget._
    import models.Widget
 
    def list = {
        val widget1 = Widget(1, "The first Widget")
        val widget2 = Widget(2, "A really special Widget")
        val widget3 = Widget(3, "Just another Widget")
        html.list(Vector(widget1, widget2, widget3))
    }
 
}
