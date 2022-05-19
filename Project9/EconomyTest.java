import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Test file for Economy class. 
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/
public class EconomyTest {

/** Tests totalFare method. */
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      
      Assert.assertEquals(450, e.totalFare(), 0.001);
   }
   
   /** Tests totalAwardMiles method. */
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
   
      Assert.assertEquals(1200, e.totalAwardMiles(), 0.0001);
   }

/** Tests toString method. */
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      
      Assert.assertTrue(e.toString().contains("Includes Award Miles Factor: "
           + "1.5"));
   }

}
