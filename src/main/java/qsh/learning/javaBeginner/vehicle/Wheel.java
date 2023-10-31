package qsh.learning.javaBeginner.vehicle;

import java.util.Objects;

public class Wheel {
    private final String brandWheel;
    private final int diameter;

    public Wheel(String brandWheel, int diameter) {
        this.brandWheel = brandWheel;
        this.diameter = diameter;
    }

    public String getBrandWheel() {
        return brandWheel;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter && Objects.equals(brandWheel, wheel.brandWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandWheel, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brandWheel='" + brandWheel + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}