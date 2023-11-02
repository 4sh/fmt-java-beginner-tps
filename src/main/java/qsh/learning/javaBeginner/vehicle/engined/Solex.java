package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.Wheel;

public class Solex extends EnginedVehicle {
    private boolean stand = false;

    public Solex(Wheel frontWheel,
                 Wheel rearWheel,
                 int gazPool) {
        super(gazPool);
        this.wheels.add(frontWheel);
        this.wheels.add(rearWheel);
    }

    @Override
    public void start() throws NoAccelerationException {
        this.stand = false;
        super.start();
    }

    @Override
    public void stop() {
        this.stand = true;
        super.stop();
    }

    @Override
    public int getPower() {
        return 2;
    }

    public Wheel getFrontWheel() {
        return this.wheels.get(0);
    }

    public Wheel getRearWheel() {
        return this.wheels.get(1);
    }

    public boolean isStand() {
        return stand;
    }
}
