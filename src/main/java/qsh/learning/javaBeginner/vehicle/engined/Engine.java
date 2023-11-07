package qsh.learning.javaBeginner.vehicle.engined;

public class Engine {
    private final int power;
    private boolean started = false;


    public Engine(int power) {
        this.power = power;
    }

    public int injectGaz(int gazUnit) throws NotStartedException {
        if (!started) {
            throw new NotStartedException();
        }
        return gazUnit * power;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }
}
