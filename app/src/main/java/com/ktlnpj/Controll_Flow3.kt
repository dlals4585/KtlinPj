package com.ktlnpj

/**
 * when문 (자바의 스위치문)
 * **/
fun main(array: Array<String>) {
    var value: Int ? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }
    val value2: Boolean ? = null // (Null을 가질 수 있는 Boolean)

    // 모든 값의 대응을 해주어야 하기 때문에 null에 대한 조건도 작성해야함.
    // when 구문은 조건으로 갖는 값의 모든 경우를 대응 해주는 것이 좋다
    when (value2) {
        true -> println("value2 is true")
        false -> println("value2 is false")
        null -> println("value2 is null")
    }
    // 값을 return 하는 when 구문의 경우 반드시 return 값이 있어야함.
    val value3 = when (value2) {
        true -> 1
        false -> 2
        null -> 3 // 또는 else -> 3
    }
    println(value3)

    // when의 다양한 조건식 1 (타입)
    val value4: Int = 10
    when (value4) {
        is Int -> { // value4가 Int 타입인지 (타입에 대한 정의)
            println("value4 is int")
        } else -> {
            println("value4 is not int")
        }
    }
    // when의 다양한 조건식 2 (~사이)
    val value5: Int = 87
    when (value5) {
        in 60..70 -> println("C학점")
        in 70..80 -> println("B학점")
        in 80..90 -> println("A학점")
    }
    // 60..70 에서 마지막 숫자 포함여부(70을 포함하는지) until
}
