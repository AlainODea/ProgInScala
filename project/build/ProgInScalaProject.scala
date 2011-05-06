import sbt._

class ProgInScalaProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  val scalaTest = "org.scalatest" % "scalatest" % "1.3"
  val junit = "junit" % "junit" % "4.8.2"
  val testng = "org.testng" % "testng" % "6.0.1"
}