package com.example.project

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class sanggyeongActivity : AppCompatActivity() {
    private lateinit var btn_bubjung: Button
    private lateinit var btn_sanggyeong: Button
    private lateinit var btn_gugje: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanggyeong)

        btn_bubjung = findViewById(R.id.button_bubjung)
        val bubjungFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층")
        btn_bubjung.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(bubjungFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_sanggyeong = findViewById(R.id.button_sanggyeong)
        val sanggyeongFloor: Array<String> = arrayOf("2층", "3층", "4층", "5층", "6층")
        btn_sanggyeong.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(sanggyeongFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                        // 선택한 층값에 따른 화면전환
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_gugje = findViewById(R.id.button_gugje)
        val gugjeFloor: Array<String> = arrayOf("4층", "5층", "6층", "7층", "8층", "9층")
        btn_gugje.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(gugjeFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }


    }
}