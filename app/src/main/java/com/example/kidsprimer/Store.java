package com.example.kidsprimer;

public class Store {
    String [][] Collection;
    int [][] CollectionImgs;

    public Store() {
        String[] alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q",
                "R","S",
                "T","U","V","W","X","Y","Z"};
        int[] alphabets1 = {R.drawable.l1, R.drawable.l2,R.drawable.l3,R.drawable.l4,R.drawable.l5,
                R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,
                R.drawable.l12,R.drawable.l13,R.drawable.l14,R.drawable.l15,R.drawable.l16,
                R.drawable.l17, R.drawable.l18,R.drawable.l19,R.drawable.l20,R.drawable.l21,
                R.drawable.l22,R.drawable.l23,R.drawable.l24,R.drawable.l25,R.drawable.l26};
        String[] rhymes = {};
        int[] rhymes1 = {};
        String[]Numbers = {};
        int[]Numbers1 = {};
        String[] Days = {
                "","","","","","",""
                //"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday",
                //"Sunday"
        };
        int[] Days1 = {R.drawable.wd1,R.drawable.wd2,R.drawable.wd3,R.drawable.wd4,
                R.drawable.wd5,R.drawable.wd6,R.drawable.wd7};
        String[] Months= {
                //"January","February","March","April","May","June","July","August",
                //                "September","October","November","December"
                "","","","","","","","","","","",""
        };
        int[] Months1 = {R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,
                R.drawable.m6,R.drawable.m7,R.drawable.m8,R.drawable.m9,R.drawable.m10,
                R.drawable.m11,R.drawable.m12};
        String[] Colors = {"","","","","","","",""};
        int[] Colors1 = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
                R.drawable.c6,R.drawable.c7,R.drawable.c8};
        String[] Fruits = {};
        int[] Fruits1 = {};
        String[] Flowers = {};
        int[] Flowers1 = {};
        String[] animals = {};
        int[] animals1 = {};
        String[] Birds = {};
        int[] Birds1 = {};
        String[] Vegetables = {};
        int[] Vegetables1 = {};
        String[] professionals = {};
        int[] professionals1 = {};
        String[] Shapes = {};
        int[] Shapes1 = {};
        String[] listNames = {"Alphabets A to Z","Rhymes","Numbers 1 to 100","Days of week",
                "Months of year","Color Names","Fruit Names","Flower Names","Animal Names","Bird Names",
                "Vegetable Names","Profession Names","Shape Names","Country Names","Know the Pakistan"};
        int[] icons = {R.drawable.alphabets,R.drawable.rhymes,R.drawable.counting,
                R.drawable.weekdays,R.drawable.months,R.drawable.colors,R.drawable.fruit,
                R.drawable.flowrs,R.drawable.animals,R.drawable.birds,R.drawable.vegtables,
                R.drawable.professions,R.drawable.shapes,R.drawable.country, R.drawable.pakistan};

        Collection = new String[][] {alphabets,rhymes,Numbers,Days,Months,Colors,Fruits,Flowers,
                animals,Birds,Vegetables,professionals,Shapes,listNames};
        CollectionImgs = new int[][]{alphabets1,rhymes1,Numbers1,Days1,Months1,Colors1,Fruits1,
                Flowers1,animals1,Birds1,Vegetables1,professionals1,Shapes1,icons};
    }
}
