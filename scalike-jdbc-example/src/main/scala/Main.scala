import scalikejdbc._

object Main extends App {
   // initialize JDBC driver & connection pool
  Class.forName("org.postgresql.Driver")
  ConnectionPool.singleton("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "Admin$777")

  // ad-hoc session provider on the REPL
  implicit val session = AutoSession

  // for now, retrieves all data as Map value
  val entities: List[Map[String, Any]] = sql"select * from city".map(_.toMap).list.apply()
  val ctys: List[Map[String, Any]] = sql"select * from country".map(_.toMap).list.apply()
  ctys.foreach(println)
  //print all city, successful

 // defines country object and extractor
  import java.time._
  case class Country(
                      code: String,
                      name: String,
                      continent: String,
                      region: String,
                      surfacearea: Float,
                      indepyear: Option[Int],
                      population: Int,
                      lifeexpectancy: Option[Float],
                      gnp: Option[Int],
                      gnpold: Option[Int],
                      localname: String,
                      governmentform: String,
                      headofstate: Option[String],
                      capital: Option[Int],
                      code2: String
                    )

  object Country extends SQLSyntaxSupport[Country] {
    override val tableName = "country"
    def apply(rs: WrappedResultSet) = new Country(
       rs.string("code")
      ,rs.string("name")
      ,rs.string("continent")
      ,rs.string("region")
      ,rs.float("surfacearea")
      ,rs.intOpt("indepyear")
      ,rs.int("population")
      ,rs.floatOpt("lifeexpectancy")
      ,rs.intOpt("gnp")
      ,rs.intOpt("gnpold")
      ,rs.string("localname")
      ,rs.string("governmentform")
      ,rs.stringOpt("headofstate")
      ,rs.intOpt("capital")
      ,rs.string("code2")
      //, rs.zonedDateTime("created_at") //datetime example
    )
  }

  // find all countries
  val countrys: List[Country] = sql"select * from country".map(rs => Country(rs)).list.apply()
  // countrys.foreach(println)

  // filter out canada which code is CAN
  println(countrys.filter(_.code == "CAN"))
  println("============================================================")

}