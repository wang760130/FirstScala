package com.jerry.scala.p12

/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * 匹配手机号码
 */

object RegexMobileMatch {
   def main(args: Array[String]): Unit = {
     val sparkRegex="(86)*0*13\\d{9}".r
     for(matchString <- sparkRegex.findAllIn("13887888888")) {
        println(matchString)
     }
   }
}