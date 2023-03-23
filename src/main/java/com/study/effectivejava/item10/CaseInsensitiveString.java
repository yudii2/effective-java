package com.study.effectivejava.item10;

import java.io.FileInputStream;
import java.util.Objects;

public final class CaseInsensitiveString {
    private final String name;

    public CaseInsensitiveString(String s) {
        this.name = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseInsensitiveString that = (CaseInsensitiveString) o;

        // 대칭성을 위반해보자!
        if (o instanceof CaseInsensitiveString) {
            that.name.equalsIgnoreCase(((CaseInsensitiveString) o).name);
        }
        if (o instanceof String) {
            that.name.equalsIgnoreCase((String) o);
        }

        // 대칭성을 개선해보자!
        return Objects.equals(name, that.name);

    }

    @Override
    public int hashCode() {
        // String 의 hashCode 는 같은 값(내용)이면 같은 해시 값을 리턴하도록 재정의 되어 있다. ****

        /**
            Returns a hash code for this string. The hash code for a String object is computed as
            s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

            using int arithmetic, where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation. (The hash value of the empty string is zero.)
            Returns:
            a hash code value for this object.
        */
        name.hashCode();

        return Objects.hash(name);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
