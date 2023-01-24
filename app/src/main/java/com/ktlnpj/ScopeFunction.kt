package com.ktlnpj

/**
 * Scope Function(범위 지정함수)
 *
 * > 코틀린 표준 라이브러리에서 제공하는 확장함수
 * > 목적 : 간결성, 명료성, 유지보수 용이성
 * > 정의 : 객체의 컨텍스트(context) 내에서, 실행 가능한 코드 블럭을 만드는 함수
 * >>>>>>>>호출 시 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근할 수 있다.
 *          "context" :: 문맥, 맥락, 전후사정 (객체 내에서 실행 가능한 코드블럭을 만들 수 있는것.)
 * > 수신객체(receiver) :: 확장 함수가 호출되는 대상이 되는 값 (객체)
 * > 수신객체 지정람다(Lamda with receiver) :: 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
 * > 차이점
 *    >> 수신객체 접근방법 : this, it
 *    >> return 값 : 수신객체, 마지막 행(lamda result)
 *    수신객체 :
 *     >> this(생략가능) >>> this.apply, this.run
 *     >> it(생략불가능) >>> it.also, it.let + 직접지정/변경 가능
 *
 *     >> let :: null 체크를 해야할 때, 지역변수를 명시적으로 표현 해야할 때
 *     >> run :: 객체를 초기화 하고 리턴 값이 있을 때
 *     >> apply :: 객체 초기화
 *     >> also :: 수신 객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
 *     >> with :: 객체 초기화, 람다 리턴 값이 필요 없을 때
 * **/

// let, run, apply, also, with
fun main() {
    // 1. let
    // 수신객체.let{ it ->
    // 마지막줄 : retuen
    // }
    val a = 3
    a.let { }
    val user: User1? = User1("채상아", 10, true)

    val age1 = user?.let {
        it.age
    }
    println(age1)

    // 2. run
    // 수신객체.run { this ->
    // 마지막 줄 : return
    // }
    val kid = User1("아이", 4, false)
    val kidAge = kid.run {
        age // 전역변수가 설정되어있으면 전역변수로 나온다.
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply { this ->
    // asdfasdf 초기화에 사용
    // }
    // >>> return 깂은 수신객체 자신임. > 객체의 항목을 추가로 지정해주어야함.
    val female = User1("슬기", 20, true, true)
    val kidName = female.apply {
        hasGlasses = false
    }
    println(kidName.hasGlasses)

    // 4. also
    // 수신객체.apply { it ->
    // 로그를 찍을 때 권장...
    // }
    // >>> return 깂은 수신객체 자신임. > 객체의 항목을 추가로 지정해주어야함.
    val male = User1("민수", 17, false, true)
    val maleName = male.also {
        println(it.name)
    }

    // 5. with
    // with(수신객체) {
    // return : 마지막 줄
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
    println(result)
}

class User1(
    val name: String,
    val age: Int,
    val gender: Boolean, // true : female, false : male
    var hasGlasses: Boolean = true
)
