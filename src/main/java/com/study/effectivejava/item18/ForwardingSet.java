package com.study.effectivejava.item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * 재사용할 수 있는 전달 클래스
 * @param <E>
 */
public class ForwardingSet<E> implements Set<E> {

    // Set 인스턴스를 private 필드로 참조하고 있다.
    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
