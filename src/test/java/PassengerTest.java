import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bag bag;

    @Before
    public void setup(){
        passenger = new Passenger("Victor");
        bag = new Bag();
    }

    @Test
    public void hasName(){
        assertEquals("Victor", passenger.getName() );
    }

    @Test
    public void passengerStartsWithNoBag(){
        assertEquals(0, passenger.bagCount());
    }

    @Test
    public void canAddBag(){
        passenger.add(bag);
        assertEquals(1, passenger.bagCount());
    }



}
