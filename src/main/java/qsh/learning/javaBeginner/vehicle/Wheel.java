package qsh.learning.javaBeginner.vehicle;

import java.util.Objects;

public record Wheel(BrandWheel brandWheel, int diameter) {
    public static Integer wheelCounter = 0;

    // Enum BrandWheel

   // Enum ypeWheel

    public Wheel(String brandWheel, int diameter) {
        this(buildBrand(brandWheel), diameter);
        wheelCounter++;
    }

    public boolean compatibleWith(Wheel wheel) {
        return Objects.equals(getTypeWheel(), wheel.getTypeWheel());
    }

    static private BrandWheel buildBrand(String brandWheel) {
        var brandTag = brandWheel.substring(0, 5).toUpperCase();
        // construire BrandWheel avec .valueOf()
    }

    private TypeWheel getTypeWheel() {
        return brandWheel != null ? brandWheel.type : null;
    }

    @Override
    public String toString() {
        return "R" + diameter + "/" + brandWheel;
    }
}