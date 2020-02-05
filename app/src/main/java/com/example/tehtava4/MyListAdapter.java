package com.example.tehtava4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyListAdapter extends ArrayAdapter<TitleBody>{

    private Context context;
    private ArrayList<TitleBody> dataset;
   // TitleBody TitleBody;


    public MyListAdapter (@NonNull Context context,
                          int resource,
                          @NonNull List<TitleBody> objects){

        super(context, resource, objects);
        this.context = context;
        this.dataset = (ArrayList<TitleBody>)objects;

    }

    @SuppressLint("ViewHolder")
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(context);



         View v = layoutInflater.inflate(R.layout.list_layout,parent,false);



            TextView lista = v.findViewById(R.id.title);
            TextView lista2 = v.findViewById(R.id.body);


            lista.setText(dataset.get(position).getTitle());
            lista2.setText(dataset.get(position).getBody());

        return v;
    }

}
