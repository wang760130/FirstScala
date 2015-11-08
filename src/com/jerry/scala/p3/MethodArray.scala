package com.jerry.scala.p3

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 数组操作中的常用算法
 */
object MethodArray {
  def main(args: Array[String]): Unit = {
    //apply方法
    println(List.apply(1,2,3))
    
    //range方法，构建某一值范围内的List
    println(List.range(2,6))
    
    //步长为2
    println(List.range(2,6,2))
    
    //步长为-1
    println(List.range(2, 6, -1))
    
    println(List.range(6, 2, -1))
    
    //构建相同元素的List
    //List没有make方法
   // println(List.make(5, "hey"))
    
    //list.flatten，将列表平滑成第一个无素
    val xss = List(List('a', 'b'), List('c'), List('d', 'e'))
    println(xss)
    println(xss.flatten)
     
    //列表连接
    println(List.concat(List('a','b'), List('c')))
  }
}