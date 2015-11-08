package com.jerry.scala.p3

import scala.collection.mutable.ArrayBuffer
/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 数组操作中的常用算法
 */
object Algorithm {
  def main(args: Array[String]): Unit = {
    //定义一个整型数组
    var intArray = Array(1,2,3,4,5,6,7,8,9,10)
    println(intArray)
    
    //求和
    var sum = intArray.sum
    println(sum)
    
    //求最大值
    var max = intArray.max
    println(max)
    
    var max2 = ArrayBuffer("Hello","World","Ketty").max
    println(max2)
    
    //求最小值
    var min = intArray.min
    println(min)
    
    //toString()方法
    var str = intArray.toString()
    println(str)
    
    //mkString()方法
    println(intArray.mkString(","))
    println(intArray.mkString("<",",",">"))
  }
}