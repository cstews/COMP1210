import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Test file for Business class. 
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/
public class BusinessTest {

/** Tests totalFare method. */
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
   
      Assert.assertEquals(1000, b.totalFare(), 0.0001);
   }
   
   /** Tests totalAwardMiles method. */
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertEquals(1600, b.totalAwardMiles(), 0.0001);
   }
   
   
   /** Tests toString method. */
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertTrue(b.toString().contains("Includes Food/Beverage: " 
         + "$50.00"));
   }

}
