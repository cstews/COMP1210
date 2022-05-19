import java.util.Scanner;
import java.util.ArrayList;
/**
* Main method for Temperatures program.
*
* Activity 6
* @author Courtney Stewart COMP1210-D01
* @version 9/28/2021
*/
public class TemperatureInfo {
/**
* Scans in a list of temperatures and provides options for
* stating lowest and highest values.
* @param args not used.
*/
   public static void main(String[] args) {
   
   // variables
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
   
   // Instructs user to input temperature values
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
      
      //menu choice
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
         
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
         
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}