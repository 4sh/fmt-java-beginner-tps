package qsh.learning.javaBeginner.vehicle;

public class Car {
    private final Wheel rightFrontWheel;
    private final Wheel leftFrontWheel;
    private final Wheel rightRearWheel;
    private final Wheel leftRearWheel;
    private int speed = 0;
    private boolean started = false;

    public Car(Wheel rightFrontWheel, Wheel leftFrontWheel, Wheel rightRearWheel, Wheel leftRearWheel) {
        super();
        this.rightFrontWheel = rightFrontWheel;
        this.leftFrontWheel = leftFrontWheel;
        this.rightRearWheel = rightRearWheel;
        this.leftRearWheel = leftRearWheel;
    }

    public void start() {
        this.started = true;
        this.speed = 5;
    }

    public void accelerate(int speedValue) {
        if (speedValue > 0) {
            this.speed += speedValue;
        }
    }

    public void decelerate(int speedValue) {
        if (speedValue > 0) {
            this.speed -= speedValue;
        }
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

    public int getSpeed() {
        return speed;
    }

    public boolean isStarted() {
        return started;
    }
}
