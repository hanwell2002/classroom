package api

import scala.collection.mutable.ListBuffer

object ListBufferDemo {
    def main(args: Array[String])
    {
      // Instance of ListBuffer is created
      var sparkAPIs = ListBuffer[String]()
      sparkAPIs += "Scala"
      sparkAPIs += "Java"
      sparkAPIs += "Python"
      sparkAPIs += "R"

      // Accessing 1th index element of listBuffer
      val nativeAPI = sparkAPIs(0);
      println("Spark native API is ${nativeAPI}")

      printf("What is second prefer API? ")
      println(sparkAPIs(1))
    }
  }