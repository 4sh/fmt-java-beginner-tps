package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Car;

public class Main {
    public static void main(String[] args) {
        var car1 = new Car(
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("GoodYear", 17),
                new Wheel("GoodYear pneu", 17),
                "AZ789BB",
                50);
        testWheelOk(car1);

        var car2 = new Car(
                new Wheel("GoodYear", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 17),
                new Wheel("GoodYear pneu", 17),
                "AZ789BB",
                50);
        testWheelOk(car2);

        var car3 = new Car(
                new Wheel("Continental", 19),
                new Wheel("GoodYear", 19),
                new Wheel("Continental", 17),
                new Wheel("GoodYear", 17),
                "AZ789BB",
                50);
        testWheelKo(car3);


        var car4 = new Car(
                new Wheel("PirELLI", 19),
                new Wheel("Continental prenium", 19),
                new Wheel("PirEli", 17),
                new Wheel("Continental prenium", 17),
                "AZ789BB",
                50);
        testWheelOk(car4);

        var car5 = new Car(
                new Wheel("PirELLI", 19),
                new Wheel("Dunlop", 19),
                new Wheel("PirEli", 17),
                new Wheel("Dunlop", 17),
                "AZ789BB",
                50);
        testWheelKo(car5);

        var car6 = new Car(
                new Wheel("Tristar", 19),
                new Wheel("Dunlop", 19),
                new Wheel("Tristar", 17),
                new Wheel("Dunlop", 17),
                "AZ789BB",
                50);
        testWheelKo(car6);

        System.out.println("Wheel prepared : " + Wheel.wheelCounter);
    }

    private static void testWheelOk(Car car) {
        System.out.println(car.getWheelsDescription());
        if (!car.getRightFrontWheel().compatibleWith(car.getLeftFrontWheel()) ||
                !car.getRightRearWheel().compatibleWith(car.getLeftRearWheel())) {
            System.out.println("FAIL: TEST WHEEL KO, should be OK ");
        } else {
            System.out.println("SUCCESS :TEST WHEEL OK");

        }
        System.out.println("---");
    }

    private static void testWheelKo(Car car) {
        System.out.println(car.getWheelsDescription());
        if (car.getRightFrontWheel().compatibleWith(car.getLeftFrontWheel()) &&
                car.getRightRearWheel().compatibleWith(car.getLeftRearWheel())) {
            System.out.println("FAIL: TEST WHEEL OK, should be KO ");
        } else {
            System.out.println("SUCCESS :TEST WHEEL KO");

        }
        System.out.println("---");
    }
}
