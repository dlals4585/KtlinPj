package com.ktlinpj

/**
 * 인터페이스
 * **/
// 인터페이스는 약속!!  -> 니가 이것을 구현하면 너도 이 타입이다!
// 인터페이스는 물려받는게 아니라 구현하는 것
// 인터페이스가 가지고 있는 기능을 반드시 내용물을 채워줘야한다는 뜻
// 인터페이스는 생성자"()"가 없다. >> 인스턴스화 시킬 수 없다 (설명서가 아닌 지침서 -->> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라)
// 함수에 중괄호가 없다. --> 구현하는 클래스가 담당하기 때문

// 상속이 만들어낸 특징
// 자식 클래스는 부모클래스의 타입이다 >>> 상속받은 SuperMonster타입, SuperNight타입은 Caractor타입이기도 한다.
// 반대로 Caractor가 SuperMonster 타입이 될 수는 없다.
// 자식클래스의 타입은 부모클래스의 타입이 될 수는 있지만 부모클래스가 자식클래스의 타입이 될 수는 없다.

// 상속 = 조상을 찾아간다
// 인터페이스 = 종족의 특징
interface Person_ { // >> 인터페이스는 메소드에 대해 강제성을 가지고있다 + 협업에 유리하다
    fun eat()
    fun sleep()
}
class Student_ : Person_ { // 마우스 우클릭 > implement method
    override fun eat() {
    }

    override fun sleep() {
    }
}

class SoccerPlayer : Person_ {
    override fun eat() {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun sleep() {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }
}

// 상속 = 자식클래스가 공통으로 가지고 있는 기능을 부모 클래스에 올려놓으면 편함.
// 같은 메소드 내의 내부 내용이 많이 다를경우 인터페이스

fun main(array: Array<String>) {
}
open class Person() {
    open fun eat() {
    }
    fun sleep() {
    }
}
class Student() : Person()
class Teacher() : Person()
