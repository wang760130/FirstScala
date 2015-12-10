package com.jerry.scala.p10

/**
 * Scala入门到精通——第十节 Scala类层次结构、Traits初步
 * http://blog.csdn.net/lovehuangjiaju/article/details/47059827
 * Scala类层次结构总览
 */

object Test1 {
   def main(args: Array[String]): Unit = {
     
     /**
      * 根类Any有两个子类，它们分别是AnyVal和AnyRef，其中AnyVal是所有scala内置的值类型
      * （ Byte, Short, Char, Int, Long, Float, Double, Boolean, Unit.）的父类，
      * 其中 Byte, Short, Char, Int, Long, Float, Double, Boolean与java中的
      * byte,short,char,int,long,float,double,boolean原生类型对应，
      * 而Unit对应java中的void类型，由于（ Byte, Short, Char, Int, Long, Float, Double, Boolean, Unit）继承AnyVal，
      * 而AnyVal又继承Any，因此它们也可以调用toString等方法。
      */
     println(2.0.hashCode)
     
     println(2.0 toString)
     
     println(().hashCode)
     
     println(().toString)
     
     //  warning: comparing values of types Unit and Unit using `==' will always yield true
     println(()==())
   }
}