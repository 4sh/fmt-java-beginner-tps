package qsh.learning.javaBeginner.vehicle;

import qsh.learning.javaBeginner.vehicle.engined.Truck;
import qsh.learning.javaBeginner.vehicle.wheel.DirectionWheel;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;
import qsh.learning.javaBeginner.vehicle.wheel.WheelId;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("Michelin", "001", 11, DirectionWheel.RIGHT, 0.1);
        Wheel wheel2 = new Wheel("Michelin", "002", 19, DirectionWheel.LEFT, 0.2);
        Wheel wheel3 = new Wheel("GoodYear", "001", 12, DirectionWheel.LEFT, 0.3);
        Wheel wheel4 = new Wheel("GoodYear pneu", "002", 19, DirectionWheel.RIGHT, 0.4);
        Wheel wheel5 = new Wheel("Michelin", "005", 12, DirectionWheel.LEFT, 0.7);
        Wheel wheel6 = new Wheel("GoodYear pneu", "006", 18, DirectionWheel.RIGHT, 0.2);
        Wheel wheel7 = new Wheel("GoodYear pneu", "007", 17, DirectionWheel.LEFT, 0.6);
        Wheel wheel8 = new Wheel("GoodYear pneu", "008", 16, DirectionWheel.RIGHT, 0.9);
        Wheel wheel9 = new Wheel("GoodYear pneu", "008", 16, DirectionWheel.RIGHT, 0.9);

        var truck = new Truck("AZ789BB", 100, wheel1, wheel2, wheel3, wheel4, wheel5, wheel6, wheel7, wheel8, wheel9);
        System.out.println("test nbWheels should be 8 : " + truck.getNbOfWheels());
        System.out.println("should find a wheel : " + truck.getWheelById(new WheelId("GoodYear pneu", "006")));
    }
}
