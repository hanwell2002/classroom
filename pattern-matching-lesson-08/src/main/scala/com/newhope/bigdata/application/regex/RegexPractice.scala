package com.newhope.bigdata.application.regex


import scala.util.matching.Regex

object RegexPractice extends App {

  val myPattern =  "([#@%$][0-9])*"
//  val numberPattern: Regex = "[0-9]".r
  val numberPattern: Regex = myPattern.r

  val password = "awesomep@$222233@$222233password"

  numberPattern.findFirstMatchIn(password) match {
    case Some(_) => println("Password OK")
    case None => println("Password must contain a number")
  }


  def saveContactInformation(contact: String): Unit = {
    import scala.util.matching.Regex

  val emailPattern: Regex = """^(\w+-\w+)@(\w+(.\w+)+)$""".r   // james@007.com.uk
    val phonePattern: Regex = """^(\d{3}-\d{3}-\d{4})$""".r   //888-556-7777    \d --> [0-9]

    contact match {
      case emailPattern(localPart, domainName, _) => {
        println(s"Hi $localPart, we have saved your email address.")
        println(s"Hi $domainName, is the domain name.")

      }
      case phonePattern(phoneNumber) =>
        println(s"Hi, we have saved your phone number $phoneNumber.")
      case _ =>
        println("Invalid contact information, neither an email address nor phone number.")
    }

  }

  saveContactInformation("123-456-7890")
  saveContactInformation("Jo2hnSmith-132@sample.domain.com")
  saveContactInformation("2 Franklin St, Mars, Milky Way")   // invalid contact info.

}

