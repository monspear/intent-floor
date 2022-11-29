package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class jichun_floor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jichun_floor)

        var checktime: TextView = findViewById(R.id.text_time5)
        var checkfloor: TextView = findViewById(R.id.text_floor5)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")
    }
}