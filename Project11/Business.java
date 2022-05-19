import java.text.DecimalFormat;
/**
* Class that extends AirTicket for 
* Business ticket types.
*
* Project 11
* @author Courtney Stewart COMP1210-D01
* @version 11/29/2021
*/
public class Business extends AirTicket {

// variables  
   protected double foodAndBev;
   protected double entertainment;

    /** Constant business award value. */
   public final static double BUSINESS_AWARD = 2.0;

// constructor
/**
* Constructor for business class ticket.
* @param flightNumIn is inherited from AirTicket.
* @param tripDataIn is inherited from AirTicket.
* @param baseFareIn is inherited from AirTicket.
* @param fareAdjFactorIn is inherited from AirTicket.
* @param foodAndBevIn is food and beverage cost awarded with ticket.
* @param entertainmentIn is entertainment cost included with ticket.
*/
   public Business(String flightNumIn, Itinerary tripDataIn,
       double baseFareIn, double fareAdjFactorIn, double foodAndBevIn,
       double entertainmentIn) {
       
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjFactorIn);
      
      foodAndBev = foodAndBevIn;
      entertainment = entertainmentIn;
   }

// methods

/**
* Calculates the total fare of the ticket.
* @return the base fare multiplied by the fare adjustment factor
* with the food/beverage cost and entertainment cost added.
*/
   public double totalFare() {
      return (baseFare * fareAdjFactor) + foodAndBev + entertainment;
   }
   
   /** 
   * Calculates the total amount of award miles.
   * @return the amount of miles traveled multiplied by the
   * business ticket award of 2.0.
   */
   public int totalAwardMiles() {
      int awardMiles = (int) (tripData.getMiles() * BUSINESS_AWARD);
   
      return awardMiles;
   }
   
   /**
   * Creates a string with information about a business ticket.
   * @return inherited information from AirTicket class and 
   * the food/beverage amount and entertainment amount.
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
   
      String output = super.toString() + "\n   Includes Food/Beverage: "
         + fmt.format(foodAndBev) + " Entertainment: " 
         + fmt.format(entertainment);
      return output + "\n";
   }

}