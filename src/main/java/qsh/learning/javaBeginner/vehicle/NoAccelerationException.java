package qsh.learning.javaBeginner.vehicle;

public class NoAccelerationException extends Exception {

    public NoAccelerationException(Throwable throwable) {
        super("Cannot accelerate", throwable);
    }
}
