import CabinCrew.CabinCrewMemberRank;
import CabinCrew.FirstOfficer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstOfficerTest {

    FirstOfficer firstOfficer;

    @Before
    public void before(){
        firstOfficer = new FirstOfficer("Ephraim Matta", "NY4N5HV15WT");
    }

    @Test
    public void canGetFirstOfficerName(){
        assertEquals("Ephraim Matta", firstOfficer.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CabinCrewMemberRank.FIRSTOFFICER, firstOfficer.getCrewMemberRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("NY4N5HV15WT", firstOfficer.getLicenceNumber());
    }

//    @Test
//    public void canPerformPreflightChecks(){
//
//    }

}
