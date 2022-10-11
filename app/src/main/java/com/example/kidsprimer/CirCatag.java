package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CirCatag extends AppCompatActivity {

    ListView listview;
    int[] imgs;
    String [] text;
    Store s = new Store();
    CircledList[] cirlist;
    Button btn;
    int indexx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cir_catag);
        listview = findViewById(R.id.Ctglist);
        btn = findViewById(R.id.button8);
        Intent intent = getIntent();
        if(intent.getExtras() != null)
        {
            indexx = Integer.parseInt(intent.getStringExtra("index"));
            imgs = s.listImgs[indexx];
            text = s.lists[indexx];
        }
        ArrayList<CircledList> arraylist = new ArrayList<CircledList>();
        int len = imgs.length/3;
        cirlist = new CircledList[imgs.length];
        int left = imgs.length%3;
        int ind =0,i=0;
        for (i = 0; i < len; i++) {
            cirlist[i] = new CircledList(imgs[ind+2],text[ind+2],imgs[ind+1],text[ind+1],imgs[ind],
                    text[ind]);
            arraylist.add(cirlist[i]);
            ind+=3;
        }
        if(left == 2)
        {
            cirlist[i] = new CircledList(0,null,imgs[ind+1],text[ind+1],imgs[ind],
                    text[ind]);
            arraylist.add(cirlist[i]);
        }
        if(left == 1)
        {
            cirlist[i] = new CircledList(0,
                    null,0,null,imgs[ind],text[ind]);
            arraylist.add(cirlist[i]);
        }
        CircledConfig list = new CircledConfig(this,0,arraylist);
        listview.setAdapter(list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CirCatag.this,Slider.class);
                intent.putExtra("index", indexx+"");
                startActivity(intent);
            }
        });
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(CirCatag.this,Slider.class);
//                l = l+cirlist[(int)l].getIndexOfCol();
//                intent.putExtra("index", l+"");
//                startActivity(intent);
//            }
//        });
    }
}