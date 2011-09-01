import sbt._
import sbt.{Build => SbtBuild}

object Build extends SbtBuild {
  lazy val progInScala = Project("Programming in Scala 2nd Edition", file(".")) aggregate(
    chapter01, chapter02, chapter03, chapter04, chapter05, chapter06, chapter07, chapter08, chapter09, chapter10,
    chapter11, chapter12, chapter13, chapter14, chapter15, chapter16, chapter17, chapter18, chapter19)

  lazy val chapter01 = Project("A Scalable Language", file("Chapter_01"))
  lazy val chapter02 = Project("First Steps in Scala", file("Chapter_02"))
  lazy val chapter03 = Project("Next Steps in Scala", file("Chapter_03"))
  lazy val chapter04 = Project("Classes and Objects", file("Chapter_04"))
  lazy val chapter05 = Project("Basic Types and Operations", file("Chapter_05"))
  lazy val chapter06 = Project("Functional Objects", file("Chapter_06"))
  lazy val chapter07 = Project("Built-in Control Structures", file("Chapter_07"))
  lazy val chapter08 = Project("Functions and Closures", file("Chapter_08"))
  lazy val chapter09 = Project("Control Abstraction", file("Chapter_09"))
  lazy val chapter10 = Project("Composition and Inheritance", file("Chapter_10"))
  lazy val chapter11 = Project("Scala's Hierarchy", file("Chapter_11"))
  lazy val chapter12 = Project("Traits", file("Chapter_12"))
  lazy val chapter13 = Project("Packages and Imports", file("Chapter_13"))
  lazy val chapter14 = Project("Assertions and Unit Testing", file("Chapter_14"))
  lazy val chapter15 = Project("Case Classes and Pattern Matching", file("Chapter_15"))
  lazy val chapter16 = Project("Working with Lists", file("Chapter_16"))
  lazy val chapter17 = Project("Collections", file("Chapter_17"))
  lazy val chapter18 = Project("Stateful Objects", file("Chapter_18"))
  lazy val chapter19 = Project("Type Parameterization", file("Chapter_19"))
}
