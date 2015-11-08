package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 对象比较
 */
object ObjectComparison {
  def main(args: Array[String]): Unit = {
    println(1 == 1)
      
    println(1 == 1.0)
    
    //Scala中的对象比较不同于Java中的对象比较
    //Scala基于内容比较，而java中比较的是引用，进行内容比较时须定义比较方法
    val x = "Hellow"
    val y = "Hellow"
    println(x == y)
  }
}