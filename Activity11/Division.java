/**
* Class that holds the methods for
* dividing numbers that will be used for
* DivisionDriver.
*
* Activity 11
* @author Courtney Stewart COMP1210-D01
* @version 11/16/2021
*/

public class Division {

/**
* Divides two integers and returns a whole number.
* @param numerator is the dividend.
* @param denominator is the divisor.
* @return quotient.
*/
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }

/**
* Divides two integers and returns a float value.
* @param num is the dividend.
* @param denom is the divisor.
* @return quotient with decimal values if applicable.
* @throws IllegalArgumentException if denominator is 0.
*/
   public static float decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      
      }
      
      return (float) num / denom;
   }

}