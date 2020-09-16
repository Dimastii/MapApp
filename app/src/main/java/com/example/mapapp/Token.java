package com.example.mapapp;

import java.util.List;

public class Token{
    public final double x;
    public final double y;
    public final String key;
    public final String title;
    public final List<Integer> imageList;
    public Token(double x,double y,String key,String title,List<Integer> imageList){
        this.x = x;
        this.y = y;
        this.key = key;
        this.title = title;
        this.imageList = imageList;
    }
}
