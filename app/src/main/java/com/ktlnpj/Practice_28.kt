package com.ktlnpj

//>> 인터페이스의 메소드의 구현이 불가한것은 아니다.
// 인터페이스도 구현이 있는 함수를 만들 수 있다
// 구현했을 경우에는 implement method 정의가 필요 없을 수 있다.
// 인터페이스의 구현이 없는 함수는 인터페이스를 구현하는 클래스에서 반드시 구현해야한다.

interface Person__{
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    abstract fun study()  //>>abstract 키워드가 있으면 반드시 별도 구현 해야한다.(내부에서 구현할 수 없음.)
}

class Student__ : Person__{   //마우스 우클릭 > implement method
    override fun eat() {

    }

    override fun sleep() {

    }

    override fun study() {
        println("잔다")
    }
}
class Teacher__():Person__{
    override fun eat() {

    }

    override fun sleep() {

    }

    override fun study() {
        println("잔다")
    }

}
fun main(array:Array<String>){
    val student  = Student__();
    student.sleep()
}


