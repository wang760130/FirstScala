package com.jerry.scala.p12
import java.io._
/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * Scala 写文件
 */
object ScalaFileWriter {
  def main(args: Array[String]): Unit = {
    val fileWriter = new FileWriter("file.log")
    fileWriter.write("Scala file writer")
    fileWriter.flush()
    fileWriter.close()
  }
}