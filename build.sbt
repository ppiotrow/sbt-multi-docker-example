lazy val job = Project("job", file("job"))
  .settings(
    name := "foo-job",
    mainClass in Compile := Some("com.example.job.Main")
  )
  .settings(Settings.common: _*)
  .settings(FooJobDocker.settings)
  .enablePlugins(JavaAppPackaging, DockerPlugin)
  .dependsOn(common)
  
lazy val api = Project("api", file("api"))
  .settings(
    name := "goo-api",
    mainClass in Compile := Some("com.example.api.Main")
  )
  .settings(Settings.common: _*)
  .settings(GooApiDocker.settings)
  .enablePlugins(JavaAppPackaging, DockerPlugin)
  .dependsOn(common)

lazy val common = Project("common", file("common"))
  .settings(
    name := "common-toolkit"
  )
  .settings(Settings.common: _*)

lazy val multiDocker = Project("multi-docker", file("."))
  .settings(Settings.common: _*)
  .aggregate(job, api)