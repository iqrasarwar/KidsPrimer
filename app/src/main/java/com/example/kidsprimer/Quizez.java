package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quizez extends AppCompatActivity {
    TextView q1,q2,q3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizez);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
//        q1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Quizez.this,quiz1.class);
//                startActivity(intent);
//            }
//        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quizez.this,quiz2.class);
                startActivity(intent);
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quizez.this,quiz3.class);
                startActivity(intent);
            }
        });
    }
}