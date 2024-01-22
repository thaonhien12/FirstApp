package com.example.firstapp.tuan22

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.R

class tuan22Main3Activity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main3)
        //lv = findViewById(R.id.tuan22lv)
        lv = findViewById(R.id.tuan22lv)

        //nguon du lieu
        val arr =
            arrayOf("Mon 1", "Tuan 2", "mon 2", "mon 3", "mon 4", "mon 5", "tuan 6", "aaa", "bbb")

        val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        //hien thi
        //hien thi
        lv!!.adapter =ad


    }
}