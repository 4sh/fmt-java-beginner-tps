package qsh.learning.javaBeginner.vehicle;

abstract public class EnginedVehicle {
    private int speed = 0;
    private boolean started = false;

    public void accelerate() {
        this.speed += getPower();
    }

    public void decelerate() {
        this.speed -= getPower();
    }

    abstract int getPower();

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
