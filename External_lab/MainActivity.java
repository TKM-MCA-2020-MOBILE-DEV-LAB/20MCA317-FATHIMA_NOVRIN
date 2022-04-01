package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.name);
        e2 = findViewById(R.id.email);
        e3 = findViewById(R.id.add);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp=getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor edt=sp.edit();
                edt.putString("key1",e1.getText().toString());
                edt.putString("key2",e2.getText().toString());
                edt.putString("key3",e3.getText().toString());
                edt.apply();

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                String str1="name :         "+e1.getText().toString();
                String str2="email :        "+e2.getText().toString();
                String str3="address :      "+e3.getText().toString();

                i.putExtra("value1",str1);
                i.putExtra("value2",str2);
                i.putExtra("value3",str3);
                startActivity(i);

            }
        });

        SharedPreferences s=getSharedPreferences("pref",MODE_PRIVATE);
        String value1=s.getString("key1","");
        String value2=s.getString("key2","");
        String value3=s.getString("key3","");
        e1.setText((value1));
        e2.setText((value2));
        e3.setText((value3));

    }

}

