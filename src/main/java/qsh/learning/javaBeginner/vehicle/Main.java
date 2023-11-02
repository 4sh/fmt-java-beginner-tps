package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Car;
import qsh.learning.javaBeginner.vehicle.engined.Kart;
import qsh.learning.javaBeginner.vehicle.engined.Solex;
import qsh.learning.javaBeginner.vehicle.terrestrial.Bike;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("Michelin", 19);
        Wheel wheel2 = new Wheel("Michelin", 16);
        Wheel wheel3 = new Wheel("GoodYear", 17);
        Wheel wheel4 = new Wheel("GoodYear pneu", 15);


        System.out.println("TEST CAR");
        var car = new Car(wheel1, wheel2, wheel3, wheel4, "AZ789BB", 50);
        System.out.println("test RightFrontWheel : " + wheel1.equals(car.getRightFrontWheel()));
        System.out.println("test LeftFrontWheel : " + wheel2.equals(car.getLeftFrontWheel()));
        System.out.println("test RightRearWheel : " + wheel3.equals(car.getRightRearWheel()));
        System.out.println("test LeftRearWheel : " + wheel4.equals(car.getLeftRearWheel()));
        System.out.println("test nbWheels should be 4 : " + car.getNbOfWheels());

        System.out.println("TEST SOLEX");
        var solex = new Solex(wheel1, wheel2, 50);
        System.out.println("test FrontWheel : " + wheel1.equals(solex.getFrontWheel()));
        System.out.println("test RearWheel : " + wheel2.equals(solex.getRearWheel()));
        System.out.println("test nbWheels should be 2 : " + solex.getNbOfWheels());

        System.out.println("TEST KART");
        var kart = new Kart(wheel1, wheel2, wheel3, wheel4, 50);
        System.out.println("test RightFrontWheel : " + wheel1.equals(kart.getRightFrontWheel()));
        System.out.println("test LeftFrontWheel : " + wheel2.equals(kart.getLeftFrontWheel()));
        System.out.println("test RightRearWheel : " + wheel3.equals(kart.getRightRearWheel()));
        System.out.println("test LeftRearWheel : " + wheel4.equals(kart.getLeftRearWheel()));
        System.out.println("test nbWheels should be 4 : " + kart.getNbOfWheels());

        System.out.println("TEST BIKE");
        var bike = new Bike(wheel1, wheel2);
        System.out.println("test FrontWheel : " + wheel1.equals(bike.getFrontWheel()));
        System.out.println("test RearWheel : " + wheel2.equals(bike.getRearWheel()));
        System.out.println("test nbWheels should be 2 : " + bike.getNbOfWheels());
    }
}
