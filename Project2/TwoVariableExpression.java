import java.util.Scanner;
/** Program to solve a 
* two variable expression.
*
* Project 2
* @author Courtney Stewart-COMP1210-D01
* @version 9/3/2021
*/

public class TwoVariableExpression {

/** Will solve a two variable expression when
* given x and y inputs.
* 
* @param args Command line arguments (not used).
*/

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0.0;
      double y = 0.0;
      double answer = 0.0;
   
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy ");
   
   // Prompts user for x value
      System.out.print("\tx = ");
      x = userInput.nextDouble();
   
   // Prompts user for y value
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
   
      answer = ((4.5 * x + 12.5) * (3 * y - 9.0)) / (x * y);
   
      if (x * y == 0) {
         System.out.println("result is \"undefined\"");
      }
      else {
         answer = ((4.5 * x + 12.5) * (3 * y - 9.0))  / (x * y);
         System.out.println("result = " + answer);
      }
   }
}