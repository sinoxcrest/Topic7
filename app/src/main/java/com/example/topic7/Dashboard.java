package com.example.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
Button btnadd,btndisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    btnadd=findViewById(R.id.btnADD);
    btndisplay=findViewById(R.id.btnDisplay);
    btnadd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Dashboard.this,MainActivity.class);
            startActivity(intent);
        }
    });
    btndisplay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent1=new Intent(Dashboard.this,Display.class);
            startActivity(intent1);
        }
    });
    }
}
