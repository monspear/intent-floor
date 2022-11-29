package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class jungbo_floor : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jungbo_floor)

        var checktime: TextView = findViewById(R.id.text_time)
        var checkfloor: TextView = findViewById(R.id.text_floor)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

    }
}