package qsh.learning.javaBeginner.vehicle.wheel;

public enum BrandWheel {
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
