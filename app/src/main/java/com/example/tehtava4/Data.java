package com.example.tehtava4;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("ID")
    private int id;
    @SerializedName("Title")
    private String title;

    public Data() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}