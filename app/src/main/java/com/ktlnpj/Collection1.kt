package com.ktlnpj


//Collection
//--> list, set, map

fun main(array : Array<String>){

    //----------------------세팅이 되면 이후에 값을 변경할 수 없는 콜렉션(inMutable collection) start----------------------
    //List
    var numberlist = listOf<Int>(1,2,3,3)
    println(numberlist)
    println(numberlist.get(0))
    println(numberlist[1])
    //> [1,2,3,3] > 중복을 허용한다

    //set
    var numberset = setOf<Int>(1,2,3,3,3)
    println(numberset)
    //> [1,2,3]  >  중복을 허용하지 않는다  >> numberset.get()으로는 출력되지 않음(순서가 없기때문에 인덱스가 없다)
    numberset.forEach{
        println(it)
    }

    //map --> key,value 식으로 관리한다
    var numbermap = mapOf<String, Int>("one" to 1,"two" to 2,"three" to 3)
    println(numbermap)
    println(numbermap.get("one"))
    println(numbermap.get("dtwo"))

    //----------------------세팅이 되면 이후에 값을 변경할 수 없는 콜렉션(inMutable collection) end----------------------

    //----------------------세팅이 되어도 이후에 값을 변경할 수 있는 콜렉션(Mutable collection) start----------------------
    var mNumberList = mutableListOf<Int>(1,2,3);
    mNumberList.add(3,4)
    println(mNumberList)
    var mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)
    var mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two" , 2)
    println(mNumberMap)
    //----------------------세팅이 되어도 이후에 값을 변경할 수 있는 콜렉션(Mutable collection) end----------------------
    //list set map

}