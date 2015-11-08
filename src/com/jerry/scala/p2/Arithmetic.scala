package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 算术操作
 */

object Arithmetic {
  def main(args: Array[String]): Unit = {
    //整数求和，编译器会将其转换为(1).+(2)执行
    val sumValue = 1+2
    println(sumValue)
    
    val sumValue2 = (1).+(2)
    println(sumValue2)
    
    //操作符重载,编译器会将其转换为(1).+(2L)执行
    println(1 + 2L)
    
    //减法
    println(1 - 3)
    
    //除法
    println(1 / 3)
    
    //取模
    println(1 % 3)
    
    //乘法  
    println(1L * 3L)
    
    //scala中可以用+ -符号来表示正负数，例如-3 +3，并且可以加入到运算符当中
    println(1 + -3)
    
  }
}