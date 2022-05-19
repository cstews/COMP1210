import java.text.DecimalFormat;
/**
* Simple program to calculate the areas of
* different faces of a triangular prism, along
* with its surface area and volume.
*
* Project 8
* @author Courtney Stewart
* @version 10/29/2021
*/
public class TriangularPrism implements Comparable<TriangularPrism> {

//instance variables
   private String label = "";
   private double edge = 0.0;
   private double height = 0.0;
   
//class variable
   private static int count = 0;

//constructor
/**
* Constructor for TraingularPrism object. 
* @param labelIn is type String.
* @param edgeIn is type double.
* @param heightIn is type double.
*/
   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      count++;
   }

//methods

/**
* Getter method for label name.
* @return returns label of type String.
*/
   public String getLabel() {
      return label;
   }

/**
* Sets label name.
* @param labelIn is type String.
* @return returns true and sets label if label is usable.
*/
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         this.label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * Getter method for edge value.
   * @return returns edge value of type double.
   */
   public double getEdge() {
      return edge;
   }

/**
* Sets edge value.
* @param edgeIn is type double.
* @return returns true if edge is not negative.
*/
   public boolean setEdge(double edgeIn) {
      if (edgeIn < 0) {
         return false;
      }
      else { 
         this.edge = edgeIn;
         return true;
      }
   }
   
   /**
   * Getter method for height value.
   * @return returns height as type double.
   */
   public double getHeight() {
      return height;
   }
   
   /**
   * Sets height.
   * @param heightIn is type double.
   * @return true if height is non-negative.
   */
   public boolean setHeight(double heightIn) {
      if (heightIn < 0) {
         return false;
      }
      else {
         this.height = heightIn;
         return true;
      }
   }

/**
* Calculates area of the triangle face of prism.
* @return area of type double.
*/
   public double triangleArea() {
      double triangleArea = 0.25 * Math.sqrt(3 * Math.pow(edge, 4));
      return triangleArea;
   
   }
  
  /**
  * Calculates area of the rectangle face of prism.
  * @return area of type double.
  */
   public double rectangleArea() {
      double rectangleArea = edge * height;
      return rectangleArea;
   }

/**
* Calculates the surface area of the triangular prism.
* @return area of type double.
*/
   public double surfaceArea() {
      double surfaceArea = (2 * triangleArea()) + (3 * rectangleArea());
      return surfaceArea;
   }
   
  /**
  * Calculates the volume of the triangular prism.
  * @return volume of type double.
  */
   public double volume() {
      double volume = triangleArea() * height;
      return volume;
   }
   
   /**
   * Creates a String with information about the triangular prism
   * object, including the label, height, edge, calculated triangle 
   * area, calculated rectangle area, calculated surface area, and
   * calculated volume.
   * @return String containing the description. 
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
    
      String rectangleArea = fmt.format(rectangleArea());
      String triangleArea = fmt.format(triangleArea());
      String surfaceArea = fmt.format(surfaceArea());
      String volume = fmt.format(volume());
    
      String output = "TriangularPrism " + "\"" + label + "\"" 
         + " with triangle edge of "
         + edge + " units \nand prism height of " + height + " units has: \n"
         + "\ttriangle area = " + triangleArea + " square units \n" 
         + "\trectangle area = " + rectangleArea + " square units \n"
         + "\tsurface area = " + surfaceArea + " square units \n"
         + "\tvolume = " + volume + " cubic units \n";
      
      return output;
   
   }
   
   /**
   * Getter method for the amount of prisms
   * that have been created.
   * @return count of type int.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count of the amount of prism objects.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Checks if a triangular prism object is the same as another.
   * @param obj is a TraingularPrism object with a String label,
   * double edge value, and double height value.
   * @return true if the object has the same values as the one 
   * being compared to.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof TriangularPrism)) {
         return false;
      }
      else {
         TriangularPrism d = (TriangularPrism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && (Math.abs(edge - d.getEdge()) < .000001)
            && (Math.abs(height - d.getHeight()) < .000001));
      }
   }
   
   /**
   * Necessary for equals() method so the two objects 
   * will have the same hash code.
   * @return returns 0 of type int.
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * Compares Triangluar Prism objects' volumes to see
   * if they're equal, or which is smaller/larger.
   * @param obj must be a Triangular Prism.
   * @return returns 0 if the volumes are equal, 
   * -1 if the first volume is less than the second,
   * and 1 if the first volume is more than the second.
   */
   public int compareTo(TriangularPrism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; // considers them equal and returns 0
      }
      else if (this.volume() < obj.volume()) {
         return -1; // should return a negative number
      }
      else {
         return 1; // should return a positive number
      }
   }
   
}