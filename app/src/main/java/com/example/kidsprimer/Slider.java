package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Slider extends AppCompatActivity {
    TextView tt;
    ImageView iv,next,before;
    String s;
    int index;
    char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z'};
    int[] imgs = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
            R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
            R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
            R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
            R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        tt = findViewById(R.id.textView2);
        iv = findViewById(R.id.imageView13);
        next = findViewById(R.id.imageView10);
        before = findViewById(R.id.imageView9);
        s =Character.toString(letters[index]);
        tt.setText(s);
        iv.setBackgroundResource(imgs[index]);
        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                s =Character.toString(letters[index]);
                tt.setText(s);
                iv.setBackgroundResource(imgs[index]);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                s =Character.toString(letters[index]);
                tt.setText(s);
                iv.setBackgroundResource(imgs[index]);
            }
        });
    }
}