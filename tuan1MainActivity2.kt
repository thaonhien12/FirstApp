package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tuan1MainActivity2 : AppCompatActivity() {
    // khai bao control
    var txt1:EditText?= null;
    var txt2:EditText?= null;
    var btn1:Button ?= null;
    var tv1:TextView ?= null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan11_main)

        //anh xa cac control
        txt1 = findViewById(R.id.demo11_txt1)
        txt2 = findViewById<View>(R.id.demo11_txt2)
        btn1 = findViewById(R.id.demo11_btn1)
        tv1 = findViewById(R.id.demo11tv1)


        //xu li du kien
        btn1.setOnClickListener(View.OnClickListener { v: View? ->
            //goi ham tinh tong
            tinhTong()
        })

    }
    private fun tinhTong() {
        //lay du lieu tu edit text
        val str1 = txt1!!.text.toString()
        //chuyen sang kieu so
        val so1 = str1.toFloat()

        val str2 = txt2!!.text.toString()
        val so2 = str2.toFloat()

        //tinh tong
        val tong = so1 + so2
        //in kqua ra man hinh
        tv1!!.text = tong.toString()
    }


}