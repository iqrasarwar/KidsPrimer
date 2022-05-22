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
                 String s1 = t1.getText().toString();
                 String s2 = t2.getText().toString();
                 String s3 = t3.getText().toString();
                 String s4 = t4.getText().toString();
                 String s5 = t5.getText().toString();
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
}