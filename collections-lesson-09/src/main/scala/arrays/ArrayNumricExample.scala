package arrays

object ArrayNumricExample extends App {

  var myArray = Array(1.9, 2.9, 3.4, 3.5)
  // Print all the array elements
  for (x <- myArray) {
    println(x)
  }

  // Summing all elements
  var total = 0.0;
  for (i <- 0 to (myArray.length - 1)) {
    total += myArray(i);
  }
  println("Total is " + total);

  // Finding the largest element
  var max = myArray(0);

  for (i <- 1 to (myArray.length - 1)) {
    if (myArray(i) > max) max = myArray(i);
  }

  println("Max is " + max);

  // call collection common function, gonna get same result to above
  println(s"myArray.max = " + myArray.max)
  val sumResult = myArray.sum
  println(s"myArray.sum = $sumResult")

}