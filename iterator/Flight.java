/**
 * Annie Koshy
 * Flight
 * flight with details
 * start times, end times, number of transfers
 */
 
import java.time.LocalTime;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;
/**
 * @param flightNum 
 * the flight number
 * @param from 
 * departure airport
 * @param to 
 * arrival airport
 * @param startTime
 * departure time
 * @param endTime
 * arrival time
 * @param numTransfers
 * # of transfers for flight
 */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }
/**
 * @return 
 * returns departure airport
 */
    public Airport getFrom() {
        return from;
    }
/**
 * returns destination airport
 * @return
 */
    public Airport getTo() {
        return to;
    }
/**
 * Checks if flight has the same departure and destination airports as the specified airports
 * @param from - the departure airport to compare
 * @param to - the arrival airport to compare
 * @return - if both airports are the same; false otherwise
 */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }
/**
 * returns a string represenation of flight
 * route, times, length, transfer info
 * @return
 * return string representation of flight
 */
    @Override
    public String toString() {
        String transfers = numTransfers == 0 ? "Direct Flight" : (numTransfers == 1 ? "1 Stopover" : numTransfers + " Transfers");
        return String.format("%s to %s %s - %s (%dh %dm) %s", 
                from, to, startTime, endTime, 
                calculateDurationHours(), calculateDurationMinutes(), transfers);
    }
/**
 * @return 
 * determines and returns duration of flight (in hrs)
 */
    private long calculateDurationHours() {
        return java.time.Duration.between(startTime, endTime).toHours();
    }
/**
 * @return 
 * determines and returns duration of flight (in min)
 */
    private long calculateDurationMinutes() {
        return java.time.Duration.between(startTime, endTime).toMinutes() % 60;
    }
}