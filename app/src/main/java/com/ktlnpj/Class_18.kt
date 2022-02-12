package com.ktlnpj

//OOP - > Object Oriented Programming (객체지향 프로그래밍)

//객체란? -> 이름이 있는 모든것

//절차지향프로그램 > 코드를 위에서부터 아래로 실행하면 문제가 해결된다.

//객체지향프로그램 > 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// ex) 축구게임 -> 선수, 심판, 경기장, 관중 등의 객체

//객체를 만드는 방법
// -> 객체에 대한 설명서가 있어야 한다.

fun main(array: Array<String>){
    //클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화(클래스를 선언하는 과정) -> 인스턴스(객체)
    val bigCar = Car1("v8 engine","big")

    //우리가 만든 클래스는 자료형이 된다
    var bigCar1: Car1 = Car1("v8 engine","big")

    var SuperCar : SuperCar = SuperCar("good Engine","big","white")
    var number: Int = 10
    var number1 = 20

    var runnableCar : RunnableCar = RunnableCar("simple engune","body")
    //RunnableCar.ride() ==> 불가능(설명서 자체에는 기능이 없음 인스턴스화 해야 사용가능)
    runnableCar.drive()
    runnableCar.navi("부산")
    runnableCar.ride()

    //인스턴스의 멤버변수에 접근하는 방법
    var runnableCar2:RunnableCar2 = RunnableCar2("nice engine","long body")
    println(runnableCar2.body)
    println(runnableCar2.engine)
}

// 클래스 만드는 방법(1) (객체를 만들기 위한 설명서)
class Car1(var engine: String, var body: String) { }

// 클래스 만드는 방법(2) (객체를 만들기 위한 설명서)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door:String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 만드는 방법(3) (객체를 만들기 위한 설명서) (1번 방법의 확장)
//constructor = 생성자
class Car2 (var engine: String, var body: String) {
// 아래 방법도 가능
// class Car2 constructor (var engine: String, var body: String) {
    var door : String = ""
    constructor(engine: String, body: String, door:String) : this(engine,body){
        this.door = door
    }
}

// 클래스 만드는 방법(4) (객체를 만들기 위한 설명서) (2번 방법의 확장)
class Car {
    var engine:String = ""
    var body : String = ""
    var door : String = ""
    constructor(engine: String, body:String){
        this.engine = engine
        this.body = body
    }
    constructor(engine: String,body: String,door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}
///////////---------------------------------------------------------------------------------------//
class RunnableCar(engine: String, body: String){
    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination : String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunnableCar2 {
    var engine : String
    var body:String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }
    init {//객체 사용시 가장 먼저 실행되는 부분(주로 초기값을 설정할 때 사용)
        println("RunnableCar2가 만들어졌습니다")
        println("\n")
    }
    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination : String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

//오버로딩
class TestClass(){
    fun test(a:Int){    }
    fun test(a:Int, b:Int){    }
}