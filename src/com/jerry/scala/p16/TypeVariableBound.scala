package com.jerry.scala.p16

/**
 * Scala入门到精通——第十七节 类型参数（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47264365
 * 类型变量界定(Type Variable Bound)
 */
class TypeVariableBound {
  def compare[T <: Comparable[T]](first:T, second:T) = {
    //采用<:进行类型变量界定
    //该语法的意思是泛型T必须是实现了Comparable
    //接口的类型
    if(first.compareTo(second) > 0)
      first
    else 
      second
  }
}

case class Person(var name:String, var age : Int) extends Comparable[Person] {
  def compareTo(o:Person) : Int = {
    if(this.age > o.age) 1
    else if(this.age == o.age) 0
    else -1
  }
}

object TypeVariableBound {
  def main(args: Array[String]): Unit = {
    var typeVariableBound =  new TypeVariableBound
    println(typeVariableBound.compare("A", "B"))
    println(typeVariableBound.compare(Person("stephen",19), Person("john",20)))
  }
}