//import java.text.DecimalFormat;
/**
* Class that extends AirTicket for
* Non-Refundable ticket types.
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/

public class NonRefundable extends AirTicket {

// variables
   private double discountFactor;

// constructor
/** Constructor for NonRefundable ticket types.
* @param flightNumIn is inherited from AirTicket.
* @param tripDataIn is inherited from AirTicket.
* @param baseFareIn is inherited from AirTicket.
* @param fareAdjFactorIn is inherited from AirTicket.
* @param discountFactorIn is discount factor for ticket.
*/
   public NonRefundable(String flightNumIn, Itinerary tripDataIn,
       double baseFareIn, double fareAdjFactorIn, double discountFactorIn) {
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjFactorIn);
      discountFactor = discountFactorIn;
   }

// methods

/**
* Getter method for discount factor.
* @return discount factor.
*/
   public double getDiscountFactor() {
      return discountFactor;
   }
   
   /**
   * Calculates the total fare.
   * @return total fare which is base fare multiplied by
   * the fare adjustment factor, and the discount factor.
   */
   public double totalFare() {
      return baseFare * fareAdjFactor * discountFactor;
   }
   
   /**
   * Calculates the award miles for the ticket.
   * @return total award miles.
   */
   public int totalAwardMiles() {
      return tripData.getMiles();
   }
   
   /**
   * String with information about NonRefundable ticket.
   * @return information from AirTicket class along with 
   * discount factor.
   */
   public String toString() {
   
      String output = super.toString() + "\n   Includes DiscountFactor: " 
         + discountFactor;
      return output;
   }

}