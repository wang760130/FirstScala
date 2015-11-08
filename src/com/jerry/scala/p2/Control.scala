package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 程序控制结构
 */

object Control {
  def main(args: Array[String]): Unit = {
    // if 的使用
    var x = if("hello" == "world") 1 else 0
    println(x);
    
    // while 的使用
    var a = 10
    while(a > 0) {
      a = a - 1
      print(a)
    }
    println()
    
    // do while的使用
    var b = 10
    do {
      b = b - 1
      print(b)
    } while(b > 0)
    println()
    
    /**
     * 注意：与if不同的是，while与do while不能用作表达式，也即其返回值为Unit，
     * 在某些函数式编程语言中，删除了while与do while程序控制结构，
     * 但scala仍然保留了while与do while，可见Scala并不是纯函数式编程语言
     * （另外一个重要原因是，scala函数定义时仍然可以用var指定参数）。
     */
    
    //利用if替代while控制结构
    //这些做可以减少var变量的使用，程序结构也更简单，表达能力更强
    def gcd(x : Long, y : Long) : Long = if(y == 0) x else gcd(y, x % y)
               
    
    // for循环的使用
    val files = (new java.io.File(".")).listFiles
    for(file <- files) {
      println(file)
    }
    
    for(i <- 1 to 5) {
      print(i)
    }
    println()
      
    // 如果不需要5出现，则用
    for(i <- 1 until 5) {
      print(i)
    }
    println()
    
    // 在for循环结构中还可以加入if进行过滤操作
    for(file <- files if file.getName.endsWith(".scala")) {
      println(file)
    }
    
    //还可以加入多个过滤条件，用;隔开
    for(file <- files if file.isFile; if file.getName.endsWith(".scala")) {
      println(file)
    }
    
    def fileLines(file : java.io.File) = scala.io.Source.fromFile(file).getLines.toList
    def grep(pattern : String) = 
      for(file <- files if file.getName.endsWith(".scala"); line <- fileLines(file) if line.trim.matches(pattern)) {
        println(file + ":" + line.trim)
      }
    grep(".*gcd.*")
    
    //前一个for相当于下列语句
   def grep2(pattern: String) = 
     for (file <- files if file.getName.endsWith(".scala")) 
     for (line <- fileLines(file) if line.trim.matches(pattern))
     println(file +": "+ line.trim)
     grep(".*gcd.*")
    }
}