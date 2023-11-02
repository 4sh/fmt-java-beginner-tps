package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;

public class Car extends EnginedVehicle {
    private String immat;

    public Car(Wheel rightFrontWheel,
               Wheel leftFrontWheel,
               Wheel rightRearWheel,
               Wheel leftRearWheel,
               String immat,
               int gazPool) {
        super(gazPool);
        this.wheels.add(rightFrontWheel);
        this.wheels.add(leftFrontWheel);
        this.wheels.add(rightRearWheel);
        this.wheels.add(leftRearWheel);
        this.immat = immat;
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
