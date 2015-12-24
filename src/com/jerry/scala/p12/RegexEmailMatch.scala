package com.jerry.scala.p12

/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * 匹配邮箱
 */
object RegexEmailMatch {
  def main(args: Array[String]): Unit = {
    val sparkRegex="^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$".r
    for(matchString <- sparkRegex.findAllIn("zhouzhihubeyond@sina.com")) {
      println(matchString)
    }
    
    for(sparkRegex(domainName,_*) <- sparkRegex.findAllIn("zhouzhihubeyond@sina.com"))
    {
      println(domainName)
    }
  }
}