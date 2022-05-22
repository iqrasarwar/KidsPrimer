package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class quiz3 extends AppCompatActivity {
    char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z'};
    int[] imgs = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
            R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
            R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
            R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
            R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
    ImageView im;
    Button b,b2;
    EditText t;
    String s = "b",s1="B";
    int indexx = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        im = findViewById(R.id.imageView4);
        b = findViewById(R.id.button5);
        b2 = findViewById(R.id.button7);
        t = findViewById(R.id.tt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().toString().equals(s) || t.getText().toString().equals(s1))
                    t.setBackgroundColor(Color.GREEN);
                else
                    t.setBackgroundColor(Color.RED);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = indexx;
                im.setImageResource(imgs[i]);
                s1 = Character.toString(letters[i+1]);
                s = Character.toString(letters[i+1]).toLowerCase();
                if(indexx <= 20)
                indexx = indexx+2;
                else
                    indexx = 1;
            }
        });
    }
}