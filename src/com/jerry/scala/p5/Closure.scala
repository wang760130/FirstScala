package com.jerry.scala.p5

/**
 * Scala入门到精通——第五节 函数与闭包
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * 闭包
 */
object Closure {
  def main(args: Array[String]): Unit = {
    
    //(x:Int)=>x+more,这里面的more是一个自由变量（Free Variable）,more是一个没有给定含义的不定变量
    //而x则的类型确定、值在函数调用的时候被赋值，称这种变量为绑定变量（Bound Variable）
    
    var more = 1
    println()
    
    val fun = (x:Int) => x + more
    println(fun)
  }
}