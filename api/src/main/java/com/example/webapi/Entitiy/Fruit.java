package com.example.webapi.Entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Fruit {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String color;

    @Builder
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
