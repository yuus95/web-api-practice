package com.example.webapi.api.fruit;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruit")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FruitController {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody FruitUpdateReqeustDto fruitUpdateReqeustDto) {
        System.out.println("Server Success");

    }
}
