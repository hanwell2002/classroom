package arrays

import Array._

object MultiDimmensionArrayDemo extends App {
  var myMatrix = ofDim[Int](3, 3)

  // build a matrix
  for (i <- 0 to 2) {
    for (j <- 0 to  2) {
      myMatrix(i)(j) = i + j
    }
  }

  // Print two dimensional array
  for (i <- 0 to 2) {
    for (j <- 0 to 2) {
      print(" " + myMatrix(i)(j));
    }
    println();
  }
}