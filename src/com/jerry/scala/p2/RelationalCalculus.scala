package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 关系操作
 */
object RelationalCalculus {
  def main(args: Array[String]): Unit = {
    //>运算符
    println(3 > -3)
    
    //<运算符
    println(3 < -3)
    
    //<=运算符
    println(3 <= -3)
    
    //<=运算符
    println(3 <= 3)

    //<=运算符
    println(!(3 <= -3))
  }
}