package qsh.learning.javaBeginner;

import qsh.learning.javaBeginner.vehicle.Car;
import qsh.learning.javaBeginner.vehicle.Wheel;

public class Main {
    public static void main(String[] args) {
        var car = new Car();

        var wheel1 = new Wheel();
        wheel1.brandWheel = "Michelin";
        wheel1.diameter = 19;
        car.rightFrontWheel = wheel1;

        var wheel2 = new Wheel();
        wheel2.brandWheel = "Michelin";
        wheel2.diameter = 19;
        car.leftFrontWheel = wheel2;

        var wheel3 = new Wheel();
        wheel3.brandWheel = "Michelin";
        wheel3.diameter = 18;
        car.rightRearWheel = wheel3;

        var wheel4 = new Wheel();
        wheel4.brandWheel = "Michelin";
        wheel4.diameter = 18;
        car.leftRearWheel = wheel4;

        System.out.println("Wheels checkpoint");
        System.out.println("Wheel right front should be Michelin/19 : " + car.rightFrontWheel.brandWheel + "/" + car.rightFrontWheel.diameter);
        System.out.println("Wheel left front Michelin/19 : " + car.leftFrontWheel.brandWheel + "/" + car.leftFrontWheel.diameter);
        System.out.println("Wheel right rear Michelin/18 : " + car.rightRearWheel.brandWheel + "/" + car.rightRearWheel.diameter);
        System.out.println("Wheel left rear Michelin/18 : " + car.leftRearWheel.brandWheel + "/" + car.leftRearWheel.diameter);

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