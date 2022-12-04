import java.nio.file.Files
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val salaryFuture = Future { Thread.sleep(5000); 3000 }

salaryFuture.isCompleted

val salaryIncremented = salaryFuture.collect({
  case salary if salary <5000 => salary + 1000
})

salaryIncremented

salaryIncremented.value

salaryFuture

val salary = Future { Thread.sleep(5000); 4000 }
val salaryWithBonus = salary.map(value => value + 500)


/*
import scala.concurrent._
import ExecutionContext.Implicits.global  // implicit execution context

val firstZebra: Future[Int] = Future {
  val words = Files.readAllLines("/etc/dictionaries-common/words").asScala
  words.indexOfSlice("zebra")
}

val animalRange: Future[Int] = for {
  aardvark <- firstAardvark
  zebra <- firstZebra
} yield zebra - aardvark

animalRange.onSuccess {
  case x if x > 500000 => println("It's a long way from Aardvark to Zebra")
}

*/
