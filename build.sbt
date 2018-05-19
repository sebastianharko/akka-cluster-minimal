name := "minimal-cluster"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.12" 

libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.12"

libraryDependencies += "com.lightbend.akka.management" %% "akka-management" % "0.13.1"

libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-http" % "0.13.1"
