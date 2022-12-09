package maps
import scala.collection.immutable.BitSet
/*
A BitSet in Scala is implemented as an Array[Long], where each bit signals the presence of a number in the array. Long is 64 bit in Scala (on the JVM). One such Long can store values 0 to 63, the next one after it 64 to 127, on so on. This is possible since we're only talking about positive numbers and don't need to account for the sign.

Given your example:

BitSet(0, 2, 3)
We can store all these numbers inside a single Long, which in binary would be:

1101
Since we're in the range of 0 to 63, this works on a single Long value.

In general, the upper limit, or the biggest value stored inside a BitSet in Scala is Int.MaxValue, meaning 2^31-1 (2147483647). In order to store it, you'd need 2147483647 / 64 "bits" representing the number, which is ~= 33554432 longs. This is why storing large numbers in a bit set can get quite expensive, and it is usually only recommended when you're dealing with numbers in around the hundreds.

As a side note, immutable.BitSet has a special implementation in Scala (of the BitSetLike trait), namely BitSet1 and BitSet2, which are backed by a one and two longs, respectively, avoiding the need to allocate an additional array to wrap them.
* */
object BitSetExample1 extends App {

val bitSet1:BitSet = BitSet(3,2,0)
  println(s"Elements of bitSet1 = $bitSet1 ")

}
