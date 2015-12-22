package com.jerry.scala.p11

/**
 * Scala入门到精通——第十一节 Trait进阶
 * http://blog.csdn.net/lovehuangjiaju/article/details/47065243
 * trait构造顺序
 */

import java.io.PrintWriter

/**
 * 在创建匿名类对象时，先调用的是Logger类的构造器，然后调用的是FileLogger的构造器。实际上构造器是按以下顺序执行的： 
 * 1. 如果有超类，则先调用超类的构造器 
 * 2. 如果有父trait，它会按照继承层次先调用父trait的构造器 
 * 3. 如果有多个父trait，则按顺序从左到右执行 
 * 4. 所有父类构造器和父trait被构造完之后，才会构造本类
 */
trait Logger {
  println("Logger")
  def log(msg:String) : Unit
}

trait FileLogger extends Logger {
  println("FileLogger")
  val fileOutput = new PrintWriter("file.log")
  fileOutput.println("#")
  
  def log(msg:String):Unit = {
    fileOutput.print(msg)
    fileOutput.flush()
  }
}

object Test1 {
  def main(args: Array[String]): Unit = {
    new FileLogger {}.log("trait demo")
  }
}