package com.ktlnpj

/**
 * Data class
 * Sealed class
 *
 * 1. Data class : 데이터를 담기 위한 클래스
 *   >> toString(), hashCode(), equals(), copy()메서드를 자동으로 생성
 *      >> override하면 직접 구현한 코드를 사용
 *   >> 1개 이상의 프로퍼티가 있어야 함
 *   >> 데이터 클래스는 abstract, open, sealed, inner를 붙일 수 없음
 *   >> 상속이 불가능
 *
 * 2. Sealed class : 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
 *   >> 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
 *   >> when과 함께 쓰일 때, 장점을 가진다.
 * **/

fun main() {
    val person = Person1("수지", 24)
    println(person.toString())

// //데이터클래스 예제------------------------------------------------------
    val dog = Dog1("해피", 21)
    println(dog.toString())
    println(dog.copy(age = 3))

// //세일즈 클래스 예제------------------------------------------------------
    val cat: Cat1 = BlueCat()
    val res = when (cat) {
        is BlueCat -> { "Blue" }
        is RedCat -> { "Red" }
        is GreenCat -> { "Green" }
        is WhiteCat -> "white"
    }
    println(res)
}

// default class
class Person1(
    val name: String,
    val age: Int
)

// Data class
data class Dog1(
    val name: String,
    val age: Int
) {
    /*override fun toString(): String {
        return "직접 구현 $name"
    }*/
}

// Sealed class
sealed class Cat1

// cat1 클래스가 sealed class가 되면 Cat1이 어떤 자식들을 가지고 있는지 알게된다. >> else를 사용하지 않는다
// ex 에러 타입을 체크할 때, recycler View > 뷰타입을 체킹하는데에 사용하면 좋다
class BlueCat : Cat1()
class RedCat : Cat1()
class GreenCat : Cat1()
class WhiteCat : Cat1()
