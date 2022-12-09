package arrayss

object ReadCSV extends App {

  val currentDirectory = new java.io.File(".").getCanonicalPath
  println(">>> " + currentDirectory)

  val curdir = System.getProperty("user.dir")
  println(s"user.dir: "+ curdir)

  // val source = scala.io.Source.fromFile("data.csv")  // file in project folder
  // read file from resources directory
  val source = scala.io.Source.fromFile(currentDirectory+"/src/main/resources/data.csv")

  val data = source.getLines.map(_.split("\t")).toArray
  source.close

  for (row <- data) {
    for (col <- row ) {
      printf(col + ",")
    }
    print("\n")
  }
}
