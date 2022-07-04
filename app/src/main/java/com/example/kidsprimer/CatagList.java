package com.example.kidsprimer;

import android.widget.ImageView;
import android.widget.TextView;

public class CatagList {
    private int img;
    private String txt;
    private int arrow;

    public CatagList(int imga, String txt, int arrow) {
        this.img = img;
        this.txt = txt;
        this.arrow = arrow;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }
}
