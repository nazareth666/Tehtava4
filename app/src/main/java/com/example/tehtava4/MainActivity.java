package com.example.tehtava4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public class parse {
        int id;
        int userid;
        int title;
        int body;
    }

    ArrayList<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
