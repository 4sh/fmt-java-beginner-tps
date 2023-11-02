package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import java.util.List;

public class Bike extends TerrestrialVehicle {

    public Bike(Wheel wheel1,
                Wheel wheel2) {
        super(List.of(wheel1, wheel2), true);
    }

    public Wheel getFrontWheel() {
        return this.leftWheels.get(0);
    }

    public Wheel getRearWheel() {
        return this.leftWheels.get(1);
    }
}
