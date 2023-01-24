package com.ktlinpj

// Generic(제너릭)

// 목적 = 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에서 컴파일 시 타입을 체크하는 기능
// 제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 때문에 사용하는 방법만 숙지한다.

fun main(array: Array<String>) {
    // 제너릭을 사용하지 않은 경우
    val list1 = listOf(1, 2, 3, "가")
    // val b : String = list1[2]  --> b가 String인데 list1[2]는 String이 아니기 때문에 아래와 같이 형변환을 해야함
    val b: String = list1[2].toString()

    // 제너릭"<String>"을 사용하는 경우 >> 타입이 안전하다
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장 받는다

    // 제너릭은 강한 타입을 체크할 수 있다
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    // val list4 = listOf<Int>(1,2,3,4,"가") //강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf(1, 2, 3, "가") // 프로그래밍에서 아무타입은 없음 (타입 ->> Any)
    val list6 = listOf<Any>(1, 2, 3, "가") // list5는 list6과같이 표현할 수 있다.
    // 부모 : Any
    // 자식 : String, Int, Float
    // String, Int, Float 타입은 Any안에 포함된다 Any라고 할 수 있다.
}
