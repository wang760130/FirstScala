package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 逻辑操作
 */
object LogicalOperation {
  def main(args: Array[String]): Unit = {
      val boolean = true
      println(boolean)
      
      //逻辑与：&&
      boolean && boolean
      println(boolean)
      
      //逻辑或：||
      boolean || boolean 
      println(boolean)
      
      boolean || !boolean
      println(boolean)
  }
}