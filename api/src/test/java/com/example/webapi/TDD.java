package com.example.webapi;

import org.junit.jupiter.api.Test;

public class TDD {


    @Test
    public void test() {
        //given
        int a = 1;
        int b = 2;
        if (a == b && a > b) {
            return;
        }
        //when
        //then
    }


    @Test
    public void seconde() {
        //given
        //when
        //then
    }

    @Test
    public void functionTest() {
        //given
        int a = 5;
        int b = 5;

    }

    @Test
    public void fruitTest(){
    //given
        Fruit fruit = new Fruit();
        System.out.println(fruit.add(1,5,(a,b)-> a+b ));
    //when
    //then
    }

    class Fruit{
        public  int add(int a, int b, FunctionInterface functionInterface) {
            return functionInterface.add(a,b);
        }
    }
}
