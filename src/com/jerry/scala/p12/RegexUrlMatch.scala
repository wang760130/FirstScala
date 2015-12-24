package com.jerry.scala.p12

/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * 匹配网址
 */

object RegexUrlMatch {
  def main(args: Array[String]): Unit = {
    val sparkRegex="^[a-zA-Z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\s*)?$".r
    for(matchString <- sparkRegex.findAllIn("http://www.xuetuwuyou.com")) {
      println(matchString)
    }
  }
}