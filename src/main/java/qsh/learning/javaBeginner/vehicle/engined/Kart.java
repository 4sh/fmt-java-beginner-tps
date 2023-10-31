package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;
import qsh.learning.javaBeginner.vehicle.engined.EnginedVehicle;

public class Kart extends EnginedVehicle {
    private final Wheel rightFrontWheel;
    private final Wheel leftFrontWheel;
    private final Wheel rightRearWheel;
    private final Wheel leftRearWheel;

    public Kart(Wheel rightFrontWheel,
                Wheel leftFrontWheel,
                Wheel rightRearWheel,
                Wheel leftRearWheel,
                int gazPool) {
        super(gazPool);
        this.rightFrontWheel = rightFrontWheel;
        this.leftFrontWheel = leftFrontWheel;
        this.rightRearWheel = rightRearWheel;
        this.leftRearWheel = leftRearWheel;
    }

    public Wheel getRightFrontWheel() {
        return rightFrontWheel;
    }

    public Wheel getLeftFrontWheel() {
        return leftFrontWheel;
    }

    public Wheel getRightRearWheel() {
        return rightRearWheel;
    }

    public Wheel getLeftRearWheel() {
        return leftRearWheel;
    }

    @Override
    public int getPower() {
        return 4;
    }
}
