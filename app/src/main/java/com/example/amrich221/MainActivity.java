package com.example.amrich221;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_rich);

        btn.setOnClickListener(V ->{
            Toast.makeText(this,"Button Clicked !", Toast.LENGTH_SHORT).show();
        });


    }
}