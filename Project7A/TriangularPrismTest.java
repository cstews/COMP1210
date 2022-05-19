import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;

/**
* Tests methods for the TriangularPrism class.
*/
public class TriangularPrismTest {

   
   /** Tests label. **/
   @Test public void getLabelTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals("Small Example", prism1.getLabel());
   }
   
   /** Tests edge value. **/
   @Test public void getEdgeTest() {
      TriangularPrism prism2 = 
         new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(10.7, prism2.getEdge(), .0001);
   }
   
   /** Tests height value. **/
   @Test public void getHeightTest() {
      TriangularPrism prism3 = 
         new TriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertEquals(105.0, prism3.getHeight(), .0001);
   }
   
   /** Tests triangle area. **/
   @Test public void triangleAreaTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(1.403, prism1.triangleArea(), .0001);
   }
   
   /** Tests rectangle area. **/
   @Test public void rectangleAreaTest() {
      TriangularPrism prism2 = 
         new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(271.78, prism2.rectangleArea(), .0001);
   }
   
   /** Tests surface area. **/
   @Test public void surfaceAreaTest() {
      TriangularPrism prism3 = 
         new TriangularPrism("Large Example", 45.47, 105.0);
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String surfaceArea = fmt.format(prism3.surfaceArea());
      Assert.assertEquals("16,113.576", surfaceArea);
   }
   
   /** Tests volume. **/
   @Test public void volumeTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String volume = fmt.format(prism1.volume());
      Assert.assertEquals("4.56", volume);
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      TriangularPrism prism3 = 
         new TriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertTrue(prism3.toString().contains("\"Large Example\""));
   }
   
   /** Tests count resetter. **/
   @Test public void resetCountTest() {
      TriangularPrism prism2 = 
         new TriangularPrism("Medium Example", 10.7, 25.4);
      prism2.resetCount();
      Assert.assertEquals(0, prism2.getCount(), .0001);
   }
   
   /** Tests getCount method. **/
   //May need to change
   @Test public void getCountTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      prism1.resetCount();
      Assert.assertEquals(0, prism1.getCount(), .0001);
   }
   
   /** Tests equals method. **/
   @Test public void equalsTest() {
      TriangularPrism prism4 = 
         new TriangularPrism("Small", 1.2, -2.2);
      TriangularPrism prism3 = 
         new TriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertEquals(false, prism4.equals(prism3));
   }
   
   /** Tests hash code. **/
   @Test public void hashCodeTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(0, prism1.hashCode(), .0001);
   }
   
}
