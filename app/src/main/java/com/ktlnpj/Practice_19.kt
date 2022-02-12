package com.ktlnpj


//1. 사칙 연산을 수행할 수 있는 클래스


fun main(array : Array<String>){
    var operation : Operation  = Operation()
    operation.Plus(2, 5)
    operation.Minus(2, 5)
    operation.Multiply(2, 5)
    operation.Division(2, 5)
    println("\n\n\n")
    var operation1 : Operation1  = Operation1(3)
    println(operation1.Plus(5).minus(5).initValue)
    //-------- > Operation1(3)
    //---------------------- > Operation1(3).plus(5) = > Operation1(8)
    //--------------------------------------- > Operation1(8).minus(5) => Operation1(3)
    // -> 클래스 Chaining(체이닝)
}
//-----------------------------------------------------------------------------
class Operation {
    fun Plus( vararg  number:Int):Int{
        var result = 0
        number.forEach {
            result = result + it
        }
        println(result)
        return result
    }
    fun Minus(vararg  number:Int):Int{
        var result = 0
        number.forEach {
            result = result - it
        }
        println(result)
        return result
    }
    fun Multiply(vararg  number:Int):Int{
        var result = 0
        number.forEach {
            result = result * it
        }
        println(result)
        return result
    }
    fun Division(vararg  number:Int):Int{
        var result = 0
        number.forEach {
            result = result / it
        }
        println(result)
        return result
    }
}

class Operation1(val initValue:Int) {
    fun Plus(number:Int): Operation1{
        var result = this.initValue + number
        return Operation1(result)
    }

    fun minus(number:Int): Operation1{
        var result = this.initValue - number
        return Operation1(result)
    }

    fun multiply(number:Int): Operation1{
        var result = this.initValue * number
        return Operation1(result)
    }

    fun division(number:Int): Operation1{
        var result = this.initValue / number
        return Operation1(result)
    }
}
//-----------------------------------------------------------------------------
