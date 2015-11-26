package com.jerry.scala.p6

/**
 * Scala入门到精通——第六节：类和对象
 * http://blog.csdn.net/lovehuangjiaju/article/details/47011273
 * 抽象类
 */
abstract class AbstractClass{
  //抽象字段(域）
  //前面我们提到，一般类中定义字段的话必须初始化，而抽象类中则没有这要求
  var height:Int
  //抽象方法
  def eat:Unit
}
class ImplClass(var height:Int) extends AbstractClass {
  def eat() {
    println("eat...")
  }
}

object ImplClass extends App {
  new ImplClass(10).eat()
}