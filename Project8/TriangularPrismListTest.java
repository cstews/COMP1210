import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
* Tests methods in TriangularPrismTest class.
* 
* Project 8
* @author Courtney Stewart COMP1210-D01
* @version 10/29/2021
*/
public class TriangularPrismListTest {

/** Tests getName method. **/
   @Test public void getNameTest() {
   
      TriangularPrism p = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism[] prisms = {p};
      TriangularPrismList l = new TriangularPrismList("Test", prisms, 1); 
      
      Assert.assertEquals("Test", l.getName());
   }
   
   
   /** Tests numberOfTriangularPrisms method. **/
   @Test public void numberOfTriangularPrismsTest() {
      TriangularPrism p = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism[] prisms = {p};
      TriangularPrismList l = new TriangularPrismList("Test", prisms, 1); 
   
      Assert.assertEquals(1, l.numberOfTriangularPrisms());
   }
   
   
   /** Tests totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest() {
      TriangularPrism p = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism[] prisms = {p};
      TriangularPrismList l = new TriangularPrismList("Test", prisms, 1); 
   
      Assert.assertEquals(20.356, l.totalSurfaceArea(), 0.0001);
   }
   
   
   /** Tests totalVolume method. **/
   @Test public void totalVolumeTest() {
      TriangularPrism[] p = new TriangularPrism[2];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1); 
   
      Assert.assertEquals(4.55962375092507, l.totalVolume(), 0.00001);
   }
   
   
   /** Tests averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1); 
   
      Assert.assertEquals(20.356, l.averageSurfaceArea(), 0.0001);
   }
   
   
   /** Tests averageVolume method. **/
   @Test public void averageVolumeTest() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      Assert.assertEquals(4.55962375092507, l.averageVolume(), 0.0001);
   }
   
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      Assert.assertTrue(l.toString().contains("Number of TriangularPrisms: "));
   }
   
   /** Tests getList method. **/
   @Test public void getListTest() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      Assert.assertArrayEquals(p, l.getList());
   }
   
   /** Tests addTriangularPrism method/ **/
   @Test public void addTriangularPrismTest() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      //l.addTriangularPrism("Medium Example", 10.7, 25.4);
   
      //Assert.assertEquals(p[0].getLabel(), "Medium Example");
   
   }
   
   /** Tests findTriangularPrism method when prism is in list. **/
   @Test public void findTriangularPrismTest1() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      Assert.assertEquals(l.findTriangularPrism("Small Example"), p[0]);
   }
   
   /** Tests findTriangularPrism method when prism is not in list. **/
   @Test public void findTriangularPrismTest2() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
      
      Assert.assertEquals(l.findTriangularPrism("Medium"), null); 
   }
   
   
   /** Tests deleteTriangularPrism method when prism in is list. **/
   @Test public void deleteTriangularPrismTest1() {
      TriangularPrism[] p = new TriangularPrism[2];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      p[1] = new TriangularPrism("Medium Example", 10.7, 25.4);
      TriangularPrismList l = new TriangularPrismList("name1", p, 2);
      
      l.deleteTriangularPrism("Small Example");
      
      Assert.assertEquals(p[1], null);
   }
   
   /** Tests deleteTriangularPrism method when prism is not in list. **/
   @Test public void deleteTriangularPrismTest2() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
      
      Assert.assertEquals(l.deleteTriangularPrism("Medium"), null);
   }
   
   /** Tests editTriangularPrism method when prism is in list. **/
   @Test public void editTriangularPrismTest1() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
      
      l.editTriangularPrism("Small Example", 2.0, 3.25);
      
      Assert.assertEquals(p[0].getEdge(), 2.0, 0.0001);
   }
   
   /** Tests editTriangularPrism method when prism is not in list. **/
   @Test public void editTriangularPrismTest2() {
      TriangularPrism[] p = new TriangularPrism[1];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList l = new TriangularPrismList("name1", p, 1);
   
      Assert.assertEquals(l.editTriangularPrism("Medium", 2.0, 20), false);
   }
   
   /** Tests findTriangularPrismWithLargestVolume method. **/
   @Test public void findTriangularPrismWithLargestVolumeTest1() {
      TriangularPrism[] p = new TriangularPrism[2];
      p[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      p[1] = new TriangularPrism("Medium Example", 10.7, 25.4);
      TriangularPrismList l = new TriangularPrismList("name1", p, 2);
   
      Assert.assertEquals(l.findTriangularPrismWithLargestVolume(), p[1]);
   }
   
   /** Tests findTriangularPrismWithLargestVolume if there are 0 objects. **/
   @Test public void findTriangularPrismWithLargestVolumeTest() {
      TriangularPrism[] t = new TriangularPrism[0];
      TriangularPrismList k = new TriangularPrismList("name2", t, 0);
   
      Assert.assertEquals(k.findTriangularPrismWithLargestVolume(), null);
   }
   
   
}
