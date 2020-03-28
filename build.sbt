

name := "TwitterPopularTags"

version := "0.1"


scalaVersion := "2.11.8"
val sparkVersion = "1.5.2"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % sparkVersion
libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.11" % sparkVersion
libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.3"
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3"
libraryDependencies += "org.twitter4j" % "twitter4j" % "3.0.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

resolvers ++= Seq(
  "Twitter4J Repository" at "http://twitter4j.org/maven2/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

unmanagedBase := baseDirectory.value / "custom_lib"
