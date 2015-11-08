package com.jerry.scala.p3

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 多维数组
 */
object MultidimensionalArray {
  def main(args: Array[String]): Unit = {
    //定义2行3列数组
    var multiDimArray = Array(Array(1,2,3), Array(1,2,3))
    println(multiDimArray)
    
    //获取第一行第三列元素
    println(multiDimArray(0)(2))
    
    //多维数组的遍历
    for(i <- multiDimArray) println(i.mkString(","))
  }
}