import Airport.Flight;
import Airport.Passenger;
import Airport.Plane.Plane;
import CabinCrew.CabinCrewMember;
import CabinCrew.Pilot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    ArrayList<CabinCrewMember> flightCrew;
    ArrayList<Passenger> passengers;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        flight = new Flight();
        plane = new Plane();
        pilot = new Pilot();
        flightCrew = new ArrayList<>();
        flightCrew = new CabinCrewMember();
        flightCrew = new CabinCrewMember();
        flightCrew = new CabinCrewMember();
        flightCrew = new CabinCrewMember();
        passengers = new ArrayList<>();
        passenger1 = new Passenger();
        passenger2 = new Passenger();
        passenger3 = new Passenger();
        passenger4 = new Passenger();
    }

    @Test
    public void canGetFlightInfo(){

    }




}
