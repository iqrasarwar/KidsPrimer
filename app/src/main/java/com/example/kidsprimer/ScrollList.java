package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScrollList extends AppCompatActivity {

    int[] ids = {R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,
            R.id.textView9,R.id.textView10,R.id.textView11,
                R.id.textView12,R.id.textView13,R.id.textView14,R.id.textView15,R.id.textView16,
            R.id.textView17,R.id.textView18,R.id.textView19,
                R.id.textView20,R.id.textView21,R.id.textView22,R.id.textView23,R.id.textView24,
            R.id.textView25,R.id.textView26,R.id.textView27,R.id.textView28,R.id.textView29};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_list);

    }
}