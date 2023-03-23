package com.study.effectivejava.item03;

/**
 *  정적 팩터리 방식의 싱글턴
 */
public class FactorySingleton {

    private static final FactorySingleton INSTANCE = new FactorySingleton();

    public static FactorySingleton getInstance() {
        return INSTANCE;
    }

}
