package api

import scala.collection.immutable.Seq

object SeqDemo {
  def main(args: Array[String]) = {
    var seq = Seq(1, 2, 3, 4, 5, 3)
    // Print all elements of seq
    seq.foreach { (element: Int) => print(element + ", ") }
    println()
    println("-----------------------------------------------")
    println("Seq ends with (5,3): " + seq.endsWith(Seq(5, 3)))
    println("Seq contains 4: " + seq.contains(4))
    println("Last index of 3: " + seq.lastIndexOf(3))
    println("Reversed Seq" + seq.reverse)
  }
}
