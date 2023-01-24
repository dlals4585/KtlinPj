package com.ktlinpj

// 2. 은행 계좌 만들기
//  (1) 계좌생성 기능(이름, 생년월일)
//  (2) 잔고확인 기능
//  (3) 출금 기능
//  (4) 예금 기능

fun main(array: Array<String>) {
    val account: Account = Account("홍길동", "1990-03-01", 1000)
    println(account.checkbalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkbalance())
    println(account.save(-1000))
    println(account.checkbalance())
    println("\n")
    val account1: Account1 = Account1("홍길동", "1990-03-01")
    println(account1.checkbalance())
}
class Account {
    var name: String
    var birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance < 0) {
            this.balance = 0
        } else {
            this.balance = balance
        }
    }

    fun checkbalance(): Int { // 금액 확인
        return balance
    }

    fun withdraw(amount: Int): Boolean { // 출금 확인
        if (balance >= amount) {
            balance = balance - amount
            println("출금완료")
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

// 이번에 계좌 생성하면 무조건 천원을 넣어주겠다.(값이 없으면 1000)
class Account1(var name: String, var birth: String, var balance: Int = 1000) {
    fun checkbalance(): Int { // 금액 확인
        return balance
    }

    fun withdraw(amount: Int): Boolean { // 출금 확인
        if (balance >= amount) {
            balance = balance - amount
            println("출금완료")
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

// val을 지정하지 않은 변수를 선언할 수 있고 그럴때는 내부에서 구분해서 새로운 변수로 넣어줄 때 사용될 수 있다.
class Account3(inicialBalance: Int) {
    val balance: Int = if (inicialBalance >= 0) inicialBalance else 0
    fun checkBalance(): Int {
        return balance
    }
}
