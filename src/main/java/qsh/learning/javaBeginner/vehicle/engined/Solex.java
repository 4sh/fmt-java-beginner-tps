package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.Wheel;
import qsh.learning.javaBeginner.vehicle.engined.EnginedVehicle;

public class Solex extends EnginedVehicle {
    private final Wheel frontWheel;
    private final Wheel rearWheel;
    private boolean stand = false;

    public Solex(Wheel frontWheel,
                 Wheel rearWheel,
                 int gazPool) {
        super(gazPool);
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

    @Override
    public int getPower() {
        return 2;
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
