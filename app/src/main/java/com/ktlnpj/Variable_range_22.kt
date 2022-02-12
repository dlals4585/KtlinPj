package com.ktlnpj

// 변수의 접근 범위
// 1. 전역변수 (number100)
// 2. 지역변수 (name)
var number100 :Int = 10

fun main(array:Array<String>){
    println(number100)
    var test : Test = Test("ddddddddd")
    test.name
    println(number100)
}

class Test(var name:String){
    fun testFun(){
        var birth: String = "2020-03-01"
        name = "홍길동"
        number100 = 100
        fun testFun2(){
            var gender:String = "mail"
        }
    }
}