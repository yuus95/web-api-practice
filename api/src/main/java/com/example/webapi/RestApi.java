package com.example.webapi;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApi {

    @GetMapping("/temp/data")
    public List<Temp> temp(){
        System.out.println("temp");
        Temp human = new Temp("유신1","01047105883");
        Temp human2 = new Temp("유신2","01047105883");
        Temp human3 = new Temp("유신3","01047105883");
        Temp human4 = new Temp("유신4","01047105883");
        Temp human5 = new Temp("유신5","01047105883");
        List<Temp> tempResult = new ArrayList<>();
        tempResult.add(human);
        tempResult.add(human2);
        tempResult.add(human3);
        tempResult.add(human4);
        tempResult.add(human5);

        return tempResult;
    }
}
