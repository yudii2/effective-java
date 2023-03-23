package com.study.effectivejava.item10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // 1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
        if (this == o) return true;

        // 2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
        //   명시적 null 검사 - 필요치 않다
//        if (o == null || getClass() != o.getClass()) return false;

        //   묵시적 null 검사
        if (!(o instanceof Point)) {
            return false;
        }

        // 3. 입력을 올바른 타입으로 형변환한다.
        Point point = (Point) o;

        // 4. 입력 객체와 자기 자신의 대응되는 '핵심'필드들이 모두 일치하는지 하나씩 검사한다.
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        // instanceof
        //  1. Object가 type 이거나, 상속받은 클래스 타입과 잎치하면 true
        //  2. 모든 클래스는 Object를 상속받으므로 instanceof Object 는 항상 true
        //  3. 첫번째 피연산자가 null 이면 항상 false
        ArrayList list = new ArrayList();
        System.out.println(list instanceof ArrayList);
        System.out.println(list instanceof List<?>);

        list = null;
        System.out.println(list instanceof Object);
    }
}
