package com.itschool.session18ex8;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("The motorcycle is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle is accelerating");

    }

    @Override
    public void stop() {
        System.out.println("The motorcycle is stoping");
    }
}
