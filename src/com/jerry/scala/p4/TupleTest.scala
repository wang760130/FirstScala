package com.jerry.scala.p4

/**
 * Scala入门到精通——第四节 Set、Map、Tuple、队列操作实战
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * 元组操作实战
 */
object TupleTest {
  def main(args: Array[String]): Unit = {
    //元组的定义
    val tuple1 = ("hello","china","beijing")
    println(tuple1)
    
    val tuple2 = ("hello","china",1)
    println(tuple2)
    
    //访问元组内容
    println(tuple2._1)
    println(tuple2._2)
    println(tuple2._3)
    
    //通过模式匹配获取元组内容
    val (first, second, third) = tuple1
    println(first)
    println(second)
    println(third)
    
  }
  
}