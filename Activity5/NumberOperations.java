/**
* Simple program that performs operations 
* on a number.
* 
* Activity 4
* @author Courtney Stewart COMP1210-D01
* @version 9/21/2021
*/
public class NumberOperations {
   private int number;

/**
* Sets paramenter for number.
* @param numberIn must be integer type.
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

/**
* Returns the number.
* @return returns number.
*/
   public int getValue() {
      return number;
   }

/**
* Determines the odd numbers less than input.
* @return returns the odd numbers.
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

/**
* Determines the even numbers less than input.
* @return returns even nubers.
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get the next power of 2
      }
      return output;
   }
   
  /**
  * Determins if a number is less than, greater than,
  * or equal to the first integer.
  * @param compareNumber must be int.
  * @return gives answer.
  */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns number to string.
   * @return returns number.
   */
   public String toString() {
      return number + "";
   }

}