package com.study.effectivejava.item14;

public class PhoneNumberComparator {

    private short prefix;
    private int middle;
    private int suffix;

    @Override
    public PhoneNumberComparator clone() {
        try {
            return (PhoneNumberComparator) super.clone();    // covariant return typing 공변 반환 타이핑 지원
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int compareTo(PhoneNumberComparator pn) {
        int result = Short.compare(prefix, pn.prefix); // 가장 중요한 필드
        if (result == 0) {
            result = Short.compare(middle, pn.middle);  // 두번째 중요

            if (result == 0) {
                result = Short.compare(suffix, pn.suffix); // 세번째 중요
            }
        }
        return result;
    }
}
