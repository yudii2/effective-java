package com.study.effectivejava.item12;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;

@Getter
//@ToString
public class PhoneNumber3 {

    private String prefix;
    private String middle;
    private String suffix;

    public PhoneNumber3(String prefix, String middle, String suffix) {
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
    }

//    @Override
//    public String toString() {
//        return "PhoneNumber3{" +
//                "prefix='" + prefix + '\'' +
//                ", middle='" + middle + '\'' +
//                ", suffix='" + suffix + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return String.format("""
                PhoneNumber3 {
                 prefix='%s', 
                 middle='%s', 
                 suffix='%s'}
                """, this.prefix, this.middle, this.suffix);
    }
//
//    @Query("""
//
//    """)
//    public void 메소드();

    public static void main(String[] args) {
        PhoneNumber3 phoneNumber3 = new PhoneNumber3("010", "1234", "4568");
        System.out.println(phoneNumber3);

        System.out.println(Nation.KOREA.toString());
        System.out.println(Nation.KOREA.name());
    }
}
