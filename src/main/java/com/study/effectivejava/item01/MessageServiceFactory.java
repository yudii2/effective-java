package com.study.effectivejava.item01;

public class MessageServiceFactory {

    public static void main(String[] args) {
        // 매개변수 주입 방식
        MessageService messageService = MessageService.of("kakao");
        // 의존성의 문제,,
        MessageService messageService1 = new KakaoService();

        messageService1.printMessage();
        System.out.println(messageService.printMessage());
    }
}
