package com.ktlnpj

fun main(array: Array<String>) {
    // 배열을 생성하는 방법 1
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var bound = group1.size
    println(bound)

    // *****************************
    val a1 = intArrayOf(1, 2, 3)
    var a2 = charArrayOf('a', 'b', 'c')
    var a3 = doubleArrayOf(1.2, 100.345)
    var a4 = booleanArrayOf(true, false, true)
    // *****************************

    var a5 = Array(10, { 0 }) // -->람다를 활용한 방법
    var a6 = Array(5, { 1; 2; 3; 4; 5; }) // -->람다 활용 시 세미콜론으로 배열을 정의
}
