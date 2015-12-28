package com.jerry.scala.p13

/**
 * Scala入门到精通——第十三节 高阶函数
 * http://blog.csdn.net/lovehuangjiaju/article/details/47079383
 * 偏函数
 */
object Test4 {
  def main(args: Array[String]): Unit = {
    def sum(x:Int, y:Int, z:Int) = x + y + z
    
    //不指定任何参数的偏函数
    val s1 = sum _
    println(s1(1,2,3))
    
    //指定两个参数的偏函数
    val s2 = sum(1, _:Int, 3)
    println(s2(2))
    
    //指定一个参数的偏函数
    val s3 = sum(1, _:Int, _:Int)
    println(2,3)
  }  
}