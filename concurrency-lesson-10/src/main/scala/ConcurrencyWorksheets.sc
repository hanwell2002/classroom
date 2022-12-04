import scala.concurrent.Future

val futureExa=Future { Thread.sleep(10000); 21+21 }
//will get error:

// then import ExecutionContext
import scala.concurrent.ExecutionContext.Implicits.global

// run 
val futureExa=Future { Thread.sleep(10000); 21+21 }

// check execution result
 futureExa.isCompleted
// will be false due to need 10000 ms
// val res1: Boolean = false
 
//wait 10000 ms and check again
 futureExa.isCompleted
 //val res6: Boolean = true

 // get the value in the future
 futureExa.value

 /*
 scala> futureExa.value
    val res7: Option[scala.util.Try[Int]] = Some(Success(42))
// the return type is Option 

scala> futureExa.value.get
    val res8: scala.util.Try[Int] = Success(42)
 */

// compute the result
import scala.util.{Success, Failure}

futureExa.onComplete ({
    case Success(result) => println("got: " + result)
    case Failure(e) => println("failure: " + e)
})

 //