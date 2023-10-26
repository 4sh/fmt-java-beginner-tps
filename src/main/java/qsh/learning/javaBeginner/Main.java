package qsh.learning.javaBeginner;

import qsh.learning.javaBeginner.vehicle.Car;
import qsh.learning.javaBeginner.vehicle.Wheel;

public class Main {
    public static void main(String[] args) {
        var car = new Car();

        var wheel = new Wheel();
        wheel.brandWheel = "Michelin";
        /* modifier la taille du pneu à 18, exécuter main */
        wheel.diameter = 19;

        car.rightFrontWheel = wheel;
        car.leftFrontWheel = wheel;
        car.rightRearWheel = wheel;
        car.leftRearWheel = wheel;

        /* modifier la taille des pneus à 18 uniquement pour les pneus arrières */

        System.out.println("Wheels checkpoint");
        System.out.println("Wheel right front should be Michelin/19 : " + car.rightFrontWheel.brandWheel + "/" + car.rightFrontWheel.diameter);
        System.out.println("Wheel left front Michelin/19 : " + car.leftFrontWheel.brandWheel + "/" + car.leftFrontWheel.diameter);
        System.out.println("Wheel right rear Michelin/18 : " + car.rightRearWheel.brandWheel + "/" + car.rightRearWheel.diameter);
        System.out.println("Wheel left rear Michelin/18 : " + car.leftRearWheel.brandWheel + "/" + car.leftRearWheel.diameter);

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