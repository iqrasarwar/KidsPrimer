package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class quiz2 extends AppCompatActivity {
    Button b;
    EditText t1,t2,t3,t4,t5;
    String s1,s2,s3,s4,s5;
    boolean s = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
         b = findViewById(R.id.button6);
         t1 = findViewById(R.id.t1);
         t2 = findViewById(R.id.t2);
         t3 = findViewById(R.id.t3);
         t4 = findViewById(R.id.t4);
         t5 = findViewById(R.id.t5);
         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 s = true;
                 s1 = t1.getText().toString();
                 s2 = t2.getText().toString();
                 s3 = t3.getText().toString();
                 s4 = t4.getText().toString();
                 s5 = t5.getText().toString();
                 if(s1.equals("i") || s1.equals("I"))
                     t1.setBackgroundColor(Color.GREEN);
                 else
                     t1.setBackgroundColor(Color.RED);
                 if(s2.equals("j") || s2.equals("J"))
                     t2.setBackgroundColor(Color.GREEN);
                 else
                     t2.setBackgroundColor(Color.RED);
                 if(s3.equals("E") || s3.equals("e"))
                     t3.setBackgroundColor(Color.GREEN);
                 else
                     t3.setBackgroundColor(Color.RED);
                 if(s4.equals("T") || s4.equals("t"))
                     t4.setBackgroundColor(Color.GREEN);
                 else
                     t4.setBackgroundColor(Color.RED);
                 if(s5.equals("S") || s5.equals("s"))
                     t5.setBackgroundColor(Color.GREEN);
                 else
                     t5.setBackgroundColor(Color.RED);

             }
         });
    }
    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("t1",s1);
        outState.putString("t2",s2);
        outState.putString("t3",s3);
        outState.putString("t4",s4);
        outState.putString("t5",s5);
        outState.putBoolean("submit",s);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String ss1 = savedInstanceState.getString("t1");
        String ss2 = savedInstanceState.getString("t2");
        String ss3 = savedInstanceState.getString("t3");
        String ss4 = savedInstanceState.getString("t4");
        String ss5 = savedInstanceState.getString("t5");
        boolean s = savedInstanceState.getBoolean("submit");
        t1.setText(ss1);
        t2.setText(ss2);
        t3.setText(ss3);
        t4.setText(ss4);
        t5.setText(ss5);
        if(s)
        {
            if(ss1.equals("i") || ss1.equals("I"))
                t1.setBackgroundColor(Color.GREEN);
            else
                t1.setBackgroundColor(Color.RED);
            if(ss2.equals("j") || ss2.equals("J"))
                t2.setBackgroundColor(Color.GREEN);
            else
                t2.setBackgroundColor(Color.RED);
            if(ss3.equals("E") || ss3.equals("e"))
                t3.setBackgroundColor(Color.GREEN);
            else
                t3.setBackgroundColor(Color.RED);
            if(ss4.equals("T") || ss4.equals("t"))
                t4.setBackgroundColor(Color.GREEN);
            else
                t4.setBackgroundColor(Color.RED);
            if(ss5.equals("S") || ss5.equals("s"))
                t5.setBackgroundColor(Color.GREEN);
            else
                t5.setBackgroundColor(Color.RED);
        }
    }
}