package com.example.webapi.methodreference;

import java.awt.*;

@FunctionalInterface
public interface ColorFunctionInterface<Color> {

    Color toColor(int a, int b, int c);
}
