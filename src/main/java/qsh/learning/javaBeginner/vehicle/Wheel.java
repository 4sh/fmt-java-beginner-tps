package qsh.learning.javaBeginner.vehicle;

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
}