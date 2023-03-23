package com.study.effectivejava.item07;

import java.util.ArrayList;
import java.util.List;

public class Other {
    ArrayList list = new ArrayList();

    public void addString() {
        list.add("abcdefg");
    }

    public void removeString(int i) {
        Object o = list.get(i);
        o = null;

        // o 객체는 list 에서 꺼내온 객체의 참조 ( o != "abcdefg" )
        // null 로 초기화 했음에도 문자열 객체 "abcdefg" 은  GC가 해당 메모리를 수거대상이라고 인식하지 못한다
    }
    public static void main(String[] args) {
        Other other = new Other();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            other.addString();
            other.removeString(i);
        }

    }

}
