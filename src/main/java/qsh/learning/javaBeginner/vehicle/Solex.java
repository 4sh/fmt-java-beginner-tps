package qsh.learning.javaBeginner.vehicle;

public class Solex extends EnginedVehicle {
    private final Wheel frontWheel;
    private final Wheel rearWheel;
    private boolean stand = false;

    public Solex(Wheel frontWheel,
                 Wheel rearWheel) {
        this.frontWheel = frontWheel;
        this.rearWheel = rearWheel;
    }

    @Override
    public void start() {
        this.stand = false;
        super.start();
    }

    @Override
    public void stop() {
        this.stand = true;
        super.stop();
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }

    public boolean isStand() {
        return stand;
    }
}
