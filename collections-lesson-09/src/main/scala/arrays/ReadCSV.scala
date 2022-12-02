package arrays

object ReadCSV extends App {

  val source = scala.io.Source.fromFile("G:\\data\\data.csv")
  val data = source.getLines.map(_.split("\t")).toArray
  source.close

  for (row <- data) {
    for (col <- row ) {
      printf(col + ",")
    }
    print("\n")
  }
}
