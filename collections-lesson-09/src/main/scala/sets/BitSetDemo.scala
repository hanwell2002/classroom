package sets

import scala.collection.immutable.BitSet

object BitSetDemo {
  def main(args: Array[String]) = {
    var mySet: BitSet = BitSet(0, 1, 2);
    // Add an element
    var mySet1: BitSet = mySet + 3;
    // Remove an element
    var mySet2: BitSet = mySet - 2;
    var mySet3: BitSet = BitSet(4, 5);
    // Adding sets
    var mySet4: BitSet = mySet1 ++ mySet3;

    println(mySet);

    println(mySet1);
    println(mySet2);
    println(mySet4);
    println("-------------------- End -------------------")

  }
}




