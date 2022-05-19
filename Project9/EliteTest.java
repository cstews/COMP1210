import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** Test file for Elite class. 
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/
public class EliteTest {

/** Tests totalFare method. */
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
   
      Assert.assertEquals(1325, be.totalFare(), 0.0001);
   }
   
   /** Tests toString method with inherited information. */
   @Test public void toStringTest1() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      
      Assert.assertTrue(be.toString().contains("Includes Food/Beverage: " 
         + "$50.00"));
   }
   
   /** Tests toString method for new communication services info. */
   @Test public void toStringTest2() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      
      Assert.assertTrue(be.toString().contains("Includes: Comm Services: "
            + "$100.00"));
   }
   
}
