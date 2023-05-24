package com.example.webapi.api.fruit;

import com.example.webapi.Entitiy.Fruit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FruitUpdateReqeustDto {

    @NotBlank
    private String name;

    @NotBlank
    private String color;

    public Fruit toFruit() {
        return Fruit.builder()
                .name(this.name)
                .color(this.color)
                .build();
    }
}
