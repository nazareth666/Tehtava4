package com.example.tehtava4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;

public class MyListAdapter extends ArrayAdapter<luokka>{

    private Context context;
    private ArrayList<luokka> dataset;
   // luokka luokka;


    public MyListAdapter (@NonNull Context context,
                          int resource,
                          @NonNull List<com.example.tehtava4.luokka> objects){

        super(context, resource, objects);
        this.context = context;
        this.dataset = (ArrayList<luokka>)objects;

    }

    @SuppressLint("ViewHolder")
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v;


            v = layoutInflater.inflate(R.layout.list_layout,parent,false);
            //LinearLayout linearLayout = (LinearLayout) v;

            TextView lista = v.findViewById(R.id.title);
            TextView lista2 = v.findViewById(R.id.body);


            lista.setText(dataset.get(position).getTitle());
            lista2.setText(dataset.get(position).getBody());

        return v;
    }

}
