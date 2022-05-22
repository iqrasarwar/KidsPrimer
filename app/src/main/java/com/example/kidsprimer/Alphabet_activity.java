package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Alphabet_activity extends AppCompatActivity
{
    TextView tt;
    ImageView iv;
    char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
        'T','U','V','W','X','Y','Z'};
    int[] imgs = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
            R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
            R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
            R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
            R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        tt = findViewById(R.id.textView30);
        iv = findViewById(R.id.imageView);
        Intent i = getIntent();
        tt.setText(i.getStringExtra("non empty"));
        if(i.getExtras() != null)
        {
            int index = Integer.parseInt(i.getStringExtra("SS"));
            String ch =Character.toString(letters[index]);
            tt.setText(ch);
            tt.setTextColor(Color.RED);
            tt.setTextSize(60);
            tt.setHeight(250);
            iv.setBackgroundResource(imgs[index]);
        }
        else
            tt.setText(i.getStringExtra("empty"));
    }
}