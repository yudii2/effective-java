package com.study.effectivejava.item07;

import java.util.Arrays;
import java.util.EmptyStackException;


public class Stack {

    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        this.ensureCapacity();
        this.elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Object element = this.elements[--size];
        this.elements[size] = null;     // null 초기화 주의! NPE 의 주범
        return element;
    }

    /**
     * Ensure space for at least one more element,
     * roughly doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (this.elements.length == size) {
            this.elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}