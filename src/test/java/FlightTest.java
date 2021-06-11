import airline.Flight;
import airline.Plane;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;


    @Before
    public void setUp() {
        pilot = new Pilot("Captain Tom", "Gold", "LI15256");
        flight = new Flight(plane, "FR1234", "Barcelona", "Edinburgh", "18.00");
        plane = new Plane("Boeing747", 140, 2000);

    }

    @Test
    public void hasPilot(){
        assertEquals("Captain Tom",pilot.getName());
    }

    @Test
    public void flightStartsWithoutAnyPassengers(){
        assertEquals(0,flight.getBookedPassengers().size());
    }

//    @Test
//    public void canAddPassengerToFlight(){
//        flight.addPassenger(passenger);
//        assertEquals(1,flight.getBookedPassengers().size());
//    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR1234",flight.getFlightNumber());
    }
    @Test
    public void hasPlane(){
        assertEquals("Boeing747",flight.getPlane());
    }



}
