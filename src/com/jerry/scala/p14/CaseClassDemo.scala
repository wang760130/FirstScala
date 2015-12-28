package com.jerry.scala.p14

/**
 * Scala入门到精通——第十四节 Case Class与模式匹配（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47176829
 * Case Class简介
 */

//抽象类Person
abstract class Person

case class Student(name:String, age:Int, studentNo:Int) extends Person

case class Teacher(name:String, age:Int, teacherNo:Int) extends Person

case class Nobody(name:String) extends Person

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    //case class 会自动生成apply方法，从而省去new操作
    val p:Person = Student("john",18,1025)
    
    //match case 匹配语法
    p match {
      case Student(name, age, studentNo) => println(name+":"+age+":"+studentNo)
      case Teacher(name,age,teacherNo)=>println(name+":"+age+":"+teacherNo)
      case Nobody(name)=>println(name)
    }
  }
}