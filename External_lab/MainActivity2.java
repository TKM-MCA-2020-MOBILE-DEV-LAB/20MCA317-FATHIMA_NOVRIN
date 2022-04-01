package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t4);
        t3=findViewById(R.id.t3);
        Intent in=getIntent();
        String name=in.getStringExtra("value1");
        t1.setText(name);
        String email=in.getStringExtra("value2");
        t2.setText(email);
        String address=in.getStringExtra("value3");
        t3.setText(address);
    }
}
