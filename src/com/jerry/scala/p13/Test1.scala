package com.jerry.scala.p13

/**
 * Scala入门到精通——第十三节 高阶函数
 * http://blog.csdn.net/lovehuangjiaju/article/details/47079383
 * 高阶函数简介
 * 高阶函数主要有两种：一种是将一个函数当做另外一个函数的参数（即函数参数）；另外一种是返回值是函数的函数。
 */

object Test1 {
  def main(args: Array[String]): Unit = {
    // 函数参数，即传入另一个函数的参数是函数
    def convertIntToString(f:(Int)=>String)=f(4)
    println(convertIntToString((x:Int)=>x+" s"))
    
    //高阶函数可以产生新的函数，即我们讲的函数返回值是一个函数
    def multiplyBy(factor:Double)=(x:Double)=>factor*x
    val x=multiplyBy(10)
    println(x(50))
  }
}