package com.ktlinpj

// 상속 과제
// Night, Monster (부모) -> Charactor클래스
// SuperNight, SuperMonster (자식)

fun main(array: Array<String>) {
    val night: SuperNight = SuperNight(130, 8)
    val monster: SuperMonster = SuperMonster(100, 10, "")
    monster.attack(night)
    monster.bite(night)

    // 상속이 만들어낸 특징
    // 자식 클래스는 부모클래스의 타입이다 >>> 상속받은 SuperMonster타입, SuperNight타입은 Caractor타입이기도 한다.
    // 반대로 Caractor가 SuperMonster 타입이 될 수는 없다.
    // 자식클래스의 타입은 부모클래스의 타입이 될 수는 있지만 부모클래스가 자식클래스의 타입이 될 수는 없다.
}
open class Caractor(var hp: Int, var power: Int) {
    open fun attack(caractor: Caractor, power: Int = this.power) { // 멤버변수는 항상 작은 범위의 변수가 적용이 된다.  //this.power==> 상위에 선언된 값이 적용됨.
        caractor.defence(power)
    }
    open fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.") // javaClass.simpleName ==> 클래스의 이름을 가져옴(메인으로 선언한 클래스의 이름)
        } else {
            println("사망했습니다.")
        }
    }
}

// ***자식 클래스가 인스턴스화가 되기 위해서는 부모 클래스가 선행되서 인스턴스화가 되어야한다.***
class SuperNight(hp: Int, power: Int) : Caractor(hp, power) {
    val defencePower = 2
    override fun defence(damage: Int) {
        super.defence(damage - defencePower)
        // heal()
    }

    /*private fun heal(){//공격을 당하고 살았을 때 heal을 사용해야함 >>> private
        hp += 3
    }*/
}
class SuperMonster(hp: Int, power: Int, val item: String) : Caractor(hp, power) {
    fun bite(character: Caractor) {
        super.attack(character, power + 2)
    }
}
