package com.ktlnpj

/**
 * 상속
 * **/
// 부모로부터 설명서를 물려받는다.

//두번까지는 봐준다
//두번 이상이 넘어가면 리펙토링(기능에는 변화가 없이 더 효율적인 코드로 교체하는 것) 해라

//변수 선언시 기본 접근제어자 : public
//클래스와 함수 선언시 기본 접근제어자 : private
//***상속시 클래스의 접근제어자를 "open"으로 설정해야함.***

fun main(array:Array<String>){
    val superCar100 : SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

}
//부모 == Car100
//자식 == SuperCar100, Bus100
open class Car100 {
    open fun drive() :String{
        println("달린다")
        return "달린다"
    }
    fun stop(){

    }
}
class SuperCar100 : Car100() {
    override fun drive(): String{  //super ==> 부모의 메소드
        val run = super.drive()  // 이게 없으면 부모의 기능을 사용할 수 없음. 개조 시 사용
        return "빨리 $run"
    }
}
class Bus100: Car100() {

}