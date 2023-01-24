package com.ktlnpj

fun main(array: Array<String>) {
    // 배열을 생성하는 방법 1
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(group1 is Array)

    // 배열을 생성하는 방법 2
    var group2 = arrayOf(1, 2, 3, 4.5, 5, "test", "hello")

    // 배열의 값을 꺼내는 방법 1
    // 배열의 Index는 0부터 시작
    println(group1.get(1).toString())
    println(group1.get(3))

    // 배열의 값을 꺼내는 방법 2
    var test2 = group1[3]
    println(test2)

    for (group in group1) {
        println(group)
    }

    // 배열의 값을 바꾸는 방법 1
    group1.set(0, 100)
    println(group1[0])

    // 배열의 값을 바꾸는 방법 2
    group1[1] = 200
    println(group1[1])
}
