package com.example.latihanpraktikum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class addNumber : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number)
        var tvCounter : TextView = findViewById(R.id.tvCounter)
        var btnAdd : Button = findViewById(R.id.btnAddNumber)
        tvCounter.text = "1"

        btnAdd.setOnClickListener {
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            tvCounter.text = nextVal.toString()
        }
    }
}