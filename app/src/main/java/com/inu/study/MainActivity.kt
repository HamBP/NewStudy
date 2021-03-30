package com.inu.study

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            val id = findViewById<EditText>(R.id.input_id)
            val pw = findViewById<EditText>(R.id.input_password)
            // 아이디 혹은 비밀번호가 비어있을 경우
            if(id.text.toString().isEmpty() || pw.text.toString().isEmpty()) {
                Toast.makeText(this,
                        "아이디 혹은 비밀번호를 입력하지 않았습니다.",
                        Toast.LENGTH_SHORT).show()

                if(id.text.toString().isEmpty()) id.requestFocus()
                else pw.requestFocus()
            }
            else findViewById<TextView>(R.id.error_message).visibility = View.VISIBLE
        }
    }
}

