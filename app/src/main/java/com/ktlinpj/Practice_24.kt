package com.ktlinpj

fun main(array: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15, 3)
    night.attack(monster)
    monster.attack(night)
   /* night.hp = 100
    println(night.hp)*/
    // 임의로 케릭터의 hp나 파워를 바꿀 수 없어야한다. ---> private 사용
}

class Night(private var hp: Int, private var power: Int) {

    fun attack(monster: Monster) {
        monster.defence(power)
    }
    fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다.")
        } else {
            println("기사가 죽었습니다.")
        }
    }
    private fun heal() { // 공격을 당하고 살았을 때 heal을 사용해야함 >>> private
        hp += 3
    }
}
class Monster(private var hp: Int, private var power: Int) {
    fun attack(night: Night) {
        night.defence(power)
    }
    fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("몬스터 현재 체력은 $hp 입니다.")
        } else {
            println("몬스터가 죽었습니다.")
        }
    }
}
class Monster2(private val hp: Int, private val power: Int) // 클래스를 만들 때 무조건 프라이빗 + val로 만든 뒤에 나중에 바꿔주는 방법이 좋다.
