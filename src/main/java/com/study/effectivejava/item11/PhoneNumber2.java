package com.study.effectivejava.item11;

import java.util.Objects;

public class PhoneNumber2 {

    private Integer prefix;
    private Integer middle;
    private Integer suffix;

    public PhoneNumber2(Integer prefix, Integer middle, Integer suffix) {
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber2 that = (PhoneNumber2) o;
        return prefix.equals(that.prefix) && middle.equals(that.middle) && suffix.equals(that.suffix);
    }

    @Override
    public int hashCode() {
        // Objects.hash() 메소드의 한계 존재
//        return Objects.hash(prefix, middle, suffix);

        // 이펙티브 자바에서는 아래와 같이 재정의하는 것을 지향한다.
        int result = Integer.hashCode(prefix);
        result = 31 * result + Integer.hashCode(middle);
        result = 31 * result + Integer.hashCode(suffix);
        return result;
    }
}
