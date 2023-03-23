package com.study.effectivejava.item11;

import lombok.Getter;

import java.util.HashMap;
import java.util.Objects;

@Getter
public class PhoneNumber {

    private String prefix;
    private String middle;
    private String suffix;

    public PhoneNumber(String prefix, String middle, String suffix) {
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PhoneNumber that = (PhoneNumber) o;
//        return prefix.equals(that.prefix) && middle.equals(that.middle) && suffix.equals(that.suffix);
//    }
//
    @Override
    public int hashCode() {
        // Objects.hash() 메소드의 한계 존재
        return Objects.hash(prefix, middle, suffix);
    }

    public static void main(String[] args) {
        HashMap<PhoneNumber, String> hashMap = new HashMap<>();

        PhoneNumber jennyPhoneNumber1 = new PhoneNumber("010", "0001", "0000");
        hashMap.put(jennyPhoneNumber1, "제니");
        String s1 = hashMap.get(jennyPhoneNumber1);
        System.out.println("s1 = " + s1); // 제니

        PhoneNumber jennyPhoneNumber2 = new PhoneNumber("010", "0001", "0000");
        String s2 = hashMap.get(jennyPhoneNumber2);
        System.out.println("s2 = " + s2); // null

        boolean equals = jennyPhoneNumber1.equals(jennyPhoneNumber2);
        System.out.println("equals = " + equals); // true

        int hashCode1 = jennyPhoneNumber1.hashCode();
        int hashCode2 = jennyPhoneNumber2.hashCode();
        System.out.println("hashCode1 = " + hashCode1);
        System.out.println("hashCode2 = " + hashCode2);
    }
}
