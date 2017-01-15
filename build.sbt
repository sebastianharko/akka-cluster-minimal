name := "minimal-cluster"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.4.16"

libraryDependencies += "com.lightbend.akka" %% "akka-management-cluster-http" % "0.1-RC1"
