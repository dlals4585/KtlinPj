package com.ktlnpj

fun main(array :Array<String>){
    val testAccess : TestAccess = TestAccess("아무개")
    //testAccess.test()
    /*println(testAccess.name)
    testAccess.name = "아무개 2"
    println(testAccess.name)*/

    val reword : Reword = Reword()
    reword.rewordAmount = 2000

    val runningcar : RunningCar= RunningCar()
    runningcar.runfast()
}

class Reword(){
    var rewordAmount : Int = 1000
}

class TestAccess{
    //변수 앞에 private를 붙일 수 있고 붙이게 되면 클래스 외부의 위치에서 변수사용 및 변경이 불가
    private var name : String = "홍길동"
    constructor(name:String){
        this.name = name
    }
    //함수 앞에 private를 붙일 수 있고 붙이게 되면 클래스 외부의 위치에서 함수사용 및 내용 변경이 불가
    private  fun test(){
        println("테스트")
    }
}
class RunningCar(){
    //함수가 어떤 기능을 보조하기 위한 기능으로 존재할 수 있다. 또 공개할 필요가 없을 수 있다 이런 경우에 private 키워드를 붙여 외부의 접근을 막는다.
    fun runfast(){
        run()
    }
    private fun run(){  }
}