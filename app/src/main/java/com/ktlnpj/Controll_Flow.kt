package com.ktlnpj

/**
 * IF문
 * **/
fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    if (a > b){
        println("a>b")
    } else if(b > a){
        println("b>a")
    }else{
        println("b=a")
    }


    val max = if(a>b){
        a
    }else{
        b
    }
    println(max)



    val max1 = if(a>b) a else b
    println(max1)
}