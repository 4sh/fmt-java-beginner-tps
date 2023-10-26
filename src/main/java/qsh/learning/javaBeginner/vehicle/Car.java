package qsh.learning.javaBeginner.vehicle;

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
    int getPower() {
        return 6;
    }
}
