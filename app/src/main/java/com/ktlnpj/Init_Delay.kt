package com.ktlnpj.Make_UI

import android.content.Intent

/**
 * 초기화 지연 lateinit, lazy
 * 정의 : 변수를 선언할 때 값을 지정하지 않고 나중에 지정할 수 있는 방법
 * 목적 : 필요 없는 값을 메모리로 올리지 않게 때문에 메모리를 효율적으로 사용할 수 있음
 *      + null safe한 value를 사용하기 위해서
 * lateinit, var
 *  >> 변수타입을 지정해줘야함
 *  >> prrimitive 타입은 사용할 수 없음
 *  >> 선언 후 나중에 초기화 해줘도 됨
 * lazy, val
 *  >> 선언과 동시에 초기화를 해야함
 *  >> 호출 시점에 초기화가 이루어짐
**/

var text :String ? = null
//상위로 올린 순간에는 초기화 할 값을 모를 경우가 있음 >> null로 선언 후 필요한 메서드에서 초기화 값을 지정하는 방법이 있지만
// 초기화가 반드시 된다는 보장이 있을 때 null을 사용하면 항상 ?= 의 형식으로 null safe 처리를 해주어야 한다.


// 값을 할당하지 않아도 됨. >> 번수타입 지정은 필수로 해주어야함.
lateinit var text1 : String
//lateinit var text1 : Int   >> 프리미티브 타입은 선언 불가
lateinit var age : Integer

//변수를 미리 초기화 해 놓은 뒤 호출시 초기화가 이루어짐
val test : Int by lazy {
    println("초기화 중")
    100
}

fun main(){
    text = "name"
    text1 = "test"
    //초기화 하지 않을 경우 initialized exception(이니셜라이즈 오류) 발생
    age = Integer(10)
    println(text1)

    println("초기화한 값 : $test")
    println("두번째 호출 값 : $test")
}