package com.example.webapi.methodreference;


import lombok.ToString;

@ToString
public class Color {
    private int a;
    private int b;
    private int c;

    public Color(){};
    public Color(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
