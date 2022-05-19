import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
* Test file for Itinerary class.
* 
* Project 9
* @author Courtney Stewart COMP1210-D01
* @version 11/5/2021
*/
public class ItineraryTest {

/** Tests getFromAirport method. */
   @Test public void getFromAirportTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Assert.assertEquals("ATL", trip.getFromAirport());
   }


// /** Tests setFromAirport method. */
   // @Test public void setFromAirportTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // trip.setFromAirport("LAX");
      // Assert.assertEquals("LAX", trip.getFromAirport());
   // }
// 
//    /** Tests getToAirport method. */
   // @Test public void getToAirportTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // Assert.assertEquals("LGA", trip.getToAirport());
   // }
//    
// /** Tests setToAirport method. */
   // @Test public void setToAirportTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // trip.setToAirport("LAX");
      // Assert.assertEquals("LAX", trip.getToAirport());
   // }
//    
   
   /** Tests getDepDateTime method. */
   @Test public void getDepDateTimeTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Assert.assertEquals("2021/11/21 1400", trip.getDepDateTime());
   }
   
  //  /** Tests setDepDateTime method. */
   // @Test public void setDepDateTimeTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // trip.setDepDateTime("2022/11/21 1200");
   //       
      // Assert.assertEquals("2022/11/21 1200", trip.getDepDateTime());
   // }
//    
//    /** Tests getArrDateTime method. */
   // @Test public void getArrDateTimeTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // Assert.assertEquals("2021/11/21 1640", trip.getArrDateTime());
   // }
//    
//    /** Tests setArrDateTime method. */
   // @Test public void setArrDateTimeTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // trip.setArrDateTime("2021/11/22 1200");
   //       
      // Assert.assertEquals("2021/11/22 1200", trip.getArrDateTime());
   // }
   
   /** Tests getMiles method. */
   @Test public void getMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Assert.assertEquals(800, trip.getMiles(), 0.0001);
   }
   
//    /** Tests setMiles method. */
   // @Test public void setMilesTest() {
      // Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         // "2021/11/21 1640", 800);
   //       
      // trip.setMiles(500);
   //       
      // Assert.assertEquals(500, trip.getMiles(), 0.0001);   
   // }
   
   /** Tests toString method. */
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      Assert.assertTrue(trip.toString().contains("ATL-LGA"));
   }

}
