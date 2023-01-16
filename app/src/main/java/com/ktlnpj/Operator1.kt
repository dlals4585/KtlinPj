package com.ktlnpj

/**
 * 연산자
 * **/
//연산자 : 산술연산자
// + - * /(몫), %(나머지)

//연산자 : 대입연산자
// 좌변 = 우변 (우변값이 좌변에 대입됨)
// a = 5(O) / 5 = a(X)

//연산자 : 복합 대입연산자
// +=, -=, *=, /=, %=
// a+=10 -> a = a + 10

//연산자 : 증감연산자
// ++ , --
// a++, a--, ++a, --a

//연산자 : 비교연산자
// <, <=, >, >=, ==, !=
// True == True = True
// True == False = False
// True != False = True
// True != True = False

//연산자 : 논리연산자
// &&, ||, !
// and, or, not
// True && True = True
// True && False = False
// True || False = True
// !True = False
// !False = True


fun main(array: Array<String>){

    //산술연산자
    var a = 10+1
    var b = 10-1
    var c = 1*9
    var d = 20/3
    var e = 20%3
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()

    //대입연산자
    val f = 5
    //val 5 = f
    println()

    //복합대입연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()

    //증감연산자
    a++
    b--
    println(a)
    println(b)
    --a
    ++b
    println(a)
    println(b)
    println()

    //비교연산자
    var g = a > b   //true
    var h = a == b  //false
    var i = g != h  //true
    println(g)
    println(h)
    println(i)
    println()

    //논리연산자
    var j = h && i
    var k = h || i
    var l = !h //변수 a 와 b 등 숫자로 세팅되어있는 값은 !로 값을 바꿀 수 없음
    println(j)
    println(k)
    println(l)
}
