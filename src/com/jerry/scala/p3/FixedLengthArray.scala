package com.jerry.scala.p3

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 定长数组
 */
object FixedLengthArray {
  def main(args: Array[String]): Unit = {
    //定义一个长度为10的数值数组
    val numberArray = new Array[Int](10)
    println(numberArray)
    
    //定义一个长度为10的String类型数组
    //需要注意的是，val stringArray = new Array[String](10)
    //这意味着strArray不能被改变，但数组内容是可以改变的
    val stringArray = new Array[String](10)
    println(stringArray)
    
    // 复杂对象类型在数组定义时被初始化为null，数值型被初始化为0
    
    //数组元素赋值
    stringArray(0) = "First Element"
    println(stringArray(0))
    
    //另一种定长数组定义方式
    //这种调用方式其实是调用其apply方法进行数组创建操作
    //Scala中的Array以Java中的Array方式实现
    val stringArray2 = Array("First", "Second")
    println(stringArray2(0))
    println(stringArray2(1))
  }
  
}