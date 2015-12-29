package com.jerry.scala.p15

/**
 * Scala入门到精通——第十五节 Case Class与模式匹配（二）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47187639
 * 模式的类型
 */
object CaseClassType {
  def main(args: Array[String]): Unit = {
    
    //常量模式
    //注意，下面定义的是一个函数
    //函数的返回值利用的是模式匹配后的结果作为其返回值
    //还需要注意的是函数定义在main方法中
    //也即scala语言可以在一个函数中定义另外一个函数
    def constantPattern(x:Any) = x match {
      case 5 => "five"
      case true => "true"
      case "test" => "String"
      case null => "null"
      case Nil => "empty list"
      case _ => "other"
    }
    println(constantPattern(5))
    
    
    def variablePattern(x:Any) = x match {
      case 5 => "five"
      //所有不是值为5的都会匹配变量y
      //例如"xxx"，则函数的返回结果就是"xxx"
      case y => y
    }
    println(variablePattern('x'))
    
    // 构造器模式
    // 构造器模式必须将类定义为case class
    case class Person(nane:String, age:Int)
    val person = new Person("john",27)
    def constructorPattern(person:Person) = person match {
      case Person(name,age) => "Person"
      case _ => "other"
    }
    
    // 序列（Sequence)模式 
    // 序列模式指的是像Array、List这样的序列集合进行模式匹配
    val list = List("spark","hive","hbase")
    def sequencePattern(list:List[String]) = list match {
       //只需要匹配第二个元素
      case List(_, second, _*) => second
      case _ => "other"
    }
    
    
  }
}