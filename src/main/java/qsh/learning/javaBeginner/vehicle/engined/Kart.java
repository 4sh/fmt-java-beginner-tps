package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;

import java.util.List;

public class Kart extends EnginedVehicle {

    public Kart(Wheel wheel1,
                Wheel wheel2,
                Wheel wheel3,
                Wheel wheel4,
                int gazPool) {
        super(gazPool, List.of(wheel1, wheel2, wheel3, wheel4));
    }

    public Wheel getRightFrontWheel() {
        return this.rightWheels.get(0);
    }

    public Wheel getLeftFrontWheel() {
        return this.leftWheels.get(0);
    }

    public Wheel getRightRearWheel() {
        return this.rightWheels.get(1);
    }

    public Wheel getLeftRearWheel() {
        return this.leftWheels.get(1);
    }

    @Override
    public int getPower() {
        return 4;
    }
}
