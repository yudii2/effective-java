package com.study.effectivejava.item08;

public class SimpleRunner {
    public static void main(String[] args) {

        try (SampleResource resource = new SampleResource()) {
            resource.hello(); // 리소스 사용
        }
    }
}
