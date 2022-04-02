
ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "$scalaVersion$"

lazy val root = (project in file(".")).
  settings(
    name := "$name$"
  )
