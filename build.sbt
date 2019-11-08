name := "play-jsonpath"

organization := "com.josephpconley"

version := "2.6.0-SNAPSHOT"

scalaVersion := "2.12.3"

crossScalaVersions := Seq("2.12.3")

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-json" % "2.6.0",
	"io.gatling" %% "jsonpath" % "0.6.9",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

publishMavenStyle := true

publishArtifact in Test := false


credentials += Credentials("Artifactory Realm", "artifactory.cerno.dk", sys.env.get("ARTIFACTORY_USERNAME").mkString, sys.env.get("ARTIFACTORY_PASSWORD").mkString)
resolvers +=
  "Artifactory" at "https://artifactory.cerno.dk/artifactory/cerno/"
publishTo := Some("Artifactory Realm" at "https://artifactory.cerno.dk/artifactory/cerno;build.timestamp=" + new java.util.Date().getTime)

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/josephpconley/play-jsonpath"))

pomExtra := (
    <scm>
      <url>git@github.com:josephpconley/play-jsonpath.git</url>
      <connection>scm:git:git@github.com:josephpconley/play-jsonpath.git</connection>
    </scm>
    <developers>
      <developer>
        <id>josephpconley</id>
        <name>Joe Conley</name>
        <url>http://www.josephpconley.com</url>
      </developer>
    </developers>)
