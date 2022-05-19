import java.util.ArrayList;
import java.text.DecimalFormat;
/**
* Simple program that contains list
* for DecagonalPrismApp.
* 
* Project 5
* @author Courtney Stewart COMP1210-D01
* @version 9/24/2021
*/

public class DecagonalPrismList {

// instance variables
   private String label;
   private ArrayList<DecagonalPrism> prisms 
      = new ArrayList<DecagonalPrism>();
   
   // constructors
   /**
   * Prints information about decagonal prism list.
   * @param name must be String
   * @param list is name of ArrayList
   */
   public DecagonalPrismList(String name, ArrayList<DecagonalPrism> list) {
      label = name;
      prisms = list;
   }
   
   
   //methods
   /**
   * Gets name of list.
   * @return returns list name.
   */
   public String getName() {
      return label;
   }
   
   /**
   * Gets number of objects in prism ArrayList.
   * @return returns number of objects in ArrayList.
   */
   public int numberOfDecagonalPrisms() {
      return prisms.size();
   }
   
   /**
   * Calculates the total surface area of the prisms
   * in the ArrayList.
   * @return returns the calculation of total SA.
   */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      int i = 0;
      while (i < prisms.size()) {
         totalSurfaceArea += prisms.get(i).surfaceArea();
         i++;
      }
      return totalSurfaceArea;
   }
   
   /**
   * Calculates the total base area of the prisms.
   * @return returns the calculation of total base areas.
   */
   public double totalBaseArea() {
      double totalBaseArea = 0;
      int i = 0;
      while (i < prisms.size()) {
         totalBaseArea += prisms.get(i).baseArea();
         i++;
      }
      return totalBaseArea;
   }  
   
   /**
   * Calculates the total lateral surface area of prisms.
   * @return returns the calculation of the lateral surface areas.
   */
   public double totalLateralSurfaceArea() {
      double totalLateralSurfaceArea = 0;
      int i = 0;
      while (i < prisms.size()) {
         totalLateralSurfaceArea += prisms.get(i).lateralSurfaceArea();
         i++;
      }
      return totalLateralSurfaceArea;
   }  
   
   /** 
   * Calucates the total volume of the prisms in the ArrayList.
   * @return returns the added volumes.
   */
   public double totalVolume() {
      double totalVolume = 0;
      int i = 0;
      while (i < prisms.size()) {
         totalVolume += prisms.get(i).volume();
         i++;
      }
      return totalVolume;
   }  
   
   /**
   * Calculates the average SA for the objects in the list.
   * @return returns the average prism surface area.
   */
   public double averageSurfaceArea() {
      if (prisms.size() == 0) {
         return 0;
      }
      return totalSurfaceArea() / prisms.size();
   }
   
   /**
   * Calculates the average volume for the objects in the list.
   * @return returns the average volume of the prisms.
   */
   public double averageVolume() {
      if (prisms.size() == 0) {
         return 0;
      }
      return totalVolume() / prisms.size();
   }
   
   /**
   * Returns the name of the list and the prisms in the list.
   * @return returns label and name values.
   */
   public String toString() {
      int i = 0;
      String names = label + "\n\n";
      while (i < prisms.size()) {
         names += prisms.get(i).toString() + "\n";
         i++;
      }
      return names; 
   }
   
   /**
   * Prints output of calculations.
   * @return prints entire summary paragraph.
   */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      int numberOfDecagonalPrisms = numberOfDecagonalPrisms();
      String totalSurfaceArea = fmt.format(totalSurfaceArea());
      String totalBaseArea = fmt.format(totalBaseArea());
      String totalLateralSurfaceArea = fmt.format(totalLateralSurfaceArea());
      String totalVolume = fmt.format(totalVolume());
      String averageSurfaceArea = fmt.format(averageSurfaceArea());
      String averageVolume = fmt.format(averageVolume());
      
      String summary = "----- Summary for " + label
         + " -----";
      summary += "\n" + "Number of Decagonal Prisms: " 
            + numberOfDecagonalPrisms;
      summary += "\n" + "Total Surface Area: " 
            + totalSurfaceArea;
      summary += "\n" + "Total Base Area: " 
            + totalBaseArea;
      summary += "\n" + "Total Lateral Surface Area: " 
            + totalLateralSurfaceArea;
      summary += "\n" + "Total Volume: " + totalVolume;
      summary += "\n" + "Average Surface Area: " 
            + averageSurfaceArea;
      summary += "\n" + "Average Volume: " + averageVolume;
      return summary;
   }
}
