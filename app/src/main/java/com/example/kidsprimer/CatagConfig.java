package com.example.kidsprimer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CatagConfig extends ArrayAdapter<CatagList>
{
    public CatagConfig(@NonNull Context context, int resource,
                       @NonNull List<CatagList> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CatagList ctg =  getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_for_catagories,parent,
                false);
        TextView txt = convertView.findViewById(R.id.textView44);
        ImageView arrow = convertView.findViewById(R.id.imageView5);
        ImageView img = convertView.findViewById(R.id.imageView3);
        txt.setText(ctg.getTxt());
        img.setImageResource(ctg.getImg());
        arrow.setImageResource(ctg.getArrow());
        return convertView;
    }
}
