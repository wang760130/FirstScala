package com.jerry.scala.p2

/**
 * 第二节Scala基本类型及操作、程序控制结构
 * http://blog.csdn.net/lovehuangjiaju/article/details/46953423
 * 基本类型
 */
object BaseType {
  def main(args: Array[String]): Unit = {
    //16进制定义法
    val hex = 0x29
    println(hex)
    
    //十进制定义法
    val dec = 41
    println(dec)
    
    //Double类型定义,直接输入浮点数，编译器会将其自动推断为Double类型
    val double = 3.1415926
    println(double)
    
    //要定义Float类型浮点数，需要在浮点数后面加F或f
    val float = 3.1415926F
    println(float)
    
    //浮点数指数表示法，e也可以是大写E,0.314529e1与0.314529*10等同
    val float2 = 0.314529e1
    println(float2)
    
    //字符定义，用''将字符包裹
    var char = 'A'
    println(char)
    
    //字符串变量用""包裹
    val hellowWorld = "Hellow World"
    println(hellowWorld)
    
    //要定义"Hello World"，可以加入转义符\
    val helloWorldDoubleQuote="\"Hello World\""
    println(helloWorldDoubleQuote)
    
    //如果希望能够原样输出字符串中的内容，则用三个引号"""将字符串包裹起来，如
    println(""" hello cruel world, \n \\\\ \b \\, I am " experienced" programmer""")
  }
}