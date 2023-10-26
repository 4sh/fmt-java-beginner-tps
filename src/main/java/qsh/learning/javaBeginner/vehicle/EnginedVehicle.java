package qsh.learning.javaBeginner.vehicle;

public abstract class EnginedVehicle extends TerrestrialVehicle {
    private boolean started = false;

    public void accelerate() {
        for (int i = getPower(); i > 0; i--) {
            super.accelerate();
        }
    }

    public void decelerate() {
        for (int i = getPower(); i > 0; i--) {
            super.decelerate();
        }
    }

    abstract int getPower();

    public void start() {
        this.started = true;
        this.accelerate();
    }

    public void stop() {
        this.resetSpeed();
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }
}
