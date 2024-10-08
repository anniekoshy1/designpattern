/**
 * Annie Koshy
 * Airline
 * an airline with a title and list of flights
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;
/**
 * @param title 
 * airline title
 */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }
/**
 * @return
 * returns the title of the airline
 */
    public String getTitle() {
        return title;
    }
/**
 * @param fromCode 
 * airport code for the airport where the departure is
 * @param toCode 
 * airport code for the destination airport
 * @return
 * return FLightIterator for flights between two airports
 * invalid message sent if airport code is invalid
 */
    public FlightIterator createIterator(String fromCode, String toCode) {
        Airport from = getAirport(fromCode);
        Airport to = getAirport(toCode);
        
        if (from == null || to == null) {
            System.out.println("Must enter valid airport codes");
            return null; 
        }
        
        return new FlightIterator(flights, from, to);
    }
/**
 * @param code 
 * the airport code
 * @return 
 * returns code if code is valid
 * or returns invalid message
 */
    private Airport getAirport(String code) {
        try {
            return Airport.valueOf(code.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return null; 
        }
    }
}