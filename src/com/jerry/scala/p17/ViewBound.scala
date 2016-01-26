package com.jerry.scala.p17

/**
 * Scala入门到精通——第十七节 类型参数（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47264365
 * 视图界定(View Bound)
 */

//使用的是类型变量界定
case class Student1[T,S <: Comparable[S]](var name:T,var height:S)

//利用<%符号对泛型S进行限定
//它的意思是S可以是Comparable类继承层次结构
//中实现了Comparable接口的类
//也可以是能够经过隐式转换得到的类,该类实现了
//Comparable接口
case class Student2[T,S <% Comparable[S]](var name:T,var height:S)

object ViewBound extends App {
   val s1 = Student1("john","170")
  //下面这条语句不合法，这是因为
  //Int类型没有实现Comparable接口
  //val s2 = Student1("john",170)
  
  val s= Student2("john","170")
  //下面这条语句在视图界定中是合法的
  //因为Int类型此时会隐工转换为
  //RichInt类，而RichInt类属于Comparable、
  //继承层次结构
  val s2= Student2("john",170)
}