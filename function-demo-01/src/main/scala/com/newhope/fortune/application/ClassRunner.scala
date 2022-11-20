package com.newhope.fortune.application

import com.newhope.fortune.classes.Bar

object ClassRunner {
  def main(args: Array[String]): Unit = {

    var a = Bar("foo")
    a.show()
  }


}
