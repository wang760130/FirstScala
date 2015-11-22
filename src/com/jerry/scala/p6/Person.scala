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
//当在创建对象时，需要进行相关初始化操作时，可以将初始化语句放在类体中，同样也可以在类中添加或重写相关方法
class Person3(val name:String, val age:Int) {
  //println将作为主构建器中的一部分，在创建对象时被执行
  println("constructing Person ........")
  //重写toString()方法
  override def toString()= name + ":"+ age
}

//只有辅助构造函数的类
class Person4() {
  private var name:String = null
  private var age:Int=18
  private var sex:Int=0
  
  def this(name:String) {
    this()
    this.name=name
  }
  
  def this(name:String,age:Int) {
    this(name)
    this.age=age
  }
  
  def this(name:String, age:Int,sex:Int) {
    this(name,age)
    this.sex=sex
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    //默认已经有构建函数，所以可以直接new
    val person = new Person()
    println(person)
    
    //直接调用getter和setter方法
    //setter方法
    println(person.name_=("john"))
    //getter方法
    println(person.name)
    
    //直接修改，但其实调用的是p.name_=("jonh")
    println(person.name="john")
    println(person.name)
    
    val person3 = new Person3("john",29)
    println(person3.toString())
  }
}