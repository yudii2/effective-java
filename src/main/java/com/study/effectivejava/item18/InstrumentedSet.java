package com.study.effectivejava.item18;

import java.time.Instant;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * 래퍼 클래스이면서,
 * Decorator pattern 데코레이터 패턴
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

//    Set<Instant> times = new InstrumentedSet<>(new TreeSet<>(cmp));

}
