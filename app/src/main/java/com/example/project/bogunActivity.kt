package com.example.project

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class bogunActivity : AppCompatActivity() {
    private lateinit var btn_bogun: Button
    private lateinit var btn_lifescience: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bogun)

        btn_bogun = findViewById(R.id.button_bogun)
        val bogunFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층", "9층", "10층")
        btn_bogun.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(bogunFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_lifescience = findViewById(R.id.button_lifescience)
        val lifescienceFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_lifescience.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(lifescienceFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                        // 선택한 층값에 따른 화면전환
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

    }
}