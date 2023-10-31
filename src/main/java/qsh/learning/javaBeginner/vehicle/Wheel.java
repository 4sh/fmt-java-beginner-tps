package qsh.learning.javaBeginner.vehicle;

import java.util.Objects;

public record Wheel(String brandWheel, int diameter) {
    public static Integer wheelCounter = 0;

    public Wheel {
        wheelCounter++;
    }

    @Override
    public String toString() {
        return "R" + diameter + "/" + buildBrandTag(brandWheel);
    }

    private String buildBrandTag(String brandWheel) {
        return brandWheel.substring(0, 5).toUpperCase();
    }

    public boolean compatibleWith(Wheel wheel) {
        var typeA = getType(brandWheel);
        var typeB = getType(wheel.brandWheel);
        return typeA == typeB;
    }

    private String getType(String brandWheel) {
       return // ...
    }
}