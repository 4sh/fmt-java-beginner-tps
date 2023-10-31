package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.Vehicle;

public class TerrestrialVehicle implements Vehicle {
    private int speed = 0;

    public void accelerate()  {
        this.speed++;
    }

    public void decelerate()  {
        if (speed > 0) {
            this.speed--;
        }
    }

    public void resetSpeed() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }


}
