package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;

public class Car extends EnginedVehicle {
    private final Wheel rightFrontWheel;
    private final Wheel leftFrontWheel;
    private final Wheel rightRearWheel;
    private final Wheel leftRearWheel;
    private String immat;

    public Car(Wheel rightFrontWheel,
               Wheel leftFrontWheel,
               Wheel rightRearWheel,
               Wheel leftRearWheel,
               String immat,
               int gazPool) {
        super(gazPool);
        this.rightFrontWheel = rightFrontWheel;
        this.leftFrontWheel = leftFrontWheel;
        this.rightRearWheel = rightRearWheel;
        this.leftRearWheel = leftRearWheel;
        this.immat = immat;
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

    public String getImmat() {
        return immat;
    }

    @Override
    public int getPower() {
        return 6;
    }

    public String getWheelsDescription() {
        return """
               {LF_____}---{RF_____}
                         |
                         |
               {LR_____}---{RR_____}"""
                .replace("{LF_____}", getLeftFrontWheel().toString())
                .replace("{RF_____}", getRightFrontWheel().toString())
                .replace("{LR_____}", getLeftRearWheel().toString())
                .replace("{RR_____}", getRightRearWheel().toString());
    }
}
