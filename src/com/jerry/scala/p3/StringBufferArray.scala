package com.jerry.scala.p3

// 要使用ArrayBuffer，先要引入scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 变长数组
 */
object StringBufferArray {
  def main(args: Array[String]): Unit = {
    //创建String类型ArrayBuffer数组缓冲
    val stringArray = ArrayBuffer[String]()
    println(stringArray)
    
    //+=意思是在尾部添加元素
    stringArray += "Hellow"
    println(stringArray)
    
    //+=后面还可以跟多个元素的集合
    //注意操作后的返回值
    stringArray += ("World","Programmer")
    println(stringArray)
    
    //++=用于向数组中追加内容，++=右侧可以是任何集合
    //追加Array数组
    stringArray ++= Array("Welcome","To","Jerry")
    println(stringArray)
    
    //追加List
    stringArray ++= List("Welcome","To","Jerry")
    println(stringArray)
    
    //删除末尾n个元素
    stringArray.trimEnd(3)
  }
}