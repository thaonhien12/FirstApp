package com.example.firstapp.tuan41;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstapp.R;

public class tuan413MainActivity extends AppCompatActivity {
    Button btngetData;
    TextView tvKQ;
    Context context=this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan413_main);
        tuan41VolleyFn volleyFn =new tuan41VolleyFn();
        tvKQ =findViewById(R.id.tuan413TvKQ);
        btngetData =findViewById(R.id.tuan413Btn);
        btngetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvKQ);
            }
        });

    }
}