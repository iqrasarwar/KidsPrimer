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
    ImageView iv,next,before;
    int index = 0;
    Store S = new Store();
    String [] text;
    int[] imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        iv = findViewById(R.id.imageView13);
        next = findViewById(R.id.imageView10);
        before = findViewById(R.id.imageView9);
        Intent i = getIntent();
        if(i.getExtras() != null)
        {
            int indexx = Integer.parseInt(i.getStringExtra("index"));
            imgs = S.CollectionImgs[indexx];
        }
        if(index==0)
            before.setVisibility(View.INVISIBLE);
        if(index == imgs.length-1)
            next.setVisibility(View.INVISIBLE);
        iv.setBackgroundResource(imgs[index]);
        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                iv.setBackgroundResource(imgs[index]);


                if(index==0)
                    before.setVisibility(View.INVISIBLE);
                else
                    before.setVisibility(View.VISIBLE);
                if(index!= imgs.length-1)
                    next.setVisibility(View.VISIBLE);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                iv.setBackgroundResource(imgs[index]);


                if(index== imgs.length-1)
                    next.setVisibility(View.INVISIBLE);
                else
                    next.setVisibility(View.VISIBLE);
                if(index!=0)
                    before.setVisibility(View.VISIBLE);
            }
        });
    }
}