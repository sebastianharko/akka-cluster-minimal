import akka.actor.ActorSystem
import akka.management.AkkaManagement

object Main extends App {

  implicit val system = ActorSystem("minimal")

  AkkaManagement(system).start()

}
