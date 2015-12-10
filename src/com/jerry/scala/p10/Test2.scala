package com.jerry.scala.p10

/**
 * Scala入门到精通——第十节 Scala类层次结构、Traits初步
 * http://blog.csdn.net/lovehuangjiaju/article/details/47059827
 * Scala中原生类型的实现方式解析
 */
object Test2 {
  def main(args: Array[String]): Unit = {
    
    // scala采用与java相同原生类型存储方式，由于性能方面及与java进行操作方面的考虑，
    // scala对于原生类型的基本操作如加减乘除操作与java是一样的，当需要遇到其他方法调用时，
    // 则使用java的原生类型封装类来表示
    println("abc"=="abc")
    
    
    // 如果是在java语言中，它返回的是false。在scala中，对于原生类型，这种等于操作同java原生类型，
    // 而对于引用类型，它实际上是用equals方法对==方法进行实现，这样避免了程序设计时存在的某些问题。
    // 那如果想判断两个引用类型是否相等时怎么办呢? AnyRef中提供了eq、ne两个方法用于判断两个引用是否相等
    val x = new String("123")
    println(x)
    
    val y = new String("123")
    println(y)
    
    println(x==y)
    
    println(x.eq(y))
    
    println(x ne y)
      
  }
}