package qsh.learning.javaBeginner;

import qsh.learning.javaBeginner.vehicle.*;

public class Main {
    public static void main(String[] args) {
        var car = ;
        System.out.println("Launch tests for car " + car.getImmat());
        testVehicle(car);

        var solex = ;
        System.out.println("Launch tests for solex");
        testVehicle(solex);

        var kart = ;
        System.out.println("Launch tests for kart");
        testVehicle(kart);

        var enginedVehicle = ;
        System.out.println("Launch tests for engined vehicle");
        testVehicle(enginedVehicle);
    }

    private static void testVehicle(EnginedVehicle enginedVehicle) {
        System.out.println("### VEHICULE CHECK ###");

        System.out.println("Car is started " + enginedVehicle.isStarted() + " should be false");
        enginedVehicle.start();
        System.out.println("Car is started " + enginedVehicle.isStarted() + " should be true");

        System.out.println("Actual car speed " + enginedVehicle.getSpeed() + " should be 5");
        enginedVehicle.accelerate(5);
        System.out.println("Actual car speed " + enginedVehicle.getSpeed() + " should be 10");
        enginedVehicle.accelerate(20);
        System.out.println("Actual car speed " + enginedVehicle.getSpeed() + " should be 30");
        enginedVehicle.decelerate(5);
        System.out.println("Actual car speed " + enginedVehicle.getSpeed() + " should be 25");
        enginedVehicle.accelerate(-5);
        System.out.println("Actual car speed " + enginedVehicle.getSpeed() + " should be 25");

        System.out.println("-----");
    }
}