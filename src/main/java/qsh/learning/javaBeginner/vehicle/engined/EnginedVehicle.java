package qsh.learning.javaBeginner.vehicle.engined;

import qsh.learning.javaBeginner.vehicle.EmptyPoolException;
import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.TooHighSpeedException;
import qsh.learning.javaBeginner.vehicle.terrestrial.TerrestrialVehicle;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import java.util.List;

public abstract class EnginedVehicle extends TerrestrialVehicle {
    private final int nbOfInjection;
    private int gazPool;
    private final Engine engine;

    public EnginedVehicle(int gazPool, Engine engine, List<Wheel> wheels) {
        this(gazPool, engine, 1, wheels);
    }

    public EnginedVehicle(int gazPool, Engine engine, int nbOfInjection, List<Wheel> wheels) {
        super(wheels);
        this.engine = engine;
        this.gazPool = gazPool;
        this.nbOfInjection = nbOfInjection;
    }

    public void accelerate() throws NoAccelerationException {
        try {
            int power = engine.injectGaz(nbOfInjection);
            for (int i = power; i > 0; i--) {
                if (gazPool > 0) {
                    super.accelerate();
                    this.gazPool--;
                } else {
                    stop();
                    throw new EmptyPoolException();
                }
            }
        } catch (EmptyPoolException | TooHighSpeedException | NotStartedException e) {
            throw new NoAccelerationException(e);
        }
    }

    public void decelerate() {
        int power = engine.injectGaz(nbOfInjection);
        for (int i = power; i > 0; i--) {
            super.decelerate();
        }
    }

    public void start() throws NoAccelerationException {
        this.engine.start();
        this.accelerate();
    }

    public void stop() {
        this.resetSpeed();
        this.engine.stop();
    }

    public int getGazPool() {
        return gazPool;
    }
}
