package com.study.effectivejava.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        // o가 일반 Point면 색상을 무시하고 비교한다.
//        if (!(o instanceof ColorPoint))
//            return o.equals(this);

        // o가 ColorPoint면 색상까지 비교한다.
//        return super.equals(o) && ((ColorPoint) o).color == color;

        ColorPoint that = (ColorPoint) o;
        return Objects.equals(color, that.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
