package com.example.kidsprimer;
//storing all the ssets refrences
public class Store {
    int [][] Collection;
    int [][] CollectionImgs;
    String[] listNames;
    int[] icons;

    public Store() {
        int[] alphabets = {
                R.raw.l1,R.raw.l2,R.raw.l3,R.raw.l4,R.raw.l5,R.raw.l6,R.raw.l7,R.raw.l8,R.raw.l9,
                R.raw.l10,R.raw.l11,R.raw.l12,R.raw.l13,R.raw.l14,R.raw.l15,R.raw.l16,R.raw.l17,
                R.raw.l18,
                R.raw.l19,R.raw.l20,R.raw.l21,R.raw.l22,R.raw.l23,R.raw.l24,R.raw.l25,R.raw.l26
                //"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q",
                //                "R","S",
                //                "T","U","V","W","X","Y","Z"
        };
        int[] alphabets1 = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
                R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
                R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
                R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
                R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
        int[] rhymes = {R.raw.tt,R.raw.jj,R.raw.hd,R.raw.rr};
        int[] rhymes1 = {R.drawable.tt,R.drawable.jj,R.drawable.hd,R.drawable.rr};
        int[]Numbers = {};
        int[]Numbers1 = {};
        int[] Days = {
                R.raw.mond,R.raw.tuesday,R.raw.wednesdy,R.raw.wd4,R.raw.wd5,R.raw.wd6,R.raw.wd7
                //"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday",
                //"Sunday"
        };
        int[] Days1 = {R.drawable.wd1,R.drawable.wd2,R.drawable.wd3,R.drawable.wd4,
                R.drawable.wd5,R.drawable.wd6,R.drawable.wd7};
        int[] Months= {
                //"January","February","March","April","May","June","July","August",
                //                "September","October","November","December"
                R.raw.m1,R.raw.m2,R.raw.m3,R.raw.m4,R.raw.m5,R.raw.m6,R.raw.m7,R.raw.m8,R.raw.m9,
                R.raw.m10,R.raw.m11,R.raw.m12
        };
        int[] Months1 = {R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,
                R.drawable.m6,R.drawable.m7,R.drawable.m8,R.drawable.m9,R.drawable.m10,
                R.drawable.m11,R.drawable.m12};
        int[] Colors = {R.raw.blue,R.raw.red,R.raw.yellow,R.raw.blck,R.raw.ink,R.raw.green,
                R.raw.ornge,R.raw.white};
        int[] Colors1 = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
                R.drawable.c6,R.drawable.c7,R.drawable.c8};
        int[] Fruits = {};
        int[] Fruits1 = {};
        int[] Flowers = {};
        int[] Flowers1 = {};
        int[] animals = {};
        int[] animals1 = {};
        int[] Birds = {};
        int[] Birds1 = {};
        int[] Vegetables = {};
        int[] Vegetables1 = {};
        int[] professionals = {};
        int[] professionals1 = {};
        int[] Shapes = {};
        int[] Shapes1 = {};
        listNames = new String[]{"Alphabets A to Z", "Rhymes", "Numbers 1 to 100", "Days of week",
                "Months of year", "Color Names", "Fruit Names", "Flower Names", "Animal Names", "Bird Names",
                "Vegetable Names", "Profession Names", "Shape Names", "Country Names", "Know the Pakistan"};
        icons = new int[]{R.drawable.alphabets,R.drawable.rhymes,R.drawable.counting,
                R.drawable.weekdays,R.drawable.months,R.drawable.colors,R.drawable.fruit,
                R.drawable.flowrs,R.drawable.animals,R.drawable.birds,R.drawable.vegtables,
                R.drawable.professions,R.drawable.shapes,R.drawable.country, R.drawable.pakistan};

        Collection = new int[][] {alphabets,rhymes,Numbers,Days,Months,Colors,Fruits,Flowers,
                animals,Birds,Vegetables,professionals,Shapes};
        CollectionImgs = new int[][]{alphabets1,rhymes1,Numbers1,Days1,Months1,Colors1,Fruits1,
                Flowers1,animals1,Birds1,Vegetables1,professionals1,Shapes1};
    }
}
