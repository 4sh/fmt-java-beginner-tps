package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import java.util.List;

public class Solex extends EnginedVehicle {
    private boolean stand = false;

    public Solex(Wheel wheel1,
                 Wheel wheel2,
                 int gazPool) {
        super(gazPool, new Engine(2), List.of(wheel1, wheel2));
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

    public boolean isStand() {
        return stand;
    }
}
