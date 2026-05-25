package com.ar.oops.inheritance.HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.airCondition();
        car.stop();

        System.out.println("----------------------");
        Bike bike = new Bike();
        bike.start();
        bike.helmat();
        bike.stop();

        System.out.println("------------------------");
        Bus bus = new Bus();
        bus.start();
        bus.passangerCapacity();
        bus.start();
    }
}
