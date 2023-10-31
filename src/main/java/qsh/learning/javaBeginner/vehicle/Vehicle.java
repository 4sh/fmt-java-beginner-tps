package qsh.learning.javaBeginner.vehicle;

public interface Vehicle {
    void accelerate() throws NoAccelerationException, TooHighSpeedException;

    void decelerate();

    int getSpeed();

    default boolean isMoving() {
        return getSpeed() > 0;
    }

    default void emergencyBraking() {
        while (isMoving()) {
            decelerate();
        }
    }
}
