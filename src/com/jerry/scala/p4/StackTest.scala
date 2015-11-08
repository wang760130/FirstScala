package com.jerry.scala.p4

import scala.collection.mutable.Stack
/**
 * Scala入门到精通——第四节 Set、Map、Tuple、队列操作实战
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * Stack操作实战
 */
object StackTest {
  def main(args: Array[String]): Unit = {
    //new 创建方式
    val stack = new Stack[Int]
    println(stack)
    
    //Apply创建方式
    val stack1 = Stack(1,2,3)
    println(stack1)
    
    //出栈
    println(stack1.top)
    
    //入栈
    println(stack1.push(1))
  }
}