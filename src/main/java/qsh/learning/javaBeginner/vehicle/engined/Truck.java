package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import java.util.List;

public class Truck extends EnginedVehicle {
    private String immat;

    public Truck(String immat,
                 int gazPool,
                 Wheel... wheels) {
        super(gazPool, List.of(wheels));
        this.immat = immat;
    }

    public String getImmat() {
        return immat;
    }

    public List<Wheel> getRightWheels() {
        return rightWheels;
    }

    public List<Wheel> getLeftWheels() {
        return leftWheels;
    }

    @Override
    public int getPower() {
        return 6;
    }
}
