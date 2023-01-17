package com.ktlnpj

import android.app.Activity
import android.view.View

fun main(){
    lateinit var activity:Activity
    /**
     * 람다 :: 익명 함수이다.(함수에 이름이 없다)
     * 함수가 변수처럼 사용될 수 있다. + argument , return값이 함수가 될 수 있다.
     * 한번 사용되고 재사용되지 않는 함수 >>
     *  **/

    /**
     * 람다의 대표적인 예 : 온클릭리스너
     * SAM(Single Abstract Method) : 단일 추상 메서드
     * >> 자바 함수형 인터페이스 관계에서 파생됨
     * >> 인터페이스 객체를 람다로 넘길 수 있다.
     * **/


    val view = View(activity.applicationContext)

    //옛날 자바를 이용한 코당
    /*view.setOnClickListener(
        new View.OnClickListener (){
            @Override
            public void onClick(View:view) {
            }
        })*/

    view.setOnClickListener({
        println("람다 예제")
    })

    val a = fun() { println("hello") }

    //ex)
    /*val b : (Int) -> Unit = {
        it * 10
        println(it)
    }*/

    val b : (Int) -> Int = { it * 10 }

    println(b(10))

    val c = {i : Int, j:Int -> i * j}
    println(c(10, 20))

    val f : (Int, String, Boolean) -> String = { _, b, _ -> b }

    hello(3, b)


    /**
     * 확장함수 Extension function
     * 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
     * **/
    Test1().hello()
    Test1().hi()
}

//매개변수로 람다를 받는 경우
fun hello(a:Int, b : (Int)->Int) : (Int)->Int{
    println(a)
    println(b(15))
    return b
}

//Test1클래스에 hi 메서드를 외부에서 확장함수로 생성할 수 있음.
fun Test1.hi() = println("하이")

class Test1(){
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}


