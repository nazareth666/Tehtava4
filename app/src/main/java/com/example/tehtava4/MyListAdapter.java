package com.example.tehtava4;

import android.content.Context;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyListAdapter extends ArrayAdapter{
    private int line_layout;
    private int textviewid;
    private Context context;
    private ArrayList<String> lista;
    private LayoutInflater inflater;


    public MyListAdapter (@NonNull Context context,
                          int resource,
                          int textViewResourceId,
                          @NonNull ArrayList<String> objects){
        super(context, resource, textViewResourceId);
        this.context = context;
        line_layout = resource;
        textviewid = textViewResourceId;
        lista = objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v;
        if (convertView == null){
            v = convertView;
        }
        else {
            v = convertView;
        }
        return v;
    }

}
