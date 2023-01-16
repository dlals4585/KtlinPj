package com.ktlnpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ktlnpj.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * 람다의 대표적인 예 : 온클릭리스너
         * SAM(Single Abstract Method) : 단일 추상 메서드
         * >> 자바 함수형 인터페이스 관계에서 파생됨
         * >> 인터페이스 객체를 람다로 넘길 수 있다.
         * **/

        val view = View(this)

        //옛날 자바를 이용한 코당
        /*view.setOnClickListener(
            new View.OnClickListener (){
                @Override
                public void onClick(View:view) {
                }
            })*/

        view.setOnClickListener({
            println("람다 예제")
        })
    }
}
