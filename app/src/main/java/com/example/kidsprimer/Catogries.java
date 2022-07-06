package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Catogries extends AppCompatActivity {

    ListView listview;
    Store s = new Store();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catogries);
        listview = findViewById(R.id.CatagoriesList);
        ArrayList<CatagList> arraylist = new ArrayList<CatagList>();
        for (int i = 0; i < 15; i++) {
            arraylist.add(new CatagList(s.icons[i],(String)s.listNames[i],
                    R.drawable.ic_baseline_double_arrow_24));
        }
        CatagConfig list = new CatagConfig(this,0,arraylist);
        listview.setAdapter(list);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(l>2)
                {
                    Intent intent = new Intent(Catogries.this,Slider.class);
                    intent.putExtra("index", l+"");
                    startActivity(intent);
               }
                if(l==0)
                {
                    Intent intent = new Intent(Catogries.this,CirCatag.class);
                    intent.putExtra("index", l+"");
                    startActivity(intent);
                }
            }
        });
    }
}