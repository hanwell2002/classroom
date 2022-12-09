package sets

import scala.collection.immutable.ListSet

object  ListSetExample extends App {

  // ListSet implemented at immutable package
  var varList : ListSet[String] = ListSet("Apple","Orange","Banana")

  // add an element
  var varList1: ListSet[String] = varList + "Kiwi";

  // Remove an element
  var varList2: ListSet[String] = varList - "Banana";

  // Create an empty ListSet

  var varList3: ListSet[String] = ListSet.empty[String];
  println(varList);
  println(varList1);
  println(varList2);
  println(varList3);

}
