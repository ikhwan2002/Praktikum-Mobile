package com.example.latihanpraktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddNumber: Button = findViewById(R.id.btn_move_addnumber)
        btnAddNumber.setOnClickListener(this)

        val btnAddText: Button = findViewById(R.id.btn_move_addtext)
        btnAddText.setOnClickListener(this)

        val btnRuangKubus: Button = findViewById(R.id.btn_move_ruangkubus)
        btnRuangKubus.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_addnumber -> {
                val moveIntent = Intent(this@MainActivity, addNumber::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_addtext -> {
                val moveIntent = Intent(this@MainActivity, addText::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_ruangkubus -> {
                val moveIntent = Intent(this@MainActivity, ruangKubus::class.java)
                startActivity(moveIntent)
            }
        }
    }
}