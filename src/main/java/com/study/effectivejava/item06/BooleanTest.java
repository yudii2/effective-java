package com.study.effectivejava.item06;

public class BooleanTest {

    public static void main(String[] args) {
        Boolean true1= Boolean.valueOf("true");
        Boolean true2 = Boolean.TRUE;

        System.out.println(true1.hashCode() == true2.hashCode());
        System.out.println(true1 == true2);

    }
}
