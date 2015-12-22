package com.jerry.scala.p12
import java.io.PrintWriter
/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * Scala I/O操作简介
 */
trait FileLogger {

  val fileName:String
  //PrintWriter使用的是java.io.PrintWriter类
  val fileOutput = new PrintWriter(fileName:String)
  fileOutput.println("#")

  def log(msg:String):Unit={
    fileOutput.print(msg)
    fileOutput.flush()
  }
}