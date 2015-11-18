package com.jerry.scala.p6

/**
 * Scala入门到精通——第六节：类和对象
 * http://blog.csdn.net/lovehuangjiaju/article/details/47009607
 */
//采用关键字class定义
class Person {
  //类成员必须初始化，否则会报错
  //这里定义的是一个公有成员
  var name:String = null
  
}

class Person2{
  //定义私有成员
  private var privateName:String=null;

  //getter方法
  def name=privateName
  //setter方法
  def name_=(name:String){
    this.privateName=name
  }

}

object Person {
  def main(args: Array[String]): Unit = {
    //默认已经有构建函数，所以可以直接new
    val person = new Person()
    println(person)
    
    //直接调用getter和setter方法
    println(person.name_=("john"))
    println(person.name)
    
    //直接修改，但其实调用的是p.name_=("jonh")
    println(person.name="john")
    println(person.name)
  }
}