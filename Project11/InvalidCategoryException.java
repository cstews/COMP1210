/**
* Exception to be thrown and caught in
* readAirTicketFile method in AirTicket
* Processor class.
*
* Project 11
* @author Courtney Stewart
* @version 11/29/2021
*/

public class InvalidCategoryException extends Exception {

/**
* Exception using category.
* @param category is the invalid category.
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}