package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Catogries extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catogries);
        listview = findViewById(R.id.CatagoriesList);
        ArrayList<CatagList> arraylist = new ArrayList<CatagList>();
        arraylist.add(new CatagList(R.drawable.rhymes,"Rhymes",
                R.drawable.ic_baseline_double_arrow_24));
        CatagConfig list = new CatagConfig(this,0,arraylist);
        listview.setAdapter(list);
    }
}