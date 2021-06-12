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

    @Test
    public void canAddPassengerToFlight(){
        flight.bookPassenger(passenger);
        assertEquals(1,flight.getBookedPassengers().size());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR1234",flight.getFlightNumber());
    }

    @Test
    public void hasPlaneType() {
        assertEquals("Boeing747", plane.getType());

    }
    @Test
    public void hasDepartureAirport() {
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDestination() {
        assertEquals("Barcelona",flight.getDestination());
    }
    @Test
    public void hasdepartureTime() {
        assertEquals("18.00",flight.getDepartureTime());
    }
    @Test
    public void canReturnAvailableSeats() {
        assertEquals(140, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(2000, plane.getTotalWeight());

        }
    }

