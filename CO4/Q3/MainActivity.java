package com.example.themes; 
import androidx.appcompat.app.AppCompatActivity; 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import com.example.manifest.R; 
public class MainActivity extends AppCompatActivity { @Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
} 
public void onSubmit(View view){ 
Intent i = new Intent(getApplicationContext(), MainActivity2.class); startActivity(i); 
}
} 
