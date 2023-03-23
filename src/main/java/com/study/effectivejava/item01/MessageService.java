package com.study.effectivejava.item01;

public interface MessageService {

    String printMessage();
    static MessageService of(String type) {
        if (type.equalsIgnoreCase("KAKAO")) {
            return new KakaoService();
        } else if (type.equals("NHN")) {
            return new NhnCloudService();
        }
        throw new IllegalArgumentException("no such type message service");
    }
}
