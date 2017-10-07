import Dependencies._

name := "gatling-quickstart"
organization := "com.stelmod"
version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.3"

libraryDependencies += gatling
libraryDependencies += scalaTest % Test
libraryDependencies += gatlingTest % Test

enablePlugins(GatlingPlugin)

