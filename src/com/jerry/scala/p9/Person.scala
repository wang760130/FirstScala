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
    
    val teacher = new Student("John",18,"1024") {
      override def walk() {
        println("teacher walk")
      }
    }
    teacher.walk()
  }
}