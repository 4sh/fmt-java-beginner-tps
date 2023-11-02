package qsh.learning.javaBeginner.vehicle;

import java.util.Objects;

public record Wheel(BrandWheel brandWheel, int diameter, DirectionWheel direction, double wear) {
    public static Integer wheelCounter = 0;

    enum BrandWheel {
        MICHE(TypeWheel.A),
        GOODY(TypeWheel.A),
        HANKO(TypeWheel.A),
        CONTI(TypeWheel.B),
        PIREL(TypeWheel.B),
        DUNLO(TypeWheel.C),
        BRIDG(TypeWheel.C);

        public final TypeWheel type;

        BrandWheel(TypeWheel type) {
            this.type = type;
        }
    }

    enum TypeWheel {
        A, B, C;
    }

    public enum DirectionWheel {
        RIGHT, LEFT;
    }

    public Wheel(String brandWheel, int diameter, DirectionWheel direction, double wear) {
        this(buildBrand(brandWheel), diameter, direction, wear);
        wheelCounter++;
    }

    public boolean compatibleWith(Wheel wheel) {
        return Objects.equals(getTypeWheel(), wheel.getTypeWheel());
    }

    static private BrandWheel buildBrand(String brandWheel) {
        try {
            return BrandWheel.valueOf(brandWheel.substring(0, 5).toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private TypeWheel getTypeWheel() {
        return brandWheel != null ? brandWheel.type : null;
    }

    @Override
    public String toString() {
        return "R" + diameter + "/" + brandWheel;
    }
}