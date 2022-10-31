package com.example.latihanpraktikum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class addText : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_text)

        var sayHello: TextView = findViewById(R.id.tv_halo)
        var editName: EditText = findViewById(R.id.edt_name)
        var btnHello: Button = findViewById(R.id.btn_halo)
        var editNim: EditText = findViewById(R.id.edt_nim)
        var editProdi: EditText = findViewById(R.id.edt_prodi)

        btnHello.setOnClickListener {
            val nama = editName.text.toString()
            val nim = editNim.text.toString()
            val prodi = editProdi.text.toString()
            sayHello.text = "Hai!Selamat datang $nama dengan NIM $nim dari prodi $prodi"
        }
    }
}