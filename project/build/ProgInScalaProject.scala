import sbt._

class ProgInScalaProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  val scalaTest = "org.scalatest" % "scalatest" % "1.3" withSources()
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.7.2" withSources()
  val junit = "junit" % "junit" % "4.8.2" withSources()
  val testng = "org.testng" % "testng" % "6.0.1" withSources()
}
