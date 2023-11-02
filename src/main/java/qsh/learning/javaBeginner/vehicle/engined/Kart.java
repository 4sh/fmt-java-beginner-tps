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
        this.wheels.add(rightFrontWheel);
        this.wheels.add(leftFrontWheel);
        this.wheels.add(rightRearWheel);
        this.wheels.add(leftRearWheel);
    }

    public Wheel getRightFrontWheel() {
        return this.wheels.get(0);
    }

    public Wheel getLeftFrontWheel() {
        return this.wheels.get(1);
    }

    public Wheel getRightRearWheel() {
        return this.wheels.get(2);
    }

    public Wheel getLeftRearWheel() {
        return this.wheels.get(3);
    }

    @Override
    public int getPower() {
        return 4;
    }
}
