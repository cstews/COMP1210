import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
* Test file for NonRefundable class.
*
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/
public class NonRefundableTest {

/** Tests getFlightNum method from AirTicket class. */
   @Test public void getFlightNumTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      
      Assert.assertEquals("DL 1860", nr.getFlightNum());
   }
   
   /** Tests getBaseFare method from AirTicket class. */
   @Test public void getBaseFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      
      Assert.assertEquals(450, nr.getBaseFare(), 0.0001);
   }
   
   /** Tests getFareAdjustmentFactor method from AirTicket class. */
   @Test public void getFareAdjustmentFactor() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      
      Assert.assertEquals(0.45, nr.getFareAdjustmentFactor(), 0.0001);
   }
   

/** Tests getDiscountFactor method. */
   @Test public void getDiscountFactorTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
   
      Assert.assertEquals(0.90, nr.getDiscountFactor(), 0.0001);
   }
   
/** Tests totalFare method. */
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      Assert.assertEquals(182.25, nr.totalFare(), 0.0001);
   }

/** Tests totalAwardMiles method. */
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      Assert.assertEquals(800, nr.totalAwardMiles(), 0.0001);
   }
   
   
/** Tests toString method. */
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      Assert.assertTrue(nr.toString().contains("Flight: DL 1860"));
   }

}
