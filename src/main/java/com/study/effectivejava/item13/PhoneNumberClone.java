package com.study.effectivejava.item13;

public class PhoneNumberClone {

    private String prefix;
    private String middle;
    private String suffix;

    @Override
    public PhoneNumberClone clone() {
        try {
            return (PhoneNumberClone) super.clone();    // covariant return typing 공변 반환 타이핑 지원
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
