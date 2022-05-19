import java.util.Scanner;
import java.text.DecimalFormat;

/** Program to solve an
* a given equation when given
* an x value.
* 
* Project 3
* @author Courtney Stewart
* @version 9/10/2021
*/

public class UsingMathMethods {

/** Solves the equation 
* 8x^4 + sqrt(abs val(4x^3 + 4x^2 + 4x +4))
* /(4 + abs val(x)) .

* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
   
   //Initializes variables
      Scanner userInput = new Scanner(System.in);
      double x = 0.0;
      double result = 0.0;
   
   
   //Asks for x value
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
   
   //Calculations
      result = ((8 * Math.pow(x, 4)) + (Math.sqrt(Math.abs((4 * (Math.pow(x, 3)
         + Math.pow(x, 2) + x + 1)))))) / (4 + Math.abs(x));
      String resultString = Double.toString(result);
         
      System.out.println("Result: " + result);
      
   
   //Get information about result
      int integerPlaces = resultString.indexOf(".");
      int numbersLeft = integerPlaces;
      int numbersRight = resultString.length() - integerPlaces - 1;
      
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
   
      System.out.println("# of characters to left of decimal point: "
         + numbersLeft);
      System.out.println("# of characters to right of decimal point: "
         + numbersRight);
      System.out.println("Formatted Result: " + fmt.format(result));
   
   }
}