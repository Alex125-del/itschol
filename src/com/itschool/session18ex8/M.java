package com.itschool.session18ex8;

public class M {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Truck(), new Motorcycle(), new Car()};
        for (Vehicle vehicle : vehicles){
            vehicle.start();
            vehicle.accelerate();
            vehicle.stop();


        }
    }
}
