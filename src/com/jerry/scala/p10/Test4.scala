package com.jerry.scala.p10

/**
 * Scala入门到精通——第十节 Scala类层次结构、Traits初步
 * http://blog.csdn.net/lovehuangjiaju/article/details/47059827
 * Traits简介
 */

// scala和java语言一样，采用了很强的限制策略，避免了多种继承的问题。
// 在java语言中，只允许继承一个超类，该类可以实现多个接口，
// 但java接口有其自身的局限性：接口中只能包括抽象方法，不能包含字段、具体方法。Scala语言利用Trait解决了该问题，
// 在scala的trait中，它不但可以包括抽象方法还可以包含字段和具体方法

trait Dao {
  var recodeMount:Long = 100000000000L
  def add(o:Any):Boolean
  def update(o:Any):Int
  def query(id:String):List[Any]
}

class DaoImpl extends Dao with Cloneable {
  def add(o:Any):Boolean = true
  def update(o:Any):Int = 1
  def query(id:String):List[Any]=List(1,2,3)
}

object Test4 {
  
}