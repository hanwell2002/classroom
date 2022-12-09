/*
Bitsets are sets of non-negative integers which are represented as variable-size arrays of bits packed into 64-bit words. The memory footprint of a bitset is determined by the largest number stored in it.

Given that the API deals with adding and removing Ints, then it seems reasonable to believe the maximum bit that can be set is a max integer, i.e. 2^31-1. Looking at the source for scala.collection.immutable.BitSet, there's also an assert to disallow negative integers (which makes sense according to the above description):

def + (elem: Int): BitSet = {
    require(elem >= 0, "bitset element must be >= 0")
    */
/*
import java.util
val n: Int = 12345
val bs: util.BitSet = util.BitSet.valueOf(Array[Long](n))
val l: Long = bs.toLongArray(0)
 */

/*
  object BitSetUtil {

      def convert(value: Long): Nothing = {
        val bits = new Nothing
        var index = 0
        while ( {
          value != 0L
        }) {
          if (value % 2L != 0) bits.set(index)
          index += 1
          value = value >>> 1
        }
        bits
      }

      def convert(bits: Nothing): Long = {
        var value = 0L
        var i = 0
        while ( {
          i < bits.length
        }) {
          value +=
          if (bits.get(i)) 1L << i
          else 0L

          i += 1
        }
        value
      }
    }

 */