import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jen", "cabin crew manager");
    }

    @Test
    public void hasName() {
        assertEquals("Jen", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("cabin crew manager", cabinCrewMember.getRank());
    }
}