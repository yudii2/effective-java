package com.study.effectivejava.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class Comparable {

    public static void main(String[] args) {
        // equals 로 비교하면
        // new BigDecimal("1.0").equals(new BigDecimal("1.00")) == false
        System.out.println(new BigDecimal("1.0").equals(new BigDecimal("1.00")));   // false

        HashSet hashSet = new HashSet();
        hashSet.add(new BigDecimal("1.0"));
        hashSet.add(new BigDecimal("1.00"));

        /**
         *  This is so because the Set interface is defined in terms of the equals operation, but a TreeSet instance performs all element comparisons using its compareTo (or compare) method
         */
        // compareTo 로 비교하면
        // new BigDecimal("1.0").compareTo(new BigDecimal("1.00")) == true
        System.out.println(new BigDecimal("1.0").compareTo(new BigDecimal("1.00")) == 0);

        TreeSet treeSet = new TreeSet();
        treeSet.add(new BigDecimal("1.0"));
        treeSet.add(new BigDecimal("1.00"));

        System.out.println(hashSet.size());
        System.out.println(treeSet.size());

    }
}
