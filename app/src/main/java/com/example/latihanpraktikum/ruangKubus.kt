package com.example.latihanpraktikum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ruangKubus : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruang_kubus)

        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.btnCalculate) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            var fieldKosong = false

            if (inputLength.isEmpty()) {
                fieldKosong = true
                edtLength.error = "Jangan dikosongin dong :("
            }
            if (inputWidth.isEmpty()) {
                fieldKosong = true
                edtWidth.error = "Ini juga jangan kosong :)"
            }
            if (inputHeight.isEmpty()) {
                fieldKosong = true
                edtHeight.error = "Isi pokoknya!"
            }

            if (!fieldKosong) {
                val volume = inputLength.toDouble() *
                        inputWidth.toDouble() *
                        inputHeight.toDouble()

                tvResult.text = volume.toString()
            }
        }
    }
}