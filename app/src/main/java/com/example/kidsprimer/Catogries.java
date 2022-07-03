package com.example.kidsprimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Catogries extends AppCompatActivity {
    ListView listview;
    String [] listNames = {"Alphabets A to Z","Rhymes","Numbers 1 to 100","Days of week","Months " +
            "of year","Color Names","Fruit Names","Flower Names","Animal Names","Bird Names",
            "Vegetable Names","Profession Names","Shape Names","Country Names","Know the Pakistan"};
    int [] icons = {R.drawable.alphabets,R.drawable.rhymes,R.drawable.counting,
            R.drawable.weekdays,R.drawable.months,R.drawable.colors,R.drawable.fruit,
            R.drawable.flowrs,R.drawable.animals,R.drawable.birds,R.drawable.vegtables,
            R.drawable.professions,R.drawable.shapes,R.drawable.country, R.drawable.pakistan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catogries);
        listview = findViewById(R.id.CatagoriesList);
        ArrayList<CatagList> arraylist = new ArrayList<CatagList>();
        for (int i = 0; i < 15; i++) {
            arraylist.add(new CatagList(icons[i],listNames[i],
                    R.drawable.ic_baseline_double_arrow_24));
        }
        CatagConfig list = new CatagConfig(this,0,arraylist);
        listview.setAdapter(list);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Catogries.this,Slider.class);
                String str = "A";
                intent.putExtra("SS", str);
                startActivity(intent);
            }
        });
    }
}