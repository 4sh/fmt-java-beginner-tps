package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Car;
import qsh.learning.javaBeginner.vehicle.engined.Truck;
import qsh.learning.javaBeginner.vehicle.terrestrial.Bike;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("Michelin", 11, Wheel.DirectionWheel.RIGHT, 0.1);
        Wheel wheel2 = new Wheel("Michelin", 19, Wheel.DirectionWheel.LEFT, 0.2);
        Wheel wheel3 = new Wheel("GoodYear", 12, Wheel.DirectionWheel.LEFT, 0.3);
        Wheel wheel4 = new Wheel("GoodYear pneu", 19, Wheel.DirectionWheel.RIGHT, 0.4);
        Wheel wheel5 = new Wheel("Michelin", 12, Wheel.DirectionWheel.LEFT, 0.7);
        Wheel wheel6 = new Wheel("GoodYear pneu", 18, Wheel.DirectionWheel.RIGHT, 0.2);
        Wheel wheel7 = new Wheel("GoodYear pneu", 17, Wheel.DirectionWheel.LEFT, 0.6);
        Wheel wheel8 = new Wheel("GoodYear pneu", 16, Wheel.DirectionWheel.RIGHT, 0.9);

        System.out.println("TEST CAR");
        var car = new Car(wheel1, wheel2, wheel3, wheel4, "AZ789BB", 50);
        System.out.println("test RightFrontWheel : " + wheel4.equals(car.getRightFrontWheel()));
        System.out.println("test LeftFrontWheel : " + wheel3.equals(car.getLeftFrontWheel()));
        System.out.println("test RightRearWheel : " + wheel1.equals(car.getRightRearWheel()));
        System.out.println("test LeftRearWheel : " + wheel2.equals(car.getLeftRearWheel()));
        System.out.println("test nbWheels should be 4 : " + car.getNbOfWheels());
        System.out.println("wheels description:\n" + car.getWheelsDescription());

        System.out.println("TEST BIKE");
        var bike = new Bike(wheel2, wheel3);
        System.out.println("test FrontWheel : " + wheel3.equals(bike.getFrontWheel()));
        System.out.println("test RearWheel : " + wheel2.equals(bike.getRearWheel()));
        System.out.println("test nbWheels should be 2 : " + bike.getNbOfWheels());
        System.out.println("wheels description:\n" + bike.getWheelsDescription());

        System.out.println("TEST TRUCK");
        var truck = new Truck("AZ789BB", 100, wheel1, wheel2, wheel3, wheel4, wheel5, wheel6, wheel7, wheel8);
        System.out.println("test nbWheels should be 8 : " + truck.getNbOfWheels());
        System.out.println("should have good wheels description : " + truck.getWheelsDescription().equals("""
                R12/MICHE---R16/GOODY
                          |
                R17/GOODY---R19/GOODY
                          |
                R12/GOODY---R18/GOODY
                          |
                R19/MICHE---R11/MICHE
                """));
        System.out.println("description:\n" + truck.getWheelsDescription());
    }
}
