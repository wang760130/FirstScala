package com.jerry.scala.p12

import java.io._
import scala.io.Source
/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * Scala 写文件
 */
object ScalaFileReader {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("file.log")
    
    val lines = file.getLines()
    
    for(i <- lines)
      println(i)
      
     file.close()
  }
}