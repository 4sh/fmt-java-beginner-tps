package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.TooHighSpeedException;
import qsh.learning.javaBeginner.vehicle.Vehicle;
import qsh.learning.javaBeginner.vehicle.Wheel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;

public class TerrestrialVehicle implements Vehicle {

    private final boolean oneWheelsLine;
    protected List<Wheel> rightWheels = new ArrayList<>();
    protected List<Wheel> leftWheels = new ArrayList<>();
    private int speed = 0;

    public TerrestrialVehicle(List<Wheel> wheels) {
        this(wheels, false);
    }

    public TerrestrialVehicle(List<Wheel> wheels, boolean oneWheelsLine) {
        this.oneWheelsLine = oneWheelsLine;
        for (var wheel : wheels) {
            if (wheel.direction() == Wheel.DirectionWheel.RIGHT && !oneWheelsLine) {
                this.rightWheels.add(wheel);
            } else {
                this.leftWheels.add(wheel);
            }
        }

        var comparator = new Comparator<Wheel>() {
            @Override
            public int compare(Wheel o1, Wheel o2) {
                return Double.compare(o1.wear(), o2.wear());
            }
        }.reversed();
        this.rightWheels.sort(comparator);
        this.leftWheels.sort(comparator);
    }

    public void accelerate() throws NoAccelerationException, TooHighSpeedException {
        if (speed > 30) {
            throw new TooHighSpeedException();
        }
        this.speed++;
    }

    public void decelerate() {
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

    public int getNbOfWheels() {
        return rightWheels.size() + leftWheels.size();
    }

    public String getWheelsDescription() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < leftWheels.size(); i++) {
            if (oneWheelsLine) {
                if (i > 0) {
                    sb.append("    |\n");
                }
                sb.append(leftWheels.get(i)).append("\n");
            } else {
                if (i > 0) {
                    sb.append("          |\n");
                }
                sb.append(leftWheels.get(i)).append("---").append(rightWheels.get(i)).append("\n");
            }
        }

        return sb.toString();
    }
}
