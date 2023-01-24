package com.ktlinpj

/**
 * Collection
 * **/
// --> list, set, map
// list (kotlin) :: 추가/삭제/변경이 가능한것과 가능하지 않은 것의 종류가 있다
//       (java) :: 값을 추가/삭제/변경이 가능하다
fun main(array: Array<String>) {
    // ----------------------세팅이 되면 이후에 값을 변경할 수 없는 콜렉션(inMutable collection) start----------------------
    // List
    var numberlist1 = listOf(1, 2, 3, 3, "Hello", 1.78, true) // 다양한 타입을 리스트 값으로 넣을 수 있다.
    var numberlist = listOf<Int>(1, 2, 3, 3)
    println(numberlist)
    println(numberlist.get(0))
    println(numberlist[1])
    // > [1,2,3,3] > 중복을 허용한다

    // 리스트 확장함수 ::::
    // numberlist.first{id = 10}  >> id가 10인 요소를 찾아줘  for문을 사용하는것보다 간단하게 찾을 수 있다.생산성의 증가
    // numberlist.map { it * 10 } //모든 요소의 10을 곱한 데이터를 내보내줄 수 있다.
    // joinToString("/") >> 1/2/3/4/5/6   //joinToString(",") >> 1,2,3,4,5,6 등으로 리스트를 구분지을 수 있다  ex >> numberlist.map { it * 10 }.joinToString(",")

    // set
    var numberset = setOf<Int>(1, 2, 3, 3, 3)
    println(numberset)
    // > [1,2,3]  >  중복을 허용하지 않는다  >> numberset.get()으로는 출력되지 않음(순서가 없기때문에 인덱스가 없다)
    numberset.forEach {
        println(it)
    }

    // map --> key,value 식으로 관리한다
    var numbermap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    // var map = mapOf((1 to "one"),(2 to "two"),(3 to "three"))의 형태로도 표현 가능
    println(numbermap)
    println(numbermap.get("one"))
    println(numbermap.get("dtwo"))

    // ----------------------세팅이 되면 이후에 값을 변경할 수 없는 콜렉션(inMutable collection) end----------------------

    // ----------------------세팅이 되어도 이후에 값을 변경할 수 있는 콜렉션(Mutable collection) start----------------------
    var mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList)

    var mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println(mNumberSet)

    var mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)
    // ----------------------세팅이 되어도 이후에 값을 변경할 수 있는 콜렉션(Mutable collection) end----------------------
    // list set map

    println(mNumberList.joinToString(","))
}
