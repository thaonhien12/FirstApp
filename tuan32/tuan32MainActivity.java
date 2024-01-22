package com.example.firstapp.tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.firstapp.R;

import java.util.ArrayList;

public class tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32lv);
        ls.add(new T32Contact("NGUYEN VAN A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("NGUYEN VAN B","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("NGUYEN VAN G","14",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("NGUYEN VAN EWW","17",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("NGUYEN VAN TTH","16",R.drawable.ic_launcher_background));

        adapter =new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}