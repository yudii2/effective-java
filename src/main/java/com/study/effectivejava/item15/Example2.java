package com.study.effectivejava.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {

    private static final Integer[] VALUES = {5,1,2};
    public static final List<Integer> VALUES_LIST = Collections.unmodifiableList(Arrays.asList(VALUES));
    public static final List<Integer> VALUES_LIST2 = List.of(VALUES);


}
