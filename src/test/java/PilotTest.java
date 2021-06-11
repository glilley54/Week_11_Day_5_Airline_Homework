import org.junit.Before;
import org.junit.Test;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new  Pilot("Captain Jack","First Officer","LI123456");

    }

    @Test
    public void hasName(){
        assertEquals("Captain Jack", pilot.getName());
    }
}
