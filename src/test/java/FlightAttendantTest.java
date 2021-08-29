import CabinCrew.CabinCrewMemberRank;
import CabinCrew.FlightAttendant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    FlightAttendant flightAttendant;

    @Before
    public void before(){
        flightAttendant = new FlightAttendant("Juliet Atkinson");
    }

    @Test
    public void canGetAttendantName(){
        assertEquals("Juliet Atkinson", flightAttendant.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CabinCrewMemberRank.FLIGHTATTENDANT, flightAttendant.getCrewMemberRank());
    }

    @Test
    public void canRelayMessagesToPassengers(){
        assertEquals("Please fasten your seatbelts as we are about to take-off", flightAttendant.relayMessages("Please fasten your seatbelts as we are about to take-off"));
    }

}
