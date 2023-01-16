package com.ktlnpj

import java.lang.NullPointerException

/**
 * Null Safe
 * **/
fun main(array: Array<String>) {
    val a: Int ?= null
    val b: Int = 10
    val c: Int = 100

    //엘비스 연산자 Null safe 널에 대응하는 연산자
    val number: Int? = 100
    val number2 = number ?: 10 //(number = null 일경우 number2 = 10)
    println()
    println(number2)

    val number3 = number ?: return //(number = null 일경우 return)
    val number4 = number ?: throw NullPointerException() //(number = null 일경우 예외 발생)

    val names: Names? = Names() //안전한 호출 사용
    val name:String = names?.name ?: "No Name" //(Names클래스의 name 변수 값이 null일 경우 현재 name = No Name)

    val animal:String = "호랑이" //안전한 형변환 as?
    val value: Int = animal as? Int ?: 0  //Int로 변환이 불가능 할 경우 0으로 세팅

    val animalName : String = animal!! // 넓값 보증 연산자 (anumal 변수는 무조건 널이 아니다) -> 널이 들어올 경우 큰 오류가 발생함.

    lateinit var name1 : String     //선언만 하고 초기화를 나중에 시킴 ex) int a = 0 가 아닌, int a -> 나중에 초기화를 해주지 않으면 null 오류가 발생한다. **초기화 작업을 유의해야한다.

    var num1: Int = 10
    var num2: Int = 20
    var max = if (num1 > num2){  //값을 리턴하는 if를 사용할 때에는 반드시 return이 되는 형태로 제작해야한다( else if()만 끝나는 것이 아닌 else{} 까지 모든 if문을 작성해야함)
        num1
    } else if(num1 == num2){
        num2
    } else {
        100
    }

}

class Names{
    var name:String?=null
}