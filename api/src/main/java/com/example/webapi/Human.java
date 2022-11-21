package com.example.webapi;

import lombok.ToString;

@ToString
public class Human {
    String name;

    public Human(){}
    public Human(String s) {
        this.name = s;
    }
}
