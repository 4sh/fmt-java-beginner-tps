package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.TooHighSpeedException;
import qsh.learning.javaBeginner.vehicle.Vehicle;
import qsh.learning.javaBeginner.vehicle.wheel.DirectionWheel;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;
import qsh.learning.javaBeginner.vehicle.wheel.WheelId;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static qsh.learning.javaBeginner.DistinctByKey.uniqueBy;

public class TerrestrialVehicle implements Vehicle {
    private final boolean oneWheelsLine;
    protected List<Wheel> rightWheels = new ArrayList<>();
    protected List<Wheel> leftWheels = new ArrayList<>();
    private final Map<WheelId, Wheel> allWheels;
    private int speed = 0;

    public TerrestrialVehicle(List<Wheel> wheels) {
        this(wheels, false);
    }

    public TerrestrialVehicle(List<Wheel> wheels, boolean oneWheelsLine) {
        this.oneWheelsLine = oneWheelsLine;
        allWheels = wheels.stream().collect(Collectors.toMap(Wheel::wheelId, Function.identity(), (first, second) -> first));
        Map<Boolean, List<Wheel>> collect = wheels.stream()
                .sorted(Comparator.comparingDouble(Wheel::wear).reversed())
                .filter(uniqueBy(Wheel::wheelId))
                .collect(Collectors.partitioningBy(wheel -> wheel.direction() == DirectionWheel.RIGHT && !oneWheelsLine));
        this.rightWheels = collect.get(true);
        this.leftWheels = collect.get(false);
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

    public Wheel getWheelById(WheelId id) {
        return allWheels.get(id);
    }
}
