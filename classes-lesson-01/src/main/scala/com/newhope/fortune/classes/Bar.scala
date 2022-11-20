package com.newhope.fortune.classes

class Bar(foo: String) {
  def show(): Unit = {
    println(foo)
  }
}

object Bar {
  def apply(foo: String) = new Bar(foo)
}

/*
正如在伴生对象中添加 apply 方法可以让您构造新的对象实例一样，添加 unapply 方法可以让您解构对象实例。 我们将用一个例子来证明这一点。
* */