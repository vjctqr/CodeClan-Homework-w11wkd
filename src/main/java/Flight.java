
import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> bookedPassengers;
    private PlaneType craft;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, PlaneType craft){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.bookedPassengers = new ArrayList<Passenger>();
        this.craft = craft;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public int bookedPassengerSize(){
        return this.bookedPassengers.size();
    }






}
