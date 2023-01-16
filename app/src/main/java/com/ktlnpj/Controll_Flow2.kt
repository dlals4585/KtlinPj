package com.ktlnpj

import java.lang.NullPointerException
import java.time.DayOfWeek

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


    isHoliday("금")
}

//------------------------------------------------------------------------------------------------
fun isHoliday(dayOfWeek: String) {
    when (dayOfWeek) {
        "월" -> false
        "화" -> false
        "수" -> false
        "목" -> false
        "금" -> false
        "토" -> true
        "일" -> true
    }

    when (dayOfWeek) {
        "월" ,
        "화" ,
        "수" ,
        "목" ,
        "금" -> false
        "토" ,
        "일" -> true
    }

    when (dayOfWeek) {
        "토" ,
        "일" -> true
        else -> false
    }

    val result =
        when (dayOfWeek) {
            "토" ,
            "일" -> true
            else -> false
        }
    //익스프레션(조건문을 변수로 지정)인 경우는 return 값이 필수로 존재해야 하기 때문에 else처리를 해야한다

    val result1 =
        when (val day = dayOfWeek) {
            "토" ,
            "일" -> if(day == "토") "좋아" else "아주좋아"
            else -> false
        }
    println(result)
}
//------------------------------------------------------------------------------------------------