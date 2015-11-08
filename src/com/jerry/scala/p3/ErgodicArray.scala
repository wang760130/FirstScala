package com.jerry.scala.p3
import scala.collection.mutable.ArrayBuffer
/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 遍历数组
 */
object ErgodicArray {
  def main(args: Array[String]): Unit = {
     val intArray = ArrayBuffer(1,2,3)
     println(intArray)
     
     // to     
     for(i <- 0 to intArray.length - 1) println("Array Element :" + intArray(i))
     
     // until
     for(i <- 0 until intArray.length) println("Array Element :" + intArray(i))
     
     //数组方式（推荐使用）
     for(i <- intArray) println("Array Element :" + i)
     
     //步长为2
     for(i <- 0 until(intArray.length, 2)) println("Array Element :" + intArray(i))
     
     //倒序输出
     for(i <- (0 until intArray.length).reverse) println("Array Element :" + intArray(i))
  }
}