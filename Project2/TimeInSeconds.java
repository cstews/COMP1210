import java.util.Scanner;
/** Simple program to state the time in
* seconds into days, hours, and minutes.
* 
* Project 2
* @author Courtney Stewart-COMP1210-D01
* @version 9/3/2021
*/

public class TimeInSeconds {
/** After giving time in seconds, program
* will return time sorted into days, hours,
* and minutes.
*
* @param args Command line arguments (not used)
*/
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int rawSeconds = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
   
   //Prompts user for time in seconds
      System.out.print("Enter the raw time in seconds: ");
      rawSeconds = userInput.nextInt();
      
   //Calculations
      days = rawSeconds / 86400;
      hours = (rawSeconds % 86400) / 3600;
      minutes = ((rawSeconds % 86400) % 3600) / 60;
      seconds = (((rawSeconds % 86400) % 3600) % 60) % 60;
      
   
      if (seconds < 0) {
         System.out.println("*** Time must be non-negative. ***");
      }
      
      else {
         System.out.println(" ");
      
         System.out.println("Time by combined days, hours, minutes, seconds:");
         
         System.out.println("\tdays: " + days);
         
         System.out.println("\thours: " + hours);
         
         System.out.println("\tminutes: " + minutes);
         
         System.out.println("\tseconds: " + seconds);
         
         System.out.println(" ");
         
         //Prints final sentence
         System.out.print(rawSeconds + " seconds = ");
         System.out.print(days + " days, ");
         System.out.print(hours + " hours, ");
         System.out.print(minutes + " minutes, ");
         System.out.print(seconds + " seconds");
         System.out.println(" ");
      }
   }
}