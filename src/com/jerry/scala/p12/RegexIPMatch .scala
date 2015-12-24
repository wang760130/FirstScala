package com.jerry.scala.p12

/**
 * Scala入门到精通——第十二节 I/O与正则表达式
 * http://blog.csdn.net/lovehuangjiaju/article/details/47067331
 * 匹配IP地址
 */
object RegexIPMatch  {
  def main(args: Array[String]): Unit = {
    val sparkRegex="(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)".r
    for(matchString <- sparkRegex.findAllIn("192.168.1.1")) {
      println(matchString)
    }
    
    val ipRegex="(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)".r
    for(ipRegex(one,two,three,four) <- ipRegex.findAllIn("192.168.1.1")){ 
      println("IP子段1:"+one)
      println("IP子段2:"+two)
      println("IP子段3:"+three)
      println("IP子段4:"+four)
    }
  }
}