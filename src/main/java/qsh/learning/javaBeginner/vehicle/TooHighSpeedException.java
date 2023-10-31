package qsh.learning.javaBeginner.vehicle;

public class TooHighSpeedException extends Exception {

    public TooHighSpeedException() {
        super("Max speed reached");
    }
}
