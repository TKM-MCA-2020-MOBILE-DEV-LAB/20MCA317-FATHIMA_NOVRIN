package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button view,add;
    EditText name,age;
    Switch active;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=findViewById(R.id.button);
        add=findViewById(R.id.button2);
        name=findViewById(R.id.editTextTextPersonName);
        age=findViewById(R.id.editTextTextPersonName2);
        active=findViewById(R.id.switch1);
        lv=findViewById(R.id.list);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "View all", Toast.LENGTH_SHORT).show();

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                try {
                    customer cus=new customer(1,Integer.parseInt(age.getText().toString()),name.getText().toString(),active.isChecked());
                    dB database=new dB(MainActivity.this);
                    Boolean sucess=database.insert(cus);
                    if(sucess){
                        Toast.makeText(MainActivity.this,"sucess", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(MainActivity.this,"fail", Toast.LENGTH_SHORT).show();
                    }


                }catch (Exception e)
                {

                    Toast.makeText(MainActivity.this, "error occured", Toast.LENGTH_SHORT).show();

            }

            }
        });
    }



}
