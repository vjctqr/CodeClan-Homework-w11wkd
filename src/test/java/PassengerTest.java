import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bag bag;
    Bag bag1;
    Bag bag2;

    @Before
    public void setup(){
        passenger = new Passenger("Victor", 2);

    }

    @Test
    public void hasName(){
        assertEquals("Victor", passenger.name );
    }

    @Test
    public int hasBag(){
        assertEquals(2);
    }



}
