package com.jerry.scala.p16

/**
 * Scala入门到精通——第十七节 类型参数（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47264365
 * 视图界定(View Bound)
 */

//使用的是类型变量界定
case class Student1[T,S <: Comparable[S]](var name:T,var height:S)

object ViewBound extends App {
  val s1 = Student1("john","170")
  //下面这条语句不合法，这是因为
  //Int类型没有实现Comparable接口
  //val s2 = Student1("john",170)
  
}