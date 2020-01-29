package com.example.tehtava4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.google.gson.Gson;

import org.json.JSONArray;

import java.util.ArrayList;

import static com.android.volley.Request.Method.GET;

public class MainActivity extends AppCompatActivity {

    public class jsonData {
        int id;
        int userid;
        String title;
        String body;
    }

    ArrayList<String> lista;
    RequestQueue queue;
    private Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final JsonArrayRequest jsonArrayRequest
                = new JsonArrayRequest(
                GET,
                "https://jsonplaceholder.typicode.com/posts ",
                null,
                new Response.Listener<JSONArray>() {@Override
                    public void onResponse(JSONArray response)
                    {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                    }
                });

        queue.add(jsonArrayRequest);


    }


}
