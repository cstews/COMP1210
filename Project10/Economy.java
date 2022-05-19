/**
* Class that extends AirTicket for 
* Economy ticket types.
*
* Project 10
* @author Courtney Stewart COMP1210-D01
* @version 11/12/2021
*/

public class Economy extends AirTicket {

// variables
/** Constant economy award value. */
   public static final double ECONOMY_AWARD = 1.5;

// constructor
/**
* Constructor for Economy class ticket.
* @param flightNumIn is inherited from AirTicket.
* @param tripDataIn is inherited from AirTicket.
* @param baseFareIn is inherited from AirTicket.
* @param fareAdjFactorIn is inherited from AirTicket.
*/
   public Economy(String flightNumIn, Itinerary tripDataIn, double baseFareIn,
         double fareAdjFactorIn) {
      
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjFactorIn);
      
   }

// methods

/**
* Calculates the total fare by multiplying the base fare
* by the fare adjustment factor.
* @return the calculated total fare.
*/
   public double totalFare() {
      return baseFare * fareAdjFactor;
   }
   
   /**
   * Calculates the total amount of award miles by multiplying
   * the amount of miles by the economy ticket award amount (1.5).
   * @return the calculated amount of award miles.
   */
   public int totalAwardMiles() {
   
      int awardMiles = (int) (tripData.getMiles() * ECONOMY_AWARD);
   
      return awardMiles;
      
   }
   
   
   /** 
   * Creates a string with information about economy ticket.
   * @return inherited information from AirTicket class and 
   * the award miles factor.
   */
   public String toString() {
      String output = super.toString() 
         + "\n   Includes Award Miles Factor: 1.5";
      return output + "\n";
   }

}