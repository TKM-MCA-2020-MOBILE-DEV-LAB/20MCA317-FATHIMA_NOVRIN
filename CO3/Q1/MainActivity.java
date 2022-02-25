package com.example.model_ex;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   ListView list;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       try {
//            ListView list = findViewById(R.id.a1);
           String[] item = {"Mohanlal", "Mammooty", "Dulquer Salman", "Nivin Pauly", "Jayasurya", "Pranav Mohanlal", "Suresh Gopi", "Dileep", "Jayaram", "Abhishek Mohan"};
           ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, item);
       list.setAdapter(myAdapter);
       }
       catch(Exception e){
           Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

       }

   }
}
