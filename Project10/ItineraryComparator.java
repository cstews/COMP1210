import java.util.Comparator;
/**
* Class that inplements Comparator interface
* for AirTicket objects and orders them based
* on itinerary value.
*
* Project 10
* @author Courtney Stewart COMP1210-D01
* @version 11/12/2021
*/

public class ItineraryComparator implements Comparator<AirTicket> {

/**
* Compare method that compares the toString() method on two ticket's
* itinerary objects.
* @param t1 is the first ticket obkect being compared.
* @param t2 is the second ticket object being compared.
* @return a 0 if the 2 objects are equal, a positive int if the first
* is larger, and a negative int if the second is larger.
*/
   public int compare(AirTicket t1, AirTicket t2) {
   
      return t1.getItinerary().toString().compareTo(t2.getItinerary()
         .toString());
   
   }
}