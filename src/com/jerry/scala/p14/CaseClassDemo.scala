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

//SchoolClass为接受多个Person类型参数的类
case class SchoolClass(classDescription:String, persons:Person*)

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
    
    // 多个参数的case class
    val school = SchoolClass("1class",Teacher("john",27,2015),Student("kitty",27,2015));
    school match{
      case SchoolClass(_,_,Student(name,age,studentNo)) => println(name)
      case _ => println("Nobody")
    }
  }
}