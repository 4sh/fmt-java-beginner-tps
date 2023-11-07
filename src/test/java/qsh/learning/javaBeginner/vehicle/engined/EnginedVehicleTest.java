package qsh.learning.javaBeginner.vehicle.engined;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.wheel.DirectionWheel;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnginedVehicleTest {
    private final Wheel wheel1 = new Wheel("Michelin", "001", 11, DirectionWheel.RIGHT, 0.1);
    private final Wheel wheel2 = new Wheel("Michelin", "002", 19, DirectionWheel.LEFT, 0.2);
    private final Wheel wheel3 = new Wheel("GoodYear", "001", 12, DirectionWheel.LEFT, 0.3);
    private final Wheel wheel4 = new Wheel("GoodYear pneu", "002", 19, DirectionWheel.RIGHT, 0.4);
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(wheel1, wheel2, wheel3, wheel4, "42", 100);
    }

    @Test
    public void shouldLooseGazWhenAccelerate() throws NoAccelerationException {
        // Given


        car.start();

        // When
        car.accelerate();

        // Then
        assertEquals(88, car.getGazPool(), "should loose 6 (start) + 6 gaz");

    }

    @Test
    public void shouldNotAccelerateWhenVehicleIsNotStarted() {
        // Given
        boolean catched = false;

        // When
        try {
            car.accelerate();
        } catch (NoAccelerationException e) {
            if (e.getCause() instanceof NotStartedException) {
                catched = true;
            }
        }

        // Then
        assertTrue(catched, "should catch NotStartedException");

    }

}