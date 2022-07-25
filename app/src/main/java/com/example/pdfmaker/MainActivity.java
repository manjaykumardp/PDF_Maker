package com.example.pdfmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton b1=findViewById(R.id.info);
        b1.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),info.class)));


        ImageButton b5=findViewById(R.id.pdftoword);
        b5.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),wordTpdf.class)));



    }
}