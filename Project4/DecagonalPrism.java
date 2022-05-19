import java.text.DecimalFormat;
/** Program that calculates some
* values of a decagonal prism.
* 
* Project 4
* @author Courtney Stewart COMP-1210-D01
* @version 9/17/2021
*/
public class DecagonalPrism {

//instance variables
   private String label;
   private double baseEdge;
   private double height;

//constructor

/**
* Initializes methods to be used.
* @param labelIn must be non-negative double.
* @param baseEdgeIn must be non-negative double.
* @param heightIn must be non-negative double.
*/
   public DecagonalPrism(String labelIn, double baseEdgeIn, double heightIn) {
      
      setLabel(labelIn);
      setBaseEdge(baseEdgeIn);
      setHeight(heightIn);
   
   }
   
   //methods
   /** 
   * Returns the label of the prism.
   * @return stores the input for label.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Sets the label of the prism.
   * @param labelIn must be non-negative double.
   * @return returns label value.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         labelIn.trim();
         this.label = labelIn;
         return true;
      }
   }

/**
* Returns the base egde value.
* @return stores the baseEdge value.
*/
   public double getEdge() {
      return baseEdge;
   }
   
   /**
   * Sets the label of the base edge.
   * @param baseEdgeIn must be non-negative double.
   * @return returns the base edge value.
   */
   public boolean setBaseEdge(double baseEdgeIn) {
      if (baseEdge < 0) {
         return false;
      }
      else { 
         this.baseEdge = baseEdgeIn;
         return true;
      }
   }

/**
* Returns the height value.
* @return stores the height value.
*/
   public double getHeight() {
      return height;
   }
   
   /**
   * Sets the value of the height of the prism.
   * @param heightIn must be non-negative double.
   * @return returns the height value.
   */
   public boolean setHeight(double heightIn) {
      if (height < 0) {
         return false;
      }
      else {
         this.height = heightIn;
         return true;
      }
   }
   
   /**
   * Calculates surface area.
   * @return returns surface area calculation.
   */
   public double surfaceArea() {
      double surfaceArea = (10.0 * baseEdge * height) + ((5.0 
         * Math.pow(baseEdge, 2.0))  
         * Math.sqrt((5.0 + (2.0 * Math.sqrt(5.0)))));
      return surfaceArea;
   }
   
   /** 
   * Calculates area of base of prism.
   * @return returns the area of the base.
   */
   public double baseArea() {
      double baseArea = 0.0;
      baseArea = ((5.0 / 2.0) * Math.pow(baseEdge, 2.0)) * Math.sqrt((5.0 + (2.0
         * Math.sqrt(5.0))));
      return baseArea;
   }
   
   /**
   * Calculates the lateral surface area.
   * @return returns the lateral surface area.
   */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = 0.0;
      lateralSurfaceArea = (10 * baseEdge * height);
      return lateralSurfaceArea;
   }
   
   /**
   * Calculates the volume of the prism.
   * @return returns the volume.
   */
   public double volume() {
      double volume = 0.0;
      volume = ((5.0 / 2.0) * Math.pow(baseEdge, 2.0)) * Math.sqrt(5.0 + (2.0
         * Math.sqrt(5.0))) * height;
      return volume;
   }
   
   /**
   * Prints the output after calculations.
   * @return prints the output.
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      
      String surfaceArea = fmt.format(surfaceArea());
      String baseArea = fmt.format(baseArea());
      String baseEdge = fmt.format(surfaceArea());
      String lateralSurfaceArea = fmt.format(lateralSurfaceArea());
      String volume = fmt.format(volume());
      
      String output = "A decagonal prism " + label + " "
         + "with edge = " + baseEdge + " " + "units and height = "
         + height + " " + "units, has:" + "\n";
      output += "surface area = " + surfaceArea + " square units" + "\n";
      output += "base area = " + baseArea + " square units" + "\n";
      output += "lateral surface area = " + lateralSurfaceArea
         + " square units" + "\n";
      output += "volume = " + volume + " cubic units" + "\n";
      
      return output;
   }
}