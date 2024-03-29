package com.ktlinpj

// (commend + /) => //주석

// fun 함수명 (변수명:type, 변수명:type  ...) : 반환형 {
//    함수내용
//    return 반환data
// }
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

fun main(array: Array<String>) {
    val a: Int? = plus(1, 3)
    val b = plus(first = 20, second = 30) // plus메소드가 받는 인자의 이름을 적어서 명시적으로 입력해줄 수 있다
    val c = plus(second = 30, first = 20) // 명시적으로 입력하면 순서를 바꾸는 것도 가능하다.

    println(a)
    val res = plusFive(10, 20)
    println(res)
    val res2 = plusFive(10)
    println(res2)
    val res3 = noReturn(11, 12)
    println(res3)
    val res4 = plusShort(20, 30)
    println(res4) // 함수의 retrun값을 출력할 때는 함수를 반드시 변수에 넣어줘야한다.

    plusMany(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Hello world")
    test(1, c = 6)
    test2(id = "id", nickname = "nickname", name = "name") // 파라미터의 순서를 바꿀 수 있다.
    println(test3(4, 3))
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val res: Int = first + second
    return res
}

// 반환값이 없는 함수 만들기 (Unit 생략 가능)
fun noReturn(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수 만들기
fun plusShort(first: Int, second: Int) = first + second // plus()와 동일한 기능을 함

// 가변 인자를 갖는 함수를 선언하는 방법 (vararg) 1~n개의 인수를 받을 수 있다.
fun plusMany(vararg numbers: Int) {
    for (numbers in numbers) {
        print("$numbers ")
    }
}

// ------------------------------------------------------------------------------------------------
// kotlin은 디폴드 값을 주면 되기 때문에 오버로딩이 필요가 없다.
fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a + b)
    return 0
}

fun test2(name: String, nickname: String, id: String) = println("$name $nickname $id") // 코드의 간결화

fun test3(a: Int, b: Int) = a * b // 코드의 간결화 :: 리턴타입의 생략

// ------------------------------------------------------------------------------------------------
