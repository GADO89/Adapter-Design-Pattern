package org.adapter;

public class Executor {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Vehicle car=new Car();
        useVehicle(car);
        Vehicle bike=new bicycleAdapter(new Bicycle());
        useVehicle(bike);


    }

    private static void useVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
    }
}