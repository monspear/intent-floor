package com.example.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class inmun1_2floor : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inmun12floor)


        var checktest: TextView = findViewById(R.id.textView2)

        checktest.text = intent.getStringExtra("time")


        val btn_back_to_home: Button = findViewById(R.id.back_to_home)
        btn_back_to_home.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
//https://blog.yena.io/studynote/2017/11/28/Android-Kotlin-putExtra.html