package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CirCatag extends AppCompatActivity {

    ListView listview;
    int[] imgs;
    String [] text;
    Store s = new Store();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cir_catag);
        listview = findViewById(R.id.Ctglist);
        Intent intent = getIntent();
        if(intent.getExtras() != null)
        {
            int indexx = Integer.parseInt(intent.getStringExtra("index"));
            imgs = s.CollectionImgs[indexx];
            text = s.lists[indexx];
        }
        ArrayList<CircledList> arraylist = new ArrayList<CircledList>();
        int len = imgs.length/3;
        int left = imgs.length%3;
        int ind =0;
        for (int i = 0; i < len; i++) {
            arraylist.add(new CircledList(imgs[ind+2],text[ind+2],imgs[ind+1],text[ind+1],imgs[ind],
                    text[ind]));
            ind+=3;
        }
        CircledConfig list = new CircledConfig(this,0,arraylist);
        listview.setAdapter(list);
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                //if(l>2)
//                // {
//                Intent intent = new Intent(CirCatag.this,Slider.class);
//                intent.putExtra("index", l+"");
//                startActivity(intent);
//                // }
//            }
//        });
    }
}