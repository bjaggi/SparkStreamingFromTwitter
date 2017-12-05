name := "SparkStreamingFromTwitter"

version := "0.1"

scalaVersion := "2.11.8"
//val sparkVersion = "1.6.1"

//libraryDependencies ++=Seq(
//  "org.apache.spark" %% "spark-core" % sparkVersion,
//  "org.apache.spark" %% "spark-streaming" % sparkVersion,
//  "org.apache.spark" %% "spark-sql" % sparkVersion,
//  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion,
//
//)


// With Park 2.2 above was spark 1.6
val sparkVersion = "2.2.0"
val twitterForsparkVersion = "1.6.1"
resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,

//"org.apache.spark" %% "spark-streaming-twitter" % twitterForsparkVersion,

   "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.0"

)

