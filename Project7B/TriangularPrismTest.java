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
   
   /** Tests setLabel if label is null. **/
   @Test public void setLabelTest() {
      TriangularPrism prism7 = new TriangularPrism(null, 2.5, 2.5);
      Assert.assertEquals(false, prism7.setLabel(null));
   }
   
   /** Tests edge value. **/
   @Test public void getEdgeTest() {
      TriangularPrism prism2 = 
         new TriangularPrism("Medium Example", 10.7, 25.4);
      Assert.assertEquals(10.7, prism2.getEdge(), .0001);
   }
   
   /** Tests edge value if negative number is given. **/
   @Test public void setEdgeTest() {
      TriangularPrism prism9 = new TriangularPrism("Negative ex", 1.0, 1.0);
      Assert.assertEquals(false, prism9.setEdge(-1.0));
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
   
   /** Tests equals method if not equal. **/
   @Test public void equalsTest1() {
      TriangularPrism prism4 = 
         new TriangularPrism("Small", 1.2, -2.2);
      TriangularPrism prism3 = 
         new TriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertEquals(false, prism4.equals(prism3));
   }
   
   /** Tests equals method if the same. **/
   @Test public void equalsTest2() {
      TriangularPrism prism5 = new TriangularPrism("small", 2.0, 2.0);
      TriangularPrism prism6 = new TriangularPrism("SMALL", 2.0, 2.0);
      Assert.assertEquals(true, prism5.equals(prism6));
   }
   
   /** Tests equals method if edge value is the same but height isn't. **/
   @Test public void equalsTest3() {
      TriangularPrism prism5 = new TriangularPrism("small", 2.0, 1.0);
      TriangularPrism prism6 = new TriangularPrism("SMALL", 2.0, 2.0);
      Assert.assertEquals(false, prism5.equals(prism6));
   }
   
   /** Tests equals method if edge value is different but height is same. **/
   @Test public void equalsTest4() {
      TriangularPrism prism5 = new TriangularPrism("small", 1.0, 2.0);
      TriangularPrism prism6 = new TriangularPrism("SMALL", 2.0, 2.0);
      Assert.assertEquals(false, prism5.equals(prism6));
   }
   
   /** Tests equals method when one object is not a prism object. **/
   @Test public void equalstest5() {
      TriangularPrism prism5 = new TriangularPrism("small", 1.0, 2.0);
      TriangularPrism prism10 = new TriangularPrism("small", -1.0, 1.0);
      Assert.assertEquals(false, prism5.equals(prism10));
   }
   
   /** Tests equals method when one object is a string. **/
   @Test public void equalsTest6() {
      TriangularPrism prism5 = new TriangularPrism("small", 1.0, 2.0);
      String prism11 = "";
      Assert.assertEquals(false, prism5.equals(prism11));
   }
   
   /** Tests hash code. **/
   @Test public void hashCodeTest() {
      TriangularPrism prism1 = 
         new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(0, prism1.hashCode(), .0001);
   }
   
   /** Tests comparison method when first is less than second. **/
   @Test public void compareToTest1() {
      TriangularPrism prism1 = new TriangularPrism("Small one", 1.0, 1.0);
      
      TriangularPrism prism2 = new TriangularPrism("Big one", 10.0, 10.0);
      
      Assert.assertTrue(prism1.compareTo(prism2) < 0);
   
   }
   
   /** Tests comparison method when objects are equal in volume. **/
   @Test public void compareToTest2() {
      TriangularPrism prism1 = new TriangularPrism("Small", 1.0, 1.0);
   
      TriangularPrism prism2 = new TriangularPrism("Small also", 1.0, 1.0);
   
      Assert.assertTrue(prism1.compareTo(prism2) == 0);
   
   }
   
   /** Tests comparison method when first is more than second. **/
   @Test public void compareToTest3() {
      TriangularPrism prism1 = new TriangularPrism("Big one", 5.0, 5.0);
   
      TriangularPrism prism2 = new TriangularPrism("Small one", 1.0, 1.0);
   
      Assert.assertTrue(prism1.compareTo(prism2) > 0);
   
   }
}
