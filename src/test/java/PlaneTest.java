import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.JET);
    }

    @Test
    public void canGetCraft(){
        assertEquals(PlaneType.JET, plane.getCraft());
    }
}
