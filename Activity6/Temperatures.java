import java.util.ArrayList;
/**
* A simple program to tell information
* about daily temperature values.
*
* Activity 6
* @author Courtney Stewart COMP1210-D01
* @version 9/28/2021
*/
public class Temperatures {
   // variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   // constructors
   /**
   * Calls on ArrayList for temperature values.
   * @param temperaturesIn must be an integer.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
   * Finds the lowest temperature.
   * @return returns 0 if the list is empty, 
   *  returns the low value if list is not empty.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < low; i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

/** 
* Finds the highest temperature value.
* @return returns 0 if the list is empty,
*    returns the high value if list is not empty.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }

/**
* Finds out if the input value is lower than the minimum.
* @param lowIn must be integer.
* @return returns lowest value.
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * Finds out if the input value is higher than the maximum.
   * @param highIn must be integer.
   * @return returns the highest value.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
  
  /**
  * Converts the int values to a string.
  * @return returns a statement of the lowest and highest temperatures.
  */ 
   public String toString() {
      return "\tTemperatures : " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

}