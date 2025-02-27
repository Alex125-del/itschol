package com.itschool.session18ex7;

public class  Circle extends Shape{


    protected final int radix;

    public Circle( int radix) {
        super("Circle");
        this.radix = radix;
    }

    @Override
    protected double area() {
        return Math.PI * radix * radix;
    }

}
