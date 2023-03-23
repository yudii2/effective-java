package com.study.effectivejava.item13;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        i = s.nextInt();
        recursive(i);
        s.close();

    }

    private static int recursive(int n) {
        int i;
        if (n < 1) {
            return 2;
        } else {
            i = (2 * recursive(n - 1)) + 1;
            System.out.println(i);  // 5,
            return i;
        }
    }

}
