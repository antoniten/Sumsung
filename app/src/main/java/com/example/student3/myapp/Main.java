package com.example.student3.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main extends AppCompatActivity implements View.OnClickListener {

    TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        Intent intent = new Intent(Main.this, AboutClass.class);
                        startActivity(intent);
                        break;
                    case R.id.button1:
                        Intent intente = new Intent(Main.this, Third.class);
                        startActivity(intente);
                        break;
                }};
      }