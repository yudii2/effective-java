package com.study.effectivejava.item15;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {

        System.out.println(Example2.VALUES_LIST.get(0));
        try {
            Example2.VALUES_LIST.remove(0);
        } catch (Exception e) {
            log.info("불변 리스트 수정하면 오류가 발생한다. ", e);
        }
        int[] array = new int[5];
        array.clone();

        System.out.println("방어적 복사 before : " + Example3.values()[0]);
        Example3.values()[0] = 1;
        System.out.println("방어적 복사 after : " + Example3.values()[0]);
    }
}
