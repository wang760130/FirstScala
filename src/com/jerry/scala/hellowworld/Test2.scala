package com.jerry.scala.hellowworld

class Test2 {
  var greeting = "Hellow World;";
  def greet() = println(greeting);
}

object Test2 {
  def main(args: Array[String]): Unit = {
    var t = new Test2();
    t.greet();
  }
}