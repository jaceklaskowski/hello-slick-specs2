name := """slick-sandbox"""

version := "1.0"

scalaVersion := "2.11.4"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.7.7",
  "com.h2database" % "h2" % "1.4.182",
  "org.specs2" %% "specs2" % "2.4.13" % "test"
)