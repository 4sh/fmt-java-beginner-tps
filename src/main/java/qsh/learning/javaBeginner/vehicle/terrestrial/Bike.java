package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.Wheel;

public class Bike extends TerrestrialVehicle {

    public Bike(Wheel frontWheel, Wheel rearWheel) {
        this.wheels.add(frontWheel);
        this.wheels.add(rearWheel);
    }

    public Wheel getFrontWheel() {
        return this.wheels.get(0);
    }

    public Wheel getRearWheel() {
        return this.wheels.get(1);
    }
}
