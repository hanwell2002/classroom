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


