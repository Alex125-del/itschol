package com.itschool.session20.homework.ex1;

public class MainRectagle {
    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass(7,8);
        RectangleClass rectangle1 = new RectangleClass(5,9);
        RectangleClass rectangle2 = new RectangleClass(5,9);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println("rect1.hashCode() == rect2.hashCode(): " + (rectangle1.hashCode() == rectangle2.hashCode()));
    }
}
