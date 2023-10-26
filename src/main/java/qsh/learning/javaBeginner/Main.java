package qsh.learning.javaBeginner;

import qsh.learning.javaBeginner.vehicle.Car;
import qsh.learning.javaBeginner.vehicle.Wheel;

public class Main {
    public static void main(String[] args) {
        var car = new Car(
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 18),
                new Wheel("Michelin", 18));

        System.out.println("Wheels checkpoint");
        System.out.println("Wheel right front should be Michelin/19 : " + car.getRightFrontWheel().getBrandWheel() +
                "/" + car.getRightRearWheel().getDiameter());
        System.out.println("Wheel left front Michelin/19 : " + car.getLeftFrontWheel().getBrandWheel() + "/" +
                car.getLeftFrontWheel().getDiameter());
        System.out.println("Wheel right rear Michelin/18 : " + car.getRightRearWheel().getBrandWheel() + "/" +
                car.getRightRearWheel().getDiameter());
        System.out.println("Wheel left rear Michelin/18 : " + car.getLeftRearWheel().getBrandWheel() + "/" +
                car.getLeftRearWheel().getDiameter());

        System.out.println("Car is started " + car.isStarted() + " should be false");
        car.start();
        System.out.println("Car is started " + car.isStarted() + " should be true");

        System.out.println("Actual car speed " + car.getSpeed() + " should be 5");
        car.accelerate(5);
        System.out.println("Actual car speed " + car.getSpeed() + " should be 10");
        car.accelerate(20);
        System.out.println("Actual car speed " + car.getSpeed() + " should be 30");
        car.decelerate(5);
        System.out.println("Actual car speed " + car.getSpeed() + " should be 25");
        car.accelerate(-5);
        System.out.println("Actual car speed " + car.getSpeed() + " should be 25");
    }
}