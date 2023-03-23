package com.study.effectivejava.item15;

public class Example {

    public static final Integer[] VALUES = {5,1,2};

    public static void main(String[] args) {
        System.out.println(Example.VALUES[0]);
        Example.VALUES[0] = 1;
        System.out.println(Example.VALUES[0]);
    }
}
