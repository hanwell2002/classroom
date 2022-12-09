package arrays

object ArrayExample extends App {


  // allocating memory of 1D Array of string.
  val essential = Array("Food", "House", "Car", "Travel")

  println(">> The second element of the array: " + essential(1))

  var arrayname = new Array[String](5)

  arrayname(0) = "Tree"
  arrayname(1) = "Flower"
  arrayname(2) = "Fruit"
  arrayname(3) = "Melon"
  arrayname(4) = "Tree"

  arrayname.foreach(println )



}
