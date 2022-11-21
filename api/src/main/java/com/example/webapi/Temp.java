package com.example.webapi;

import lombok.Getter;

@Getter
public class Temp {
    String name;
    String phone;

    public Temp(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
