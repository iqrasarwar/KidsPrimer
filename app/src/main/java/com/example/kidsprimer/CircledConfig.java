package com.example.kidsprimer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CircledConfig extends ArrayAdapter<CircledList> {
    public CircledConfig(@NonNull Context context, int resource, @NonNull List<CircledList> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CircledList ctg =  getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.scroll_list,parent,
                false);
        TextView txt = convertView.findViewById(R.id.textView2);
        ImageView img = convertView.findViewById(R.id.imageView2);
        TextView txt1 = convertView.findViewById(R.id.textView33);
        ImageView img1 = convertView.findViewById(R.id.imageView6);
        TextView txt2 = convertView.findViewById(R.id.textView45);
        ImageView img2 = convertView.findViewById(R.id.imageView8);
        txt.setText(ctg.getTxt());
        img.setImageResource(ctg.getImg());
        txt1.setText(ctg.getTxt1());
        img1.setImageResource(ctg.getImg1());
        txt2.setText(ctg.getTxt2());
        img2.setImageResource(ctg.getImg2());
        return convertView;
    }
}