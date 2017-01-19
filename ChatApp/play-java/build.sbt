name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"
libraryDependencies += filters

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
	"com.google.code.gson" % "gson" % "1.7.1"
)

fork in run := true