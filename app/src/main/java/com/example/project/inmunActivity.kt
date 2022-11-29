package com.example.project

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class inmunActivity : AppCompatActivity() {
    private lateinit var btn_inmun1: Button
    private lateinit var btn_inmun2: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_inmun)

        btn_inmun1 = findViewById(R.id.button_1inmun)
        val inmun1Floor: Array<String> = arrayOf("2층", "3층", "4층", "5층", "6층")
        var flag:String = "10"
        btn_inmun1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(inmun1Floor,
                    DialogInterface.OnClickListener() { dialog, which ->
                        if(which == 0) {
                            val intent = Intent(this, inmun1_2floor::class.java)
                            intent.putExtra("time",flag)
                            startActivity(intent)
                        }
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_inmun2 = findViewById(R.id.button_2inmun)
        val inmun2Floor: Array<String> = arrayOf("2층", "3층", "4층", "5층")
        btn_inmun2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(inmun2Floor,
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

/*
 private lateinit var sanhakBtn: Button
    private lateinit var gonghakBtn: Button
    private lateinit var changeuiBtn: Button
    private lateinit var jungboBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sanhakBtn = findViewById(R.id.button_sanhak)
        var sanhakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        sanhakBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(sanhakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        gonghakBtn = findViewById(R.id.button_gonghak)
        var gonghakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        gonghakBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(gonghakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                        // 선택한 층값에 따른 화면전환
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        changeuiBtn = findViewById(R.id.button_changeui)
        var changeuiFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        changeuiBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(changeuiFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        jungboBtn = findViewById(R.id.button_jungbo)
        var jungboFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층", "9층")
        jungboBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jungboFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }
    }
 */