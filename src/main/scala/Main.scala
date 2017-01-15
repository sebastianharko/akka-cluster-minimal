import akka.actor.ActorSystem

object Main extends App {

  implicit val system = ActorSystem("minimal")

}
