package com.jerry.scala.p11

/**
 * Scala入门到精通——第十一节 Trait进阶
 * http://blog.csdn.net/lovehuangjiaju/article/details/47065243
 * trait构造顺序
 */

import java.io.PrintWriter

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