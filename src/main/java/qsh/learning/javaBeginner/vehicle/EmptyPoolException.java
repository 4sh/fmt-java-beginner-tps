package qsh.learning.javaBeginner.vehicle;

public class EmptyPoolException extends RuntimeException {

    public EmptyPoolException() {
        super("No gaz anymore");
    }
}
