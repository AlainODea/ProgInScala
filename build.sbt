name := "ProgInScala"

version := "1.0"

organization := "com.verafin"

scalaVersion := "2.9.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.4.1" withJavadoc() withSources()

libraryDependencies += "org.scala-tools.testing" %% "specs" % "1.6.8" withSources()

libraryDependencies += "org.scala-tools.testing" %% "scalacheck" % "1.9" withJavadoc() withSources()

libraryDependencies += "junit" % "junit" % "4.8.2" withJavadoc() withSources()

libraryDependencies += "org.testng" % "testng" % "6.0.1" withJavadoc() withSources()