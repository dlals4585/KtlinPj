package com.ktlnpj.Kotlin

//02. 자료형
//정수형  => Long > Int > Short > Byte
//실수형 -> Double > Float
//문자 -> Char
//문자열 -> String
//논리형(참/거짓) -> Boolean

//변수 선언 방법(1)
//Variable/Value 변수명 = 값
//var/val 변수명 = 값
var number = 10

//변수 선언하는 방법(2)
//var/val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point : Double = 3.4

// - 1. 변하지 않는 값 : Value
// - 2. 값이 변할지 안별할지 모르겠다 : Variable

fun main (array:Array<String>){
    println(number);
}


// var abc : Int = null >> Null을 가질 수 없는 Int형 (sync error 발생)
// var abc1 : Int? = null >>null을 가질 수 있는 Int형
// var abc2 : Double? = null >> null을 가질 수 있는 Double형
