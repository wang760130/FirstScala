package com.jerry.scala.p9

/**
 * Scala入门到精通——第九节 继承与组合
 * http://blog.csdn.net/lovehuangjiaju/article/details/47029287
 * 多态与动态绑定
 */

// 抽象Person类
abstract class Person2(var name:String, var age:Int) {
  
  def walk() : Unit
  
  //talkTo方法，参数为Person类型
  def talkTo(p:Person2) : Unit
  
}

class Student2(name:String, age:Int) extends Person2(name, age) {
  private var studentNo : Int = 0
  
  def walk() = println("walk like a elegant swan")
  
  def talkTo(p:Person2) = {
    println("talk method in student")
    println(this.name + " is talking to " + p.name)
  }
}

class Teacher2(name:String, age:Int) extends Person2(name, age) {
  private var tracherNo : Int = 0
  
  def walk() = println("walk like a elegant swan")
  
  def talkTo(p:Person2) = {
    println("talkTo method in Teacher")
    println(this.name + " is talking to " + p.name)
  }
}

object demo2 {
  def main(args: Array[String]): Unit = {
    //下面的两行代码演示了多态的使用
    //Person类的引用可以指向Person类的任何子类
    var p1:Person2 = new Teacher2("albert",38)
    var p2:Person2 = new Student2("john",38)
    
    //下面的两行代码演示了动态绑定
    //talkTo方法参数类型为Person类型
    //p1.talkTo(p2)传入的实际类型是Student
    //p2.talkTo(p1)传入的实际类型是Teacher
    //程序会根据实际类型调用对应的不同子类中的talkTo()方法
    p1.talkTo(p1)
    p2.talkTo(p2)
  }
}