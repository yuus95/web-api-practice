package com.example.webapi.methodreference;


public class ColorFunction {

    public static Color toColor(int a, int b, int c, ColorFunctionInterface function) {
       return (Color) function.toColor(a, b, c);
    }
}
