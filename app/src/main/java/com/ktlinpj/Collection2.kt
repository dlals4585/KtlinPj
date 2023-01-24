package com.ktlinpj

/**
 * list 컬랙션의 확장함수
 * **/
fun main(array: Array<String>) {
    var a = mutableListOf<Int>(1, 2, 3)
    a.add(4) // 맨 뒤에 값이 추가
    println(a)

    a.add(0, 100) // 0번째에 100 값을 추가
    println(a)

    a.set(0, 200) // 해당 인덱스 위치에 있는 데이터를 200으로 바꾼다
    println(a)

    a.removeAt(1)
    println(a)

    println()
    var b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2) // 인덱스라는 존재가 없기 때문에 이렇게밖에 넣을 수 없음.
    println(b)

    b.remove(2) // 정의된 값 중 2를 찾아 지운다
    println(b)

    b.remove(100) // 값이 없어도 에러가 발생하지 않는다.
    println()

    println()
    var c = mutableMapOf<String, Int>("ont" to 1)
    c.put("two", 2)
    println(c)

    c.replace("two", 3) // two라는 키에 있는 값을 3으로 변경한다
    println(c)
    println(c.keys) // 키만 조회
    println(c.values) // 값만 조회

    c.clear() // c의 모든 데이터 삭제
    println(c)
}
