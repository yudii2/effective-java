package com.study.effectivejava.item03;

/**
 *  생성자를 private 으로 선언
 */
public class PrivateSingleton {
    public static final PrivateSingleton INSTANCE = new PrivateSingleton();

    static int count;

    private PrivateSingleton() {
        count++;
        if (count != 1) {
            throw new IllegalStateException("this object should be singleton");
        }
    }

    private String print() {
        return "private static final singleton pattern";
    }

    // 리플렉션 API 에 치명적 단점

}
