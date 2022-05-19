import java.text.DecimalFormat;
/**
* Class that extends AirTicket for 
* Elite ticket types.
*
* Project 11
* @author Courtney Stewart COMP1210-D01
* @version 11/29/2021
*/

public class Elite extends Business {

// variables
   private double commServices;

// constructor
/**
* Constructor for Elite ticket class.
* @param flightNumIn is inherited from AirTicket.
* @param tripDataIn is inherited from AirTicket.
* @param baseFareIn is inherited from AirTicket.
* @param fareAdjFactorIn is inherited from AirTicket.
* @param foodAndBevIn is food and beverage inherited from Business.
* @param entertainmentIn is entertainment inherited from Business.
* @param commServicesIn is communication services included with Elite ticket.
*/
   public Elite(String flightNumIn, Itinerary tripDataIn,
       double baseFareIn, double fareAdjFactorIn, double foodAndBevIn,
       double entertainmentIn, double commServicesIn) {
       
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjFactorIn,
         foodAndBevIn, entertainmentIn);
       
      commServices = commServicesIn;
   }

// methods

/**
* Calculates the toal fare by adding the communications to the
* business ticket cost.
* @return the total cost of ticket.
*/
   public double totalFare() {
      return super.totalFare() + commServices;
   }

   /**
   * Creates a string with information about an Elite ticket.
   * @return inherited information from Business class and 
   * communication services.
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "   Includes: Comm Services: "
         + fmt.format(commServices);
      return output + "\n";
   }

}