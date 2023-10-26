package qsh.learning.javaBeginner.vehicle;

public class Main {
    public static void main(String[] args) {
        var car = new Car(
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 18),
                new Wheel("Michelin", 18),
                "AZ789BB",
                50);
        testCar(car);

        var solex = new Solex(new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                50);
        testSolex(solex);

        var kart = new Kart(new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                new Wheel("Michelin", 19),
                50);
        testKart(kart);

        var bike = new Bike(new Wheel("Michelin", 19),
                new Wheel("Michelin", 19));
        testBike(bike);
    }

    private static void testCar(Car car) {
        System.out.println("Launch tests for car " + car.getImmat());
        testVehicle(car);
        System.out.println("----------------------");
    }

    private static void testSolex(Solex solex) {
        System.out.println("Launch tests for solex ");
        testVehicle(solex);

        System.out.println("Solex should have stand deployed (true) : " + solex.isStand());
        solex.start();
        System.out.println("Solex should not have stand deployed (false) : " + solex.isStand());
        solex.stop();
        System.out.println("Solex should have stand deployed (true) : " + solex.isStand());

        System.out.println("----------------------");
    }

    private static void testKart(Kart kart) {
        System.out.println("Launch tests for kart ");
        testVehicle(kart);
        System.out.println("----------------------");
    }

    private static void testBike(Bike bike) {
        System.out.println("Launch tests for bike ");
        testVehicle(bike);
        System.out.println("----------------------");
    }

    private static void testVehicle(EnginedVehicle enginedVehicle) {
        System.out.println("EnginedVehicle is started " + enginedVehicle.isStarted() + " should be false");
        enginedVehicle.start();
        System.out.println("EnginedVehicle is started " + enginedVehicle.isStarted() + " should be true");

        testVehicle(enginedVehicle, enginedVehicle.getPower());

        enginedVehicle.stop();
        System.out.println("Actual EnginedVehicle speed " + enginedVehicle.getSpeed() + " should be 0");

        enginedVehicle.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Gaz pool : " + enginedVehicle.getGazPool());
            System.out.println("Speed " + enginedVehicle.getSpeed());
            enginedVehicle.accelerate();
            System.out.println("Is started " + enginedVehicle.isStarted());

        }
    }

    private static void testVehicle(TerrestrialVehicle vehicle) {
        testVehicle(vehicle, 1);
    }

    private static void testVehicle(Vehicle vehicle, int speedIncrement) {
        int previousSpeed = vehicle.getSpeed();
        vehicle.accelerate();
        System.out.println("Actual vehicle speed " + vehicle.getSpeed() + " should be " + (previousSpeed + speedIncrement));

        previousSpeed = vehicle.getSpeed();
        vehicle.accelerate();
        System.out.println("Actual vehicle speed " + vehicle.getSpeed() + " should be " + (previousSpeed + speedIncrement));

        previousSpeed = vehicle.getSpeed();
        vehicle.accelerate();
        System.out.println("Actual vehicle speed " + vehicle.getSpeed() + " should be " + (previousSpeed + speedIncrement));

        previousSpeed = vehicle.getSpeed();
        vehicle.decelerate();
        System.out.println("Actual vehicle speed " + vehicle.getSpeed() + " should be " + (previousSpeed - speedIncrement));

        System.out.println("Actual vehicle moving " + vehicle.isMoving() + " should be true");
        vehicle.emergencyBraking();
        System.out.println("Actual vehicle moving " + vehicle.isMoving() + " should be false");
    }
}