package qsh.learning.javaBeginner.vehicle;

public class TerrestrialVehicle {
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

