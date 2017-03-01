import akka.actor.ActorSystem
import akka.cluster.Cluster
import akka.cluster.http.management.ClusterHttpManagement

object Main extends App {

  implicit val system = ActorSystem("minimal")

  ClusterHttpManagement(Cluster(system)).start()

}
