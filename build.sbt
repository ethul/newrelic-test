name := "test1"

version := "1.0-SNAPSHOT"


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  filters,
  "com.newrelic.agent.java" % "newrelic-agent" % "3.4.2"
)

play.Project.playScalaSettings
