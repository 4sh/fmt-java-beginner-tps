package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;
import qsh.learning.javaBeginner.vehicle.engined.EnginedVehicle;

public class Kart extends EnginedVehicle {

    public Kart(Wheel rightFrontWheel,
                Wheel leftFrontWheel,
                Wheel rightRearWheel,
                Wheel leftRearWheel,
                int gazPool) {
        super(gazPool);
        this.wheels[0] = rightFrontWheel;
        this.wheels[1] = leftFrontWheel;
        this.wheels[2] = rightRearWheel;
        this.wheels[3] = leftRearWheel;
    }

    public Wheel getRightFrontWheel() {
        return this.wheels[0];
    }

    public Wheel getLeftFrontWheel() {
        return this.wheels[1];
    }

    public Wheel getRightRearWheel() {
        return this.wheels[2];
    }

    public Wheel getLeftRearWheel() {
        return this.wheels[3];
    }

    @Override
    public int getPower() {
        return 4;
    }
}
