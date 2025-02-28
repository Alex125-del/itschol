package com.itschool.session18ex7;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(7),new Triangle(7,8), new Rectangle(8,9)};

        for (Shape shape : shapes){
            System.out.println("Area of:" + shape.getName() + "Is:" + shape.area());


        }



    }

}
