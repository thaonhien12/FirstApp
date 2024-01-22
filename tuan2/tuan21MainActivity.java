package com.example.firstapp.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.firstapp.R;
import com.google.android.material.badge.BadgeUtils;

public class tuan21MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1=findViewById(R.id.tuan21txt1);
        txt2=findViewById(R.id.tuan21txt2);
        btn1=findViewById(R.id.tuan21btn1);
        //tao su kien
        btn1.setOnClickListener(v-> {
            //dinh huong di chuyen
            Intent i=new Intent(tuan21MainActivity.this,tuan21SecondActivity.class);
            //dua du lieu vao
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());

        });
    }
}