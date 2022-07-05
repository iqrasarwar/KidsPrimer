package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Slider extends AppCompatActivity {
    ImageView iv,next,before;
    int index = 0;
    Store S = new Store();
    int[] imgs;
    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        iv = findViewById(R.id.imageView13);
        next = findViewById(R.id.imageView10);
        before = findViewById(R.id.imageView9);
        m = MediaPlayer.create(Slider.this, R.raw.tuseday);
        m.start();
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
                m = MediaPlayer.create(Slider.this, R.raw.tuseday);
                m.start();

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
                m = MediaPlayer.create(Slider.this, R.raw.tuseday);
                m.start();

                if(index== imgs.length-1)
                    next.setVisibility(View.INVISIBLE);
                else
                    next.setVisibility(View.VISIBLE);
                if(index!=0)
                    before.setVisibility(View.VISIBLE);
            }
        });
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        m.release();
    }
}