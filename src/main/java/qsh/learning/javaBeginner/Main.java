package qsh.learning.javaBeginner;

import qsh.learning.javaBeginner.vehicle.Car;
import qsh.learning.javaBeginner.vehicle.Wheel;

public class Main {
    public static void main(String[] args) {
        var car = new Car();

        var wheel = new Wheel();
        wheel.brandWheel = "Michelin";
        wheel.diameter = 19;

        car.rightFrontWheel = wheel;
        car.leftFrontWheel = wheel;
        car.rightRearWheel = wheel;
        car.leftRearWheel = wheel;

        System.out.println("Car is started " + car.started + " should be false");
        car.started = true;
        car.speed = 5;
        System.out.println("Car is started " + car.started + " should be true");

        System.out.println("Actual car speed " + car.speed + " should be 5");
        car.speed += 5;
        System.out.println("Actual car speed " + car.speed + " should be 10");
        car.speed += 20;
        System.out.println("Actual car speed " + car.speed + " should be 30");
        car.speed -= 5;
        System.out.println("Actual car speed " + car.speed + " should be 25");
    }
}