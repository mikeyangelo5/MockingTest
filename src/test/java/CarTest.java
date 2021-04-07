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
        when(myCar.needsFuel()).thenReturn(true);
        assertTrue("my car needs fuel", myCar.needsFuel());
//        assertEquals("my car engine temperature should be 0.0 as double", 0.0, myCar.getEngineTemperature(), 1e-3);
    }

    @Test
    public void testMyCarHaveException() {
        assertFalse("my car needs fuel", myCar.needsFuel());
        when(myCar.needsFuel()).thenThrow(new RuntimeException());
        assertTrue("my car needs fuel", myCar.needsFuel());
    }

    @Test
    public void testVerification(){
        myCar.driveTo("Sweet Campus UKDW");
        myCar.needsFuel();
        verify(myCar).driveTo(any());
        verify(myCar).needsFuel();
    }

    @Test
    public void testVerificationFailure(){
        myCar.needsFuel();
        verify(myCar).getEngineTemperature();
    }

    @Test
    public void testVerificationFailureArguments(){
        myCar.driveTo("Sweet Campus UKDW");
        verify(myCar).driveTo("Home Sweet Home");
    }
}
