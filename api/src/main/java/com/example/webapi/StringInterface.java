package com.example.webapi;

@FunctionalInterface
public interface StringInterface<T> {
    Boolean process(T t1 ,T t2);
}
