package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Car;

public class Main {
    public static void main(String[] args) throws NoAccelerationException {
        var car = new Car(
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                "AZ789BB",
                50);

        if (car.getRightFrontWheel().equals(car.getLeftFrontWheel()) &&
                car.getRightRearWheel().equals(car.getLeftRearWheel()) &&
                car.getRightFrontWheel().equals(car.getRightRearWheel())) {
            System.out.println("SUCCESS: all wheels are same : " + car.getRightFrontWheel() + " " +
                    car.getLeftFrontWheel()+ " " + car.getRightRearWheel()+ " "
                    + car.getRightRearWheel() );

        } else {
            System.out.println("FAIL: all wheels are not same : " + car.getRightFrontWheel() + " " +
                    car.getLeftFrontWheel()+ " " + car.getRightRearWheel()+ " "
                    + car.getRightRearWheel() );
        }

        //System.out.println("Wheel prepared : " + Wheel.wheelCounter);
    }
}
