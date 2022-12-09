package nonblockingfuture
 
import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Failure, Success}

  object NonBlockingFutureResult extends App {

  println("Step 1: Define a function which returns a Future")
  
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    
    println("checking donut stock")
    10
  }

  println("---------------------------------------")
  println("\nStep 2: Non blocking future result")

  // Use Pattern Matching to get result:Success or Failure
  donutStock("vanilla donut").onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e) => println(s"Failed to find vanilla donut stock, exception = $e")
  }
 
 Thread.sleep(3000)
}