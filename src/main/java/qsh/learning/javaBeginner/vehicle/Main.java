package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Car;

public class Main {
    public static void main(String[] args) {
        var car = new Car(
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 18),
                new Wheel("Michelin", 18),
                "AZ789BB",
                50);

        System.out.println("Test Gaz pool =>");
        car.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Gaz pool : " + car.getGazPool());
            System.out.println("Speed " + car.getSpeed());
            car.accelerate();
            System.out.println("Is started ? " + car.isStarted());
        }
    }
}
