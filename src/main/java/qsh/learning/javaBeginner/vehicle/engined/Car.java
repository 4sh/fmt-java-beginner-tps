package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import java.util.List;

public class Car extends EnginedVehicle {
    private String immat;

    public Car(Wheel wheel1,
               Wheel wheel2,
               Wheel wheel3,
               Wheel wheel4,
               String immat,
               int gazPool) {
        super(gazPool, List.of(wheel1, wheel2, wheel3, wheel4));
        this.immat = immat;
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

    public String getImmat() {
        return immat;
    }

    @Override
    public int getPower() {
        return 6;
    }


}
