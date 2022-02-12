package com.ktlnpj

import java.lang.NullPointerException

//When
fun main(array: Array<String>) {
    val value:Int = 3

    when(value){
        1 -> {  //중괄호 생략 가능
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    if(value == 1){  //중괄호 생략 가능
        println("value is 1")
    }else if(value == 2){
        println("value is 2")
    }else if(value == 3){
        println("value is 3")
    }else{
        println("I do not know value")
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    val value2 = when(value){  //when(value%2){ //연산도 가능 (ex)홀짝
        1 -> 10         // 1일때
        2,3 -> 40       // 2||3
        in 1..3 -> 3    // 1~3사이
        !in 5..6->9     // 5~9 사이가 아닐 때
        else -> 100
    }
    println(value2)

}