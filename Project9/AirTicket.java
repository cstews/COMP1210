import java.text.DecimalFormat;
/**
* Abstract class that stores ticket 
* data and methods to access the data.
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/4/2021
*/

public abstract class AirTicket {

// instance variables
   protected String flightNum;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdjFactor;


// constructor
/**
* Constructor for Air Ticket.
* @param flightNumIn is flight number.
* @param tripDataIn is trip data information of type Itinerary.
* @param baseFareIn is the base fare of the flight.
* @param fareAdjFactorIn is the fare adjustment factor of the flight.
*/
   public AirTicket(String flightNumIn, Itinerary tripDataIn, double baseFareIn,
      double fareAdjFactorIn) {
      flightNum = flightNumIn;
      tripData = tripDataIn;
      baseFare = baseFareIn;
      fareAdjFactor = fareAdjFactorIn;
   }

// methods 

/**
* Getter method for the flight number.
* @return flight number.
*/
   public String getFlightNum() {
      return flightNum;
   }
   
   /**
   * Getter method for the base fare.
   * @return base fare.
   */
   public double getBaseFare() {
      return baseFare;
   }
   
   /**
   * Getter method for the fare adjustment factor.
   * @return fare adjustment factor.
   */
   public double getFareAdjustmentFactor() {
      return fareAdjFactor;
   }
   
   /**
   * Creates string with airticket information.
   * @return string with flight number, trip data, base fare,
   * the fare adjustment factor, and the total fare.
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      double subBaseFare = baseFare;
      String totalFare = fmt.format(totalFare());
   
      return "Flight: " + flightNum + "\n" + tripData 
         + " (" + totalAwardMiles() + " award miles)"
         + "\nBase Fare: " + fmt.format(subBaseFare) + " " 
         + "Fare Adjustment Factor: " + fareAdjFactor
         + "\nTotal Fare: " + totalFare + " (" + getClass() 
         + ")";
      
   }

/**
* Abstract method for total fare of airticket subclasses.
* @return total fare for the flight.
*/
   public abstract double totalFare();
   
   
   /**
   * Abstract method for the total amount of award miles
   * for airticket subclasses.
   * @return the total award miles for the flight.
   */
   public abstract int totalAwardMiles();

}