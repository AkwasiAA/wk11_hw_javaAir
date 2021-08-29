import CabinCrew.CabinCrewMemberRank;
import CabinCrew.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Gideon Linton", "NEV3L35CUD5");
    }

    @Test
    public void canGetPilotName(){
        assertEquals("Gideon Linton", pilot.getName());
    }

    @Test
    public void canGetPilotRank(){
        assertEquals(CabinCrewMemberRank.CAPTAIN, pilot.getCrewMemberRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("NEV3L35CUD5", pilot.getLicenceNumber());
    }

//    @Test
//    public void canFlyThePlane(){
//
//    }

}
