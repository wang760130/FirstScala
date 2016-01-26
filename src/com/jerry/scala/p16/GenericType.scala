package com.jerry.scala.p16

/**
 * Scala入门到精通——第十六节 泛型与注解
 * http://blog.csdn.net/lovehuangjiaju/article/details/47203847
 * 泛型(Generic Type）简介
 * 泛型用于指定方法或类可以接受任意类型参数，参数在实际使用时才被确定，泛型可以有效地增强程序的适用性，
 * 使用泛型可以使得类或方法具有更强的通用性。泛型的典型应用场景是集合及集合中的方法参数，
 * 可以说同java一样，scala中泛型无处不在，具体可以查看scala的api
 */

class Person[T](var name:T)
  
class Student[T](name:T) extends Person(name)

class Student2[T, S](name:T, var age:S) extends Person(name)

object GenericType {
  def main(args: Array[String]): Unit = {
    println(new Student[String]("摇摆少年梦").name)
  }
}