package com.example.firstapp.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.firstapp.R;

public class tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan22ListView);
        //nguon du lieu
        String[] arr =new String [] {"Mon 1","Tuan 2","mon 2","mon 3","mon 4","mon 5","tuan 6","aaa","bbb"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,arr);
        //hien thi
        lv.setAdapter(adapter);
    }
}