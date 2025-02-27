package com.itschool.session18ex7;

public abstract class Shape {
    private final String name;
    public Shape(String name) {
        this.name = name;
    }

    protected abstract double area();

    public String getName() {
        return name;
    }
}

