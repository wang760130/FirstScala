package com.jerry.scala.p14

/**
 * Scala入门到精通——第十四节 Case Class与模式匹配（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47176829
 * case class应用实战
 * 1 case class常用方法
 */
object CaseClassApp1 {
  def main(args: Array[String]): Unit = {
    var teacher = Teacher("john",38,1024)
    println(teacher)
    
    //无参copy方法演示
    val teacher2 = teacher.copy()
    println(teacher2)
    
    //copy方法是深度拷贝
    println(teacher eq teacher2)
    
    //equal方法根据对象内容进行比较
    println(teacher equals teacher2)
    
    println(teacher == teacher2)
    
    //hashcode方法
    println(teacher2.hashCode())
    
    //toString方法
    println(teacher2.toString())
    
    //带一个参数的copy方法
    println(teacher2.copy(name="stephen"))
    
    println(teacher2.copy(name="stephen", age=58))
    
    println(teacher2.copy(name="stephen", age=58,teacherNo=2015))
    
  }
}