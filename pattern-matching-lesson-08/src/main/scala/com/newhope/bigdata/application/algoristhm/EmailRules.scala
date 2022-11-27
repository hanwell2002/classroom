package com.newhope.bigdata.application.algoristhm

object EmailRules extends App {

  case class Email(from: String, body: String)

  val importantPersons = Set ("boss@company.com", "friend@gmail.com", "kids@school.com")

  val bossEmail = Email("boss@company.com", "Project to discuss")
  val childEmail = Email( "kids@school.com", "Forgot carry home key")

  val regularEmail = Email("marketing@google.com", "Black Friday Sale")

  val regularEmail2 = Email("ads@google.com", "new arrival")

   def alertOrNoAlert(email: Email) = email match {
     case Email(from, _ )  if importantPersons.contains(from) => println("This is an email which you need take care!")
     case Email(_, _) => println("# no need to take care")
   }


  /*alertOrNoAlert(regularEmail)
  alertOrNoAlert(regularEmail2)*/

  alertOrNoAlert(bossEmail)

  alertOrNoAlert(childEmail)


}
