import scalikejdbc._

object Main extends App{
   // Class.forName("org.postgresql.Driver")

    ConnectionPool.singleton("jdbc:postgresql://localhost:5432/postgres", "postgres", "Admin$777")
    implicit val session = AutoSession
    val employees: List[Map[String, Any]] = sql"select first_name, last_name, email, phone from employee".map(_.toMap).list.apply()
    employees.foreach(println)

}