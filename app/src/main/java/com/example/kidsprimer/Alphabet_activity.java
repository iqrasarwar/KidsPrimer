package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Alphabet_activity extends AppCompatActivity
{
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        tt = findViewById(R.id.textView30);
        //Intent intent = new Intent(Alphabet_activity.this,ScrollList.class);
        Intent i = new Intent();
        tt.setText(i.getStringExtra("key"));
        //startActivity(intent);
    }
}