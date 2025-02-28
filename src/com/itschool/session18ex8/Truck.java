package com.itschool.session18ex8;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("The truck is starting");
    }

    @Override
    public void accelerate(){
        System.out.println("The truck is accelerating");
    }

    @Override
    public void stop() {

        System.out.println("The truck is stopping");

    }
}
