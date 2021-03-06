
name := "akka-http-sample-scala"

version := "0.1"

scalaVersion := "2.12.5"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.0",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.0",
  "com.typesafe.akka" %% "akka-stream" % "2.5.11"
)

