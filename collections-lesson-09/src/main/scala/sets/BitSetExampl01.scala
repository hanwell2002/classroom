package sets

import scala.collection.immutable.BitSet

// import scala.collection.BitSet

object BitSetExampl01 extends App {

  val bitSet: BitSet = BitSet(0, 1, 2, 3)
  println(s"Elements are = $bitSet")

  // Checking
  println(s"Element 2 = ${bitSet(2)}")
  println(s"Element 4 = ${bitSet(4)}")

  // add element
  val bs1: BitSet = bitSet ++ BitSet(4, 5, 6)
  println(s"Add more than one elements to BitSet = $bs1")

  // add single element: #1
  var bs2 = bs1 ++  BitSet(7)
  println(s"Add more than one elements to BitSet = $bs2")

  // add single element: #2
  bs2 += 100
  println(s"Add more than one elements to BitSet = $bs2")

  bs2 += 50
  println(s"Add more than one elements to BitSet = $bs2")

  // remove
  bs2 -= 100
  println(s"Add more than one elements to BitSet = $bs2")

}
/*
import java.util.BitSet;

public class Main {
    public static int toInt(BitSet bitSet) {
        int intValue = 0;
        for (int bit = 0; bit < bitSet.length(); bit++) {
            if (bitSet.get(bit)) {
                intValue |= (1 << bit);
            }
        }
        return intValue;
    }
}
* */