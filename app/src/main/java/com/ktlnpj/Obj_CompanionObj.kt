package com.ktlnpj

import com.ktlnpj.Book.Companion.NAME

/**
 * Object : 클래스를 정의함과 동시에 객체를 생성
 *   >> 싱글톤을 쉽게 만들 수 있는 키워드
 *   >> 생성자 사용 불가
 *   >> 프로퍼티, 메서드, 초기화 블록은 사용 가능
 *   >> 다른 클래스나, 인터페이스를 상속받을 수 있음
 *
 * Companion object 동반객체
 *   >> Java의 static과 동일한 역할
 *   >> 클래스 내에 하나만 생성할 수 있음.
 * **/

fun main(){

    //object
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    //일반 클래스였다면 모두가 다른 인스턴이기 때문에 모두 초기화된 상태로 실행되었을 것이지만
    //object를 사용했기 때문에 초기화는 한번만 이루어진다.
    Counter.hello()

    println(Book.NAME)
    Book.createBook()
    NAME
}

//에러코드를 정의할 때 많이 사용됨
object Counter : Hello() {
    init {
        println("카운터 초기화")
    }
    var count = 0
    fun countUp(){
        count ++
    }
}
open class Hello(){
    fun hello() = println("hello_Test")
}

class Book {
    //object Companion { 과 동일함
    //companion object Novel{ 으로 명명할 수도 있음
    companion object{
        val NAME = "BOOK1"
        const val BOOK_CD = "A001"
        fun createBook() = { println("서고 생성") }
    }
}