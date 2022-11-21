package com.example.webapi;

import com.example.webapi.methodreference.Color;
import com.example.webapi.methodreference.ColorFunction;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StringImplTest {

    @Test
    public void FunctionTest(){
    //given
        boolean intResult = StringImpl.IntImple(1, 2, (a, b) -> a > b);
        boolean stringResult = StringImpl.StringImpl("Test1", "Test1", String::equals);
        System.out.println(intResult+ " "  + stringResult);
    //when
    //then
    }

    @Test
    public void methodReference(){
    //given
        Supplier<Human> test = Human::new;
        Human human = test.get();
        System.out.println(human.toString());

        Function<String,Human> buildHuman = Human::new;
        Human 김유신 = buildHuman.apply("김유신");
        System.out.println(김유신.toString());
        //when
    //then
    }

    @Test
    public void color(){
        Color color = ColorFunction.toColor(1, 2, 3, Color::new);
        System.out.println(color.toString());
    }

    @Test
    public void FunctionNested(){
    //given
        Function<Integer,Integer> f = x -> x + 1;
        Function<Integer,Integer> g = x -> x * 2;
        Function<Integer,Integer> h = f.andThen(g);
        int i = h.apply(1);
        System.out.println(i);


        //when
    //then
    }

}