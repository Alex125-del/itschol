package com.itschool.session18ex7;

public class Rectangle extends Shape {

    protected final int length;
    protected final int width;


    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    protected double area() {
        return length * width;
    }
}
