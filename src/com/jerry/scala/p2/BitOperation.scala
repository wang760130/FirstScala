package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 位运算
 */
object BitOperation {
  def main(args: Array[String]): Unit = {
    println(1 & 2)
    
    println(1 | 2)
    
    println(1 ^ 3)
    
    println(~1)
    
    //左移位（shift left）
    println(6 << 1)
    
    //右移位（shift left）
    println(6 >> 1)
    
    //无符号右移（shift left）
    println(-1 >>> 31)
  }
}