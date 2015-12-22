package com.jerry.scala.p12

import java.net.{URL, URLEncoder} 
import scala.io.Source.fromURL
/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * 网络I/O
 */
object NetworkIO {
  def main(args: Array[String]): Unit = {
    print(fromURL(new URL("http://www.baidu.com")).mkString)
  }
}