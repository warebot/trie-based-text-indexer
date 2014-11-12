name := "trie"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

val mavenLocal = "Local Maven" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

resolvers += Resolver.mavenLocal

libraryDependencies +="com.typesafe.akka" % "akka-actor_2.10" % "2.4-SNAPSHOT"


