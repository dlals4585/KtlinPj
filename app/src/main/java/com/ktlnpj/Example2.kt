package com.ktlnpj

/**
 * 반복문에 대한 예시
 * **/
fun main() {
    print("1번 : ")
    for (i in 0..10) {
        print("$i ")
    }
    println()

    print("2번 : ")
    for (i in IntRange(0, 10)) {
        print("$i ")
    }
    println()

    print("3번 : ")
    for (i in 1 until 10) { // until은 마지막 숫자를 지정하지 않는다
        print("$i ")
    }
    println()

    print("4번 : ")
    for (i in 1..10 step 2) { // step은 해당 수만큼 증가시킨다
        print("$i ")
    }
    println()

    print("5번 : ")
    for (i in 10 downTo 1) { // 역순으로 반복한다
        print("$i ")
    }
    println()

    print("while문 : ")
    var c = 1
    while (c < 11) {
        print("$c ")
        c++
    }
    println()

    println(typecheck("안뇽"))
    println(typecheck(10))
    println(typecheck(true))

    cast("문자열 완료")
    cast(true)

    println(smartcast("안뇽"))
    println(smartcast(10))
    println(smartcast(true))
}

// 데이터 타입 체크1(is를 사용하면 데이터 티입을 볼 수 있다)
fun typecheck(a: Any): String {
    /*return if(a is String)
        "$a = 문자열"
    else if (a is Int)
        "$a = 숫자열"
    else
        "몰라요"*/
    // if문과 when문에서 사용할 수 있다.
    return when (a) {
        is String -> "$a = 문자열"
        is Int -> "$a = 숫자열"
        else -> "몰라요"
    }
}

// 스트링 형태만 캐스팅한다(데이터 타입 체크2 예외 추가)
fun cast(a: Any) {
    // val result = a as? String
    val result = (a as? String) ?: "실패"
    println(result)
}

// 스트링 형태만 캐스팅한다(데이터 타입 체크2)
fun smartcast(a: Any): Int {
    // 타입을 체킹한 이후에 해당 변수에 대해 변수 타입인것과 동일하게 사용할 수 있다.
    return if (a is String) {
        a.length
    } else if (a is Int) {
        a.dec()
    } else {
        -1
    }
}
