package com.example.firstapp.tuan22

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.R

class tuan22secondActivity : AppCompatActivity() {
    var Tv1:TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22second)
        Tv1 = findViewById<TextView>(R.id.tuan22Tv1)
        //don du lieu
        val i1 = intent
        //go hang
        val chuoi1 = i1.extras!!.getString("so1")
        val chuoi2 = i1.extras!!.getString("so2")

        val so1 = chuoi1!!.toFloat() //chuyen sang so

        val so2 = chuoi2!!.toFloat()
        val tong = so1 + so2

        //hien thi ket qua
        Tv1!!.text=tong.toString()
    }
}