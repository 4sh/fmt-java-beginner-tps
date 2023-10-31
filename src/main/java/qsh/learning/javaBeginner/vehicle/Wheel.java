package qsh.learning.javaBeginner.vehicle;

public record Wheel(String brandWheel, int diameter) {
    public static Integer wheelCounter = 0;

    public Wheel {
        wheelCounter++;
    }

    @Override
    public String toString() {
        return "R" + diameter + "/" + brandWheel.substring(0,5).toUpperCase();
    }
}