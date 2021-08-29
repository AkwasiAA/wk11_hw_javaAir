import Airport.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Lily", 3);
    }

    @Test
    public void checkPassengerHasName(){
        assertEquals("Lily", passenger.getName());
    }

    @Test
    public void checkPassengerHasBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }
}
