package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.EmptyPoolException;
import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.TooHighSpeedException;
import qsh.learning.javaBeginner.vehicle.terrestrial.TerrestrialVehicle;

public abstract class EnginedVehicle extends TerrestrialVehicle {
    private boolean started = false;
    private int gazPool;

    public EnginedVehicle(int gazPool) {
        this.gazPool = gazPool;
    }

    public void accelerate() throws NoAccelerationException {
        try {
            for (int i = getPower(); i > 0; i--) {
                if (gazPool > 0) {
                    super.accelerate();
                    this.gazPool--;
                } else {
                    stop();
                    throw new EmptyPoolException();
                }
            }
        } catch (EmptyPoolException | TooHighSpeedException e) {
            throw new NoAccelerationException(e);
        }
    }

    public void decelerate() {
        for (int i = getPower(); i > 0; i--) {
            super.decelerate();
        }
    }

    abstract public int getPower();

    public void start() throws NoAccelerationException {
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
