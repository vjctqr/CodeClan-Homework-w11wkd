import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("Jet007", "London", "Edinburgh", "0700", PlaneType.JET);
        passenger1 = new Passenger("Tim");
        passenger2 = new Passenger("Jimmy");
        passenger3 = new Passenger("Grace");
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("Jet007", flight.getFlightNumber());
    }


}
