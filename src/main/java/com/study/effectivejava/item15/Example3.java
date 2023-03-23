package com.study.effectivejava.item15;

public class Example3 {

    private static final Integer[] VALUES = {5,1,2};

    public static final Integer[] values(){
        return VALUES.clone();
    }
}
