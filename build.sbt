import play.sbt.routes.RoutesKeys
import sbt.Keys.libraryDependencies


// todo - check 2.11.8 for integration with Spark?
name := "project-b26.2"

val moreLibDependencies = Seq(guice, ws)

lazy val admin = (project in file("modules/admin")).enablePlugins(PlayScala).settings(
  Common.settings,
  routesImport ++= Seq("services.CustomBinders._", "reactivemongo.bson.BSONObjectID"),
  libraryDependencies ++= moreLibDependencies
)

lazy val root = (project in file("."))
  .settings(
    Common.settings,
    libraryDependencies ++= moreLibDependencies
  )
  .enablePlugins(PlayScala).dependsOn(admin).aggregate(admin)
