package com.study.effectivejava.item08;

public class SampleResource implements AutoCloseable {

    @Override
    public void close() throws RuntimeException {
        System.out.println("close");
    }

    public void hello() {
        System.out.println("hello");
    }
}
