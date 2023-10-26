package qsh.learning.javaBeginner.vehicle;

public class Bike extends TerrestrialVehicle {
    private final Wheel frontWheel;
    private final Wheel rearWheel;

    public Bike(Wheel frontWheel, Wheel rearWheel) {
        this.frontWheel = frontWheel;
        this.rearWheel = rearWheel;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }
}
