package com.itschool.session20.homework.ex1;

import java.util.Objects;

public class RectangleClass {
    private final int width;
    private final int height;

    public RectangleClass(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RectangleClass that = (RectangleClass) o;
        return width == that.width && height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

