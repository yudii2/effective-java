package com.study.effectivejava.item06;

public class AutoBoxing {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // reference
//        Long sum1 = 0L;
//        for (long i = 0; i < Integer.MAX_VALUE; i++) {
//            sum1 += i;
//        }
//        System.out.println(sum1);

        // primitive
        long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

        System.out.println(System.currentTimeMillis() - start);

    }
}
