package com.ktlnpj

fun main(array: Array<String>) {
    val res1 = plus3(1,2,3)
    val res2 = minus3(10,1,1)
    val res3 = multifly3(2, 2, 2)
    val res4 = multifly3()
    println(res1)
    println(res2)
    println(res3)
    println(res4)
    val res5 = showMyplus(4,5,6)
    println()
    println(res5)
}

fun plus3(first:Int, second:Int, third:Int):Int {
    return first + second + third
}

fun minus3(first: Int,second: Int,third: Int)= first-second-third

fun multifly3(first:Int=1,second: Int=1,third: Int=1):Int{
    return first*second*third
}

//내부함수 (함수 안에 함수)
fun showMyplus(first: Int,second: Int,third: Int):Int{

    fun plus(first: Int,second: Int):Int{
        return first + second
    }
    return plus(first,second)
}