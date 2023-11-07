package qsh.learning.javaBeginner.vehicle.engined;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.wheel.DirectionWheel;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EnginedVehicleTest {
    private final Wheel wheel1 = new Wheel("Michelin", "001", 11, DirectionWheel.RIGHT, 0.1);
    private final Wheel wheel2 = new Wheel("Michelin", "002", 19, DirectionWheel.LEFT, 0.2);
    private final Wheel wheel3 = new Wheel("GoodYear", "001", 12, DirectionWheel.LEFT, 0.3);
    private final Wheel wheel4 = new Wheel("GoodYear pneu", "002", 19, DirectionWheel.RIGHT, 0.4);
    @Mock
    private Engine engineMock;
    private Car car;

    @Captor
    private ArgumentCaptor<Integer> captor;

    @BeforeEach
    void setUp() {
        car = new Car(wheel1, wheel2, wheel3, wheel4, "42", engineMock, 2, 100);
    }

    @Test
    public void shouldLooseGazWhenAccelerate() throws NoAccelerationException {
        // Given
        when(engineMock.injectGaz(anyInt())).thenReturn(6);

        // When
        car.accelerate();

        // Then
        assertEquals(94, car.getGazPool(), "should loose 6 gaz");
    }

    @Test
    public void shouldInjectDoubleGaz() throws NoAccelerationException {
        // Given
        when(engineMock.injectGaz(captor.capture())).thenReturn(6);

        // When
        car.accelerate();

        // Then
        assertEquals(2, captor.getValue(), "should inject 2 units");
        verify(engineMock, times(1)).injectGaz(anyInt());
    }

    @Test
    public void shouldNotAccelerateWhenVehicleIsNotStarted() {
        // Given
        boolean catched = false;

        when(engineMock.injectGaz(anyInt())).thenThrow(new NotStartedException());

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