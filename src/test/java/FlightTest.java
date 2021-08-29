import Airport.Flight;
import Airport.Passenger;
import Airport.Plane.Plane;
import CabinCrew.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    ArrayList<> flightCrew;
    ArrayList<Passenger> passengers;
    FirstOfficer cabinCrewMember1;
    Purser cabinCrewMember2;
    FlightAttendant cabinCrewMember3;
    FlightAttendant cabinCrewMember4;
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
        flightCrew = new FirstOfficer("Ephraim Matta", "NY4N5HV15WT");
        flightCrew = new Purser();
        flightCrew = new FlightAttendant();
        flightCrew = new FlightAttendant();
        passengers = new ArrayList<>();
        passenger1 = new Passenger();
        passenger2 = new Passenger();
        passenger3 = new Passenger();
        passenger4 = new Passenger();
    }

    @Test
    public void canGetFlightInfo(){

    }

    @Test
    public void canGetPlaneType(){

    }

    @Test
    public void canGetPilotInfo(){

    }

    @Test
    public void canGetFlightCrewList(){

    }

    @Test
    public void canGetPassengerList(){

    }

//    @Test
//    public void canGetNumberOfAvailableSeats(){
//
//    }
//
//    @Test
//    public void bookPassengerOntoFlightWithSpace(){
//
//    }
//
//    @Test
//    public void bookPassengerOntoFlightWithNoSpace(){
//
//    }


}
