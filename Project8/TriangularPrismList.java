import java.text.DecimalFormat;
/**
* Class that stores the name of the list
* and an array of TriangularPrism objects.
*
* Project 8
* @author Courtney Stewart COMP1210-D01
* @version 10/29/2021
*/
public class TriangularPrismList {

// instance variables
   private String listName = "";
   private TriangularPrism[] prisms;
   private int numOfObjects = 0;

// constructor

/**
* Constructor for TriangularPrismList.
* @param listNameIn is list name.
* @param prismsIn is array of TriangularPrisms.
* @param numOfObjectsIn is the amount of TriangularPrisms in the array.
*/
   public TriangularPrismList(String listNameIn, TriangularPrism[] prismsIn, 
      int numOfObjectsIn) {
      listName = listNameIn;
      prisms = prismsIn;
      numOfObjects = numOfObjectsIn;
   }

// methods

/**
* Getter method for name of list.
* @return listName of type string.
*/
   public String getName() {
      return listName;
   }
   
   /**
   * Gets the amount of prisms in the array.
   * @return number of TriangularPrisms in array of type int.
   */
   public int numberOfTriangularPrisms() {
      return numOfObjects;
   }
   
   /**
   * Calculates the total surface area of all of the triangular
   * prisms in the array.
   * @return the total surface area of type double.
   */
   public double totalSurfaceArea() {
   
      double totalSurfaceArea = 0.0;
      
      for (int i = 0; i < numOfObjects; i++) {
         totalSurfaceArea += prisms[i].surfaceArea();
      }
      
      return totalSurfaceArea;
   }
   
   /**
   * Calculates the total volume of all of the triangular prisms
   * in the array.
   * @return the total volume of type double.
   */
   public double totalVolume() {
   
      double totalVolume = 0.0;
   
      for (int i = 0; i < numOfObjects; i++) {
         totalVolume += prisms[i].volume();
      }
   
      return totalVolume;
   }
   
/**
* Calculates the average surface area of all of the triangular
* prisms in the array.
* @return average surface area of type double.
*/
   public double averageSurfaceArea() {
   
      double avg = 0.0;
      avg = totalSurfaceArea() / numOfObjects;
   
      return avg;
   }
   
/**
* Calculates the average volume of all of the triangular prisms
* in the array.
* @return average volume of type double.
*/
   public double averageVolume() {
   
      double avg = 0.0;
      avg = totalVolume() / numOfObjects;
   
      return avg;
   }

/**
* A string of summary info for the TriangularPrism test list.
* @return summary of the objects of type String.
*/
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String totalSurfaceArea = fmt.format(totalSurfaceArea());
      String totalVolume = fmt.format(totalVolume());
      String averageSurfaceArea = fmt.format(averageSurfaceArea());
      String averageVolume = fmt.format(averageVolume());
    
      String output = "----- Summary for " + listName + " -----"
         + "\nNumber of TriangularPrisms: " + numOfObjects 
         + "\nTotal Surface Area: " + totalSurfaceArea + " square units"
         + "\nTotal Volume: " + totalVolume + " cubic units"
         + "\nAverage Surface Area: " + averageSurfaceArea + " square units"
         + "\nAverage Volume: " + averageVolume + " cubic units";
    
      return output;
   }

/**
* Getter method for the array.
* @return array of Triangular Prism objects.
*/
   public TriangularPrism[] getList() {
      return prisms;
   }
   
   /**
   * Adds a triangular prism object to the array.
   * @param labelIn is label of type String.
   * @param edgeIn is edge value of type double.
   * @param heightIn is height value of type double.
   */
   public void addTriangularPrism(String labelIn, double edgeIn, 
      double heightIn) {
      TriangularPrism t = new TriangularPrism(labelIn, edgeIn, heightIn);
      prisms[numOfObjects] = t;
      numOfObjects++;
   }
   
   /**
   * Finds the TriangluarPrism object in the array when given label.
   * @param labelIn is label of type String.
   * @return TriangularPrism object if it was found, null if it is 
   * not in the array.
   */
   public TriangularPrism findTriangularPrism(String labelIn) {
      for (int i = 0; i < numOfObjects; i++) {
         if (prisms[i].getLabel().equalsIgnoreCase(labelIn)) {
            return prisms[i];
         }
      }
      return null;
   }
   
   /**
   * Deletes a triangular prism when given the label.
   * @param labelIn is label of type String.
   * @return the object if it was found and deleted, returns
   * null if it was not found.
   */
   public TriangularPrism deleteTriangularPrism(String labelIn) {
      for (int i = 0; i < numOfObjects; i++) {
         if (prisms[i].getLabel().equalsIgnoreCase(labelIn)) {
            TriangularPrism temp = prisms[i];
            for (int j = i; j < numOfObjects - 1; j++) {
               prisms[j] = prisms[j + 1];
            }
            prisms[numOfObjects - 1] = null;
            numOfObjects--;
            return temp;
         }
      }
      return null; 
   }

/**
* Edits a triangular prism's edge and height values in the array.
* @param labelIn is label of type String.
* @param edgeIn is edge value of type double.
* @param heightIn is height value of type double.
* @return true if the prism was successfully edited, false if it
* was not.
*/
   public boolean editTriangularPrism(String labelIn, double edgeIn, 
      double heightIn) {
      for (int i = 0; i < numOfObjects; i++) {
         if (prisms[i].getLabel().equalsIgnoreCase(labelIn)) {
            //prisms[i].setLabel(labelIn);
            prisms[i].setEdge(edgeIn);
            prisms[i].setHeight(heightIn);
            return true;
         }
      }
      return false;
   }

/**
* Finds the triangular prism with the largest volume in the array.
* @return the prism with the largest volume.
*/
   public TriangularPrism findTriangularPrismWithLargestVolume() {
      TriangularPrism temp = new TriangularPrism("", 0.0, 0.0);
      if (numOfObjects <= 0) {
         return null;
      }
   
      for (int i = 0; i < numOfObjects; i++) {
         if (temp.volume() < prisms[i].volume()) {
            temp = prisms[i];
         }
      }
      return temp;
   }
}