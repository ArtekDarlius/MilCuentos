package com.example.milcuentos.Class;

import android.media.Image;
import android.widget.ImageView;

public class Story {
    private String title;
    private String text;

    private int portada;

    public Story(String title, String text,int portada) {
        this.title = title;
        this.text= text;
        this.portada= portada;
    }

    public String getTitle() {
        return title;
    }

    public String getText(){ return text; }

    public int getPortada(){return portada;}



}
