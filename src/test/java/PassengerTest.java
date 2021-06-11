import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Gordon Lilley",2);

    }

    @Test
    public void PassengerhasName() {
        assertEquals("Gordon Lilley", passenger.getName());

    }
}
