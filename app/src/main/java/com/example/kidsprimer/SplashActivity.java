package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import android.view.WindowManager;
public class SplashActivity extends AppCompatActivity {
    MediaPlayer bg;
    private static int SPLASH_SCREEN_TIME_OUT=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                'T','U','V','W','X','Y','Z'};
        int[] imgs = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
                R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
                R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
                R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
                R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        bg = MediaPlayer.create(SplashActivity.this,R.raw.kids);
        bg.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        bg.release();
    }
}


