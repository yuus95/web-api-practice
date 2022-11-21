package com.example.webapi;

import java.util.List;
import java.util.function.ToIntFunction;

public class StringImpl {

    public static boolean  StringImpl(String t1 , String t2, StringInterface<String> stringInterface){
        return stringInterface.process(t1,t2);
    }



    public static boolean  IntImple(int t1 , int t2, StringInterface<Integer> stringInterface){
        return stringInterface.process(t1,t2);
    }
}

