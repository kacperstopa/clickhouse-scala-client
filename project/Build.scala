import sbt._

object Build {

  val PekkoVersion     = "1.0.1"  // do *not* upgrade to 2.7+ (commercial license)
  val PekkoHttpVersion = "1.0.0" // do *not* upgrade to 10.4+ (commercial license)

  val testDependencies = Seq("org.scalatest" %% "scalatest" % "3.2.15",
                             "org.apache.pekko" %% "pekko-testkit"  % PekkoVersion,
                             "ch.qos.logback"   % "logback-classic" % "1.4.6")
}
