import sbt._

val nameApp = "jsoup-should-matchers"

lazy val simpleReactiveMongo = Project(nameApp, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    scalaVersion := "2.11.12",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    resolvers += Resolver.jcenterRepo,
    crossScalaVersions := Seq("2.11.12", "2.12.6"),
    makePublicallyAvailableOnBintray := true,
    majorVersion := 0
  ).settings(scoverageSettings)

lazy val scoverageSettings: Seq[Setting[_]] = Seq(
  coverageEnabled := true,
  coverageExcludedPackages := List("<empty>").mkString(";"),
  coverageMinimum := 42, // TODO raise coverage
  coverageFailOnMinimum := true,
  coverageHighlighting := true,
  parallelExecution in Test := false
)