package com.example.mapapp;

import java.util.LinkedList;

public class Token{
    double v=0;
    double v1=0;
    String key = "";
    String title = "";
    Token(double x,double y,String key,String title){ v = x; v1 = y;this.key = key;this.title = title;}
    double getV(){return this.v;}
    double getV1(){return this.v1;}
}
class TokenList {
    LinkedList<Token> Stream = new LinkedList<>();
    public void add(Token q1) {
        Stream.add(q1);
    }
}
