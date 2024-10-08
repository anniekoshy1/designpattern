/*
 * Annie Koshy
 * FlightIterator
 */


import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
/**
 * @param flights
 * list of flights
 * @param from 
 * the departure airport
 * @param to
 * the arrival airport
 */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = new ArrayList<>();
        this.position = 0;

        for (Flight flight : flights) {
            if (flight.getFrom() == from && flight.getTo() == to) {
                this.flights.add(flight);
            }
        }
    }
/**
 * @return 
 * return if there is at least one more flight or else false
 */
    @Override
    public boolean hasNext() {
        return position < flights.size();
    }
/**
 * Returns next flight 
 * @return 
 */
    @Override
    public Flight next() {
        return flights.get(position++);
    }
}