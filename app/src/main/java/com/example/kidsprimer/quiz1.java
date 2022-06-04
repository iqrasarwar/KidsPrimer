package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;

public class quiz1 extends AppCompatActivity {
    Button b1;
    int[] rids = {R.id.radioButton, R.id.radioButton2, R.id.radioButton3, R.id.radioButton4,
            R.id.radioButton5, R.id.radioButton7, R.id.radioButton8, R.id.radioButton9,
            R.id.radioButton10};
    RadioButton[] r = new RadioButton[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        b1 = findViewById(R.id.button2);
        for (int i = 0; i < rids.length; i++) {
            r[i] = findViewById(rids[i]);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//TODO:LIST VIEW
                //TODO:CUTOM LIST VIEW
                //TODO:aLERTS
                //LIFE CYCLE

//                if(r[1].isChecked())
//                    r[1].setText("Correct");
//                if(r[3].isChecked())
//                    r[3].setTextColor(Color.GREEN);
//                if(r[6].isChecked())
//                    r[6].setTextColor(Color.GREEN);
//                if(r[0].isChecked())
//                    r[0].setTextColor(Color.RED);
//                if(r[2].isChecked())
//                    r[2].setTextColor(Color.RED);
//                if(r[4].isChecked())
//                    r[4].setTextColor(Color.RED);
//                if(r[5].isChecked())
//                    r[5].setTextColor(Color.RED);
//                if(r[7].isChecked())
//                    r[7].setTextColor(Color.RED);
//                if(r[8].isChecked())
//                    r[8].setTextColor(Color.RED);
            }
        });

    }

}