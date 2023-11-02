package qsh.learning.javaBeginner.vehicle.wheel;

import java.util.Objects;

public record Wheel(WheelId wheelId, int diameter, DirectionWheel direction, double wear) {
    public static Integer wheelCounter = 0;

    public Wheel(String brandWheel, String serialId, int diameter, DirectionWheel direction, double wear) {
        this(new WheelId(brandWheel, serialId), diameter, direction, wear);
        wheelCounter++;
    }

    public boolean compatibleWith(Wheel wheel) {
        return Objects.equals(getTypeWheel(), wheel.getTypeWheel());
    }

    private TypeWheel getTypeWheel() {
        return wheelId.getBrandWheel() != null ? wheelId.getBrandWheel().type : null;
    }

    @Override
    public String toString() {
        return "R" + diameter + "/" + wheelId.getBrandWheel();
    }
}