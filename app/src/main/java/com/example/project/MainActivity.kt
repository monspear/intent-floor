package com.example.project

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_inmun: Button = findViewById(R.id.btn_inmun)
        val btn_jungbo: Button = findViewById(R.id.btn_jungbo)
        val btn_sanggyeong: Button = findViewById(R.id.btn_sanggyeong)
        val btn_bogun: Button = findViewById(R.id.btn_bogun)
        btn_inmun.setOnClickListener{
            val intent = Intent(this,inmunActivity::class.java)
            startActivity(intent)
        }

        btn_jungbo.setOnClickListener{
            val intent = Intent(this,jungboActivity::class.java)
            startActivity(intent)
        }

        btn_sanggyeong.setOnClickListener{
            val intent = Intent(this,sanggyeongActivity::class.java)
            startActivity(intent)
        }

        btn_bogun.setOnClickListener{
            val intent = Intent(this,bogunActivity::class.java)
            startActivity(intent)
        }
    }


}

