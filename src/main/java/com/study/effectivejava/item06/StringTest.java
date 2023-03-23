package com.study.effectivejava.item06;

public class StringTest {

    public static void main(String[] args) {
        String constructor = new String("hello");
        String constructor1 = new String("hello");
        String constructor2 = new String("hello");
        String literal = "hello";
        String literal1 = "hello";
        String literal2 = "hello";

        System.out.println(constructor == constructor1);
        System.out.println(constructor1.hashCode());
        System.out.println(constructor2.hashCode());
        System.out.println(literal.hashCode());
        System.out.println(literal1 == literal);
        System.out.println(literal2.hashCode());

//        System.out.println(System.identityHashCode(constructor1));
//        System.out.println(System.identityHashCode(constructor2));
//        System.out.println(System.identityHashCode(literal2));
//        System.out.println(System.identityHashCode(literal));
    }
}
