package com.example.tehtava4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RequestQueue que;
    private Button button;
    private static final String ENDPOINT = "https://jsonplaceholder.typicode.com/posts";
    private MyListAdapter Adapteri;
    private List<luokka> luokka;
    private ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        this.button = findViewById(R.id.button);
        this.que = Volley.newRequestQueue(this);
        this.lista = findViewById(R.id.lista);

        luokka = new ArrayList<>();

        Adapteri = new MyListAdapter(this,R.layout.list_layout, luokka);


        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JsonArrayRequest request = new JsonArrayRequest(ENDPOINT, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //luokka luokka;

                        Type listantyyppi = new TypeToken<ArrayList<luokka>>() {
                        }.getType();
                        Gson gson = new Gson();


                        ArrayList<luokka> lista = gson.fromJson(response.toString(), listantyyppi);

                        Adapteri.addAll(lista);
                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.toString();
                    }

                });

                que.add(request);
                button.setVisibility(View.GONE);

            }

        });
    }
}
