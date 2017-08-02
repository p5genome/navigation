name := "navigation"

version := "2017.8.2-beta"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.11"

val scala212 = "2.12.2"

scalaVersion := scala212

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

//Dependencies
libraryDependencies += "p5genome-sri" %%% "universal" % "2017.8.1-beta" % Provided
libraryDependencies += "scalajs-react-interface" %%% "core" % "2017.4.23-beta" % Provided

//bintray
resolvers += Resolver.jcenterRepo
resolvers += "Maven Repository on Github" at "https://p5genome.github.io/universal/repo/"

organization := "p5genome-sri"

publishTo := Some(Resolver.file("navigation", file("repo"))(Patterns(true, Resolver.mavenStyleBasePattern)))

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

publishArtifact in Test := false

//Test
resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test
scalaJSStage in Global := FastOptStage
