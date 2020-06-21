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

    @Test
    public void hasDestination(){
        assertEquals("London", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("0700", flight.getDepartureTime());
    }

    @Test
    public void bookedPassengersStartAt0(){
        assertEquals(0, flight.bookedPassengerSize());
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.JET, flight.getCraft());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, flight.getCapacity());
    }


}
