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
    int index;
    Store S = new Store();
    String [] text;
    int[] imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        tt = findViewById(R.id.textView2);
        iv = findViewById(R.id.imageView13);
        next = findViewById(R.id.imageView10);
        before = findViewById(R.id.imageView9);
        Intent i = getIntent();
        if(i.getExtras() != null)
        {
            int indexx = Integer.parseInt(i.getStringExtra("index"));
            text = S.Collection[indexx];
            imgs = S.CollectionImgs[indexx];
        }
        tt.setText(text[index]);
        iv.setBackgroundResource(imgs[index]);
        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                tt.setText(text[index]);
                iv.setBackgroundResource(imgs[index]);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                tt.setText(text[index]);
                iv.setBackgroundResource(imgs[index]);
            }
        });
    }
}