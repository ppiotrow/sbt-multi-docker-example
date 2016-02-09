import com.typesafe.sbt.SbtNativePackager._
import com.typesafe.sbt.packager.Keys._
import sbt.Keys._

object Settings {
  lazy val common = Seq(
    organization := "com.example",
    version := "1.0",
    scalaVersion := "2.11.7",
    scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8"),
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"))
}

object GooApiDocker {
  val settings = Seq(
    dockerBaseImage := "java:8",
    dockerExposedPorts := Seq(8088),
    dockerRepository := Some("docker.example.com/some_group"),
    packageName in Docker := name.value + "-docker",
    dockerUpdateLatest := true,
    version in Docker := "prod",
    defaultLinuxInstallLocation in Docker := s"/opt/${name.value}")
}

object FooJobDocker {
  val settings = Seq(
    dockerBaseImage := "java:8",
    dockerRepository := Some("docker.example.com/some_group"),
    packageName in Docker := name.value + "-docker",
    dockerUpdateLatest := true,
    version in Docker := "prod",
    defaultLinuxInstallLocation in Docker := s"/opt/${name.value}")
}
