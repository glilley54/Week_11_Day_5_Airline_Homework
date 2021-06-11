import org.junit.Before;
import people.CabinCrewMember;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jen","manager");
    }
}
