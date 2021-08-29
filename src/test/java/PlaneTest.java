import Airport.Plane.Plane;
import Airport.Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOMBARDIERGLOBAL7500);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOMBARDIERGLOBAL7500, plane.getPlaneType());
    }

    @Test
    public void canGetMaxCapacity(){
        assertEquals(19, plane.getPlaneType().getMaxCapacity());
    }

    @Test
    public void canGetMaxTotalWeight(){
        assertEquals(52096, plane.getPlaneType().getTotalWeight(), 0.01);
    }

}
