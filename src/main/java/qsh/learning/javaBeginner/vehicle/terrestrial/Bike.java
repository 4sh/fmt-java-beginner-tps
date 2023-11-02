package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.Wheel;

public class Bike extends TerrestrialVehicle {

    public Bike(Wheel frontWheel, Wheel rearWheel) {
        this.wheels[0] = frontWheel;
        this.wheels[1] = rearWheel;
    }

    public Wheel getFrontWheel() {
        return this.wheels[0];
    }

    public Wheel getRearWheel() {
        return this.wheels[1];
    }
}
