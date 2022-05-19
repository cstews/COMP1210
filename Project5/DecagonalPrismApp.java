import java.util.Scanner;
/** Program to accompany
* Decagonal Prism that prints label,
* edge, and height.
*
* Modified so it actually works now lol.
* 
* Project 5
* @author Courtney Stewart COMP1210-D01
* @version 9/23/2021
*/

public class DecagonalPrismApp {

/**
* Prints information for the Decagonal Prism.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
   
   //Initiate values.
      Scanner userInput = new Scanner(System.in);
      String label;
      double edge = 0.0;
      double height = 0.0;
   
   
   
      System.out.println("Enter label, edge, and height for"
         + " a decagonal prism.");
   
   //code for label
      System.out.print("\t" + "label: ");
      label = userInput.nextLine();
   
   //code for edge
      System.out.print("\t" + "edge: ");
      edge = userInput.nextDouble();
      if (edge < 0) {
         label = "Bad edge value";
         System.out.println("Error: edge must be non-negative.");
         return;
      }
      else {
         String edgeString = Double.toString(edge);
      }
   
   //code for height
      System.out.print("\t" + "height: ");
      height = userInput.nextDouble();
      if (height < 0) {
         label = "Bad edge value";
         System.out.println("Error: height must be non-negative.");
         return;
      }
      else {
         String heightString = Double.toString(height);
      }
      DecagonalPrism output = new DecagonalPrism(label, edge, height);
      System.out.println(output);
      
   }
}