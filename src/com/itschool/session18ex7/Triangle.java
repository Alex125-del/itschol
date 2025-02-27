package com.itschool.session18ex7;

public class Triangle extends Shape{

    protected final int length;
    protected final int width;


    public Triangle(int length, int width) {
        super("Triangle");
        this.length = length;
        this.width = width;
    }

    @Override
    protected double area() {
        return length * width;
    }
}
