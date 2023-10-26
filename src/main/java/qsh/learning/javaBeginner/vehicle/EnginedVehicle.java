package qsh.learning.javaBeginner.vehicle;

public class EnginedVehicle {
    private int speed = 0;
    protected boolean started = false;

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

    public void start() {
        this.started = true;
        this.speed = 5;
    }

    public void stop() {
        this.started = false;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStarted() {
        return started;
    }
}
