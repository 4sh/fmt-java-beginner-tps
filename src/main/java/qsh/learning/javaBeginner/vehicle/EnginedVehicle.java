package qsh.learning.javaBeginner.vehicle;

public abstract class EnginedVehicle extends TerrestrialVehicle {
    private boolean started = false;
    private int gazPool;

    public EnginedVehicle(int gazPool) {
        this.gazPool = gazPool;
    }

    public void accelerate() {
        for (int i = getPower(); i > 0; i--) {
            if (gazPool > 0) {
                super.accelerate();
                this.gazPool--;
            } else {
                stop();
            }
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

    public int getGazPool() {
        return gazPool;
    }
}
