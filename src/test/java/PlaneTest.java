import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.JET);
        plane = new Plane(PlaneType.BOEING);
    }

    @Test
    public void canGetCraft(){
        assertEquals(PlaneType.JET, plane.getCraft());
    }

    @Test
    public void jetHasCapacity(){
        assertEquals(100, plane.getCapacityFromEnum());
    }

    @Test
    public void boeingHasWeight1200(){
        assertEquals(1200, plane.getWeightFromEnum());
    }
}
