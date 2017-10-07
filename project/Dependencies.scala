import sbt.Keys.libraryDependencies
import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  lazy val gatling = "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.0"
  lazy val gatlingTest = "io.gatling" % "gatling-test-framework" % "2.3.0"
}
