package api

object MapDemo {
  def main(args: Array[String]) {
    val apis = Map("firstApi" -> "Scala", "secondApi" -> "Java", "3rdApi" -> "Python", "fourthApi" -> "R")

    val numbers: Map[Int, Int] = Map()

    println( "Keys in apis : " + apis.keys )
    println( "Values in apis : " + apis.values )
    println( "Check if apis is empty : " + apis.isEmpty )

    val nativeApi = apis.get("firstApi")
    println("Native Api =-->" + nativeApi)
    println( "Check if nums is empty : " + numbers.isEmpty )
  }
}