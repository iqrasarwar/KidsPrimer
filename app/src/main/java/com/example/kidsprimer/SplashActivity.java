package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import android.view.WindowManager;
public class SplashActivity extends AppCompatActivity {
    MediaPlayer bg;
    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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


