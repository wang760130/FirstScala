package com.jerry.scala.p9

/**
 * Scala入门到精通——第九节 继承与组合
 * http://blog.csdn.net/lovehuangjiaju/article/details/47029287
 * 类的继承 与  构造函数执行顺序 与 方法重写
 */

class Person(name:String, age:Int) {
  println("Constructing Person");
  
  def walk():Unit = println("walk like a normal person");
}

class Student(name:String, age:Int,var studentNo:String) extends Person(name, age) {
  println("Constructing Student");
  
  override def walk():Unit={
    super.walk()
    println("walk like a elegant swan")
  }
}

object demo{
  def main(args: Array[String]): Unit = {
    var student = new Student("John",18,"1024")
    student.walk()
    
    
    //下面的代码/定义了一个匿名类，并且进行了实例化
    //直接new Person("john",18)，后面跟的是类的内容
    //我们知道，Person是一个抽象类，它是不能被实例化的
    //这里能够直接new操作是因为我们扩展了Person类，只不
    //过这个类是匿名的，只能使用一次而已
    val teacher = new Student("John",18,"1024") {
      override def walk() {
        println("teacher walk")
      }
    }
    teacher.walk()
  }
}