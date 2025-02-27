package com.itschool.session18ex8;

public class Car  implements Vehicle{


    @Override
    public void start() {
        System.out.println("The car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating");

    }

    @Override
    public void stop() {
        System.out.println("The car is stopping");

    }
}
