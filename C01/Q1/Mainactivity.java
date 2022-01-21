package com.example.a19mca43.myapplication;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
EditText name,password;
Button login;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
name=findViewById(R.id.name);
password=findViewById(R.id.password);
login=findViewById(R.id.login);
login.setOnClickListener(new View.OnClickListener() {
   @RequiresApi(api = Build.VERSION_CODES.KITKAT)
   @Override
   public void onClick(View v) {
       if (!Objects.equals( name.getText().toString(), "nourin" ) || !Objects.equals( password.getText().toString(), "nourin" )) {
           Toast.makeText(MainActivity.this," failed",Toast.LENGTH_LONG).show();
       } else {
           Toast.makeText(MainActivity.this,"successfully login",Toast.LENGTH_LONG).show();
       }
   }
});
   }
}
