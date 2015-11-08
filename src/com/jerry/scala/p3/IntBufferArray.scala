package com.jerry.scala.p3

import scala.collection.mutable.ArrayBuffer

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 变长数组
 */
object IntBufferArray {
  def main(args: Array[String]): Unit = {
    val intArray = ArrayBuffer(1,2,3)
    println(intArray)
    
    //在数组索引为0的位置插入元素6
    intArray.insert(0, 6)
    println(intArray)
    
    //在数组索引为0的位置插入元素7,8,9
    intArray.insert(0, 7,8,9)
    println(intArray)
    
    //从索引0开始，删除4个元素
    intArray.remove(0,4)
    println(intArray)
    
    intArray.toArray
    println(intArray)
    
    //将定长数组转成ArrayBuffer
    intArray.toBuffer
    println(intArray)
  }
}