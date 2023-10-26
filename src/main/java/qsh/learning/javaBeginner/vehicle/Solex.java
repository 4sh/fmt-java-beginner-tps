package qsh.learning.javaBeginner.vehicle;

public class Solex extends EnginedVehicle {

    private final Wheel frontWheel;
    private final Wheel rearWheel;

    public Solex(Wheel frontWheel, Wheel rearWheel) {
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
