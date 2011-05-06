import sbt._

class ProgInScalaProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  val scalaTest = "org.scalatest" % "scalatest" % "1.3"
}