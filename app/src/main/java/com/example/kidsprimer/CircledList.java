package com.example.kidsprimer;

public class CircledList {
    private int img;
    private String txt;
    private int img1;
    private String txt1;
    private int img2;
    private String txt2;

    public CircledList(int img, String txt, int img1, String txt1, int img2, String txt2) {
        this.img = img;
        this.txt = txt;
        this.img1 = img1;
        this.txt1 = txt1;
        this.img2 = img2;
        this.txt2 = txt2;
    }

    public int getImg() {
        return img;
    }

    public String getTxt() {
        return txt;
    }

    public int getImg1() {
        return img1;
    }

    public String getTxt1() {
        return txt1;
    }

    public int getImg2() {
        return img2;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public void setTxt3(String txt2) {
        this.txt2 = txt2;
    }
}
