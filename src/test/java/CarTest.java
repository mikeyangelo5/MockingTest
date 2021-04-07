import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CarTest {
    private Car myCar = mock(Car.class);

    @Test
    public void testIfMyCarIsCar(){
        assertTrue(myCar instanceof Car);
    }

    @Test
    public void testDefaultValueOfMyCar(){
        assertFalse("my car needs fuel", myCar.needsFuel());
        assertEquals("my car engine temperature should be 0.0 as double", 0.0, myCar.getEngineTemperature(), 1e-3);
    }
}
