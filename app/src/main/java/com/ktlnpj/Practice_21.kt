package com.ktlnpj

// 3. TV 클래스
//  (1) ON/OFF 기능
//  (2) 채널 돌리는 기능
//  (3) 초기 채널은 (S사, M사, K사 3개)

fun main(array: Array<String>) {
    // val channels = listOf<String>("K","M","S");
    val tv: TV = TV(listOf<String>("K", "M", "S"))
    /*tv.switch()
    println(tv.onOff)*/
    println(tv.checkCurrentchnel())
    tv.chanup()
    println(tv.checkCurrentchnel())
    tv.chanup()
    println(tv.checkCurrentchnel())
    tv.chanup()
    println(tv.checkCurrentchnel())
    tv.chanup()
    println(tv.checkCurrentchnel())

    tv.chandown()
    println(tv.checkCurrentchnel())
    tv.chandown()
    println(tv.checkCurrentchnel())
    tv.chandown()
    println(tv.checkCurrentchnel())
    tv.chandown()
    println(tv.checkCurrentchnel())
    tv.chandown()
    println(tv.checkCurrentchnel())
}
class TV(val channels: List<String>) {

    var onOff: Boolean = false // on==true/ off==false.

    // ------------------------------------------------------------------------------------ start 중요
    var currentChnelno = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
        get() {
            println("호출되었습니다.")
            return field + 1
        }

    // ------------------------------------------------------------------------------------ end 중요
    fun switch() {
        onOff = !onOff
    }
    fun checkCurrentchnel(): String {
        return channels[currentChnelno]
    }

    fun chanup() {
        /*if (currentChnelno==2){
            currentChnelno = 0
            return
        }*/
        currentChnelno = currentChnelno + 1

        /*channels.forEachIndexed { index, value ->
            if (currentChnelno == index){
                currentChnelno = currentChnelno + 1

                if (index==2){
                    currentChnelno = 0
                }
                return
            }
        }*/
    }
    fun chandown() {
        /*if (currentChnelno==0){
            currentChnelno = 2
            return
        }*/
        currentChnelno = currentChnelno - 1

        /*channels.forEachIndexed { index, value ->
            if (currentChnelno == index){
                currentChnelno = currentChnelno - 1

                if (index==0){
                    currentChnelno = 2
                }
                return
            }
        }*/
    }
}
