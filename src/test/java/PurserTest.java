import CabinCrew.CabinCrewMemberRank;
import CabinCrew.Purser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PurserTest {

    Purser purser;

    @Before
    public void before(){
        purser = new Purser("Grace Johansson");
    }

    @Test
    public void canGetPurserName(){
        assertEquals("Grace Johansson", purser.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CabinCrewMemberRank.PURSER, purser.getCrewMemberRank());
    }

    @Test
    public void canRelayMessagesToPassengers(){
        assertEquals("Prepare for take-off", purser.relayMessages("Prepare for take-off"));
    }
}
