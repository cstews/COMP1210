import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
* Program to execute methods in DecagonalPrism
* and DecagonalPrismList.
*
* Project 6
* @author Courtney Stewart COMP1210-D01
* @version 10/1/2021
*/

public class DecagonalPrismListMenuApp {

/**
* Main method for DecagonaPrismListMenuApp.
* @param args not used.
* @throws IOException for scanning file.
*/
   public static void main(String[] args) throws IOException {
      Scanner userInput = new Scanner(System.in);
      //String myPrisms = "*** no list name assigned ***";
      String fileName = "";
      ArrayList<DecagonalPrism> myList = new ArrayList<DecagonalPrism>();
      DecagonalPrismList myPrisms = new DecagonalPrismList(fileName, myList);
      
      // Prints menu choices.
      System.out.println("DecagonalPrism List System Menu");
      System.out.println("R - Read File and Create DecagonalPrism List");
      System.out.println("P - Print DecagonalPrism List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add DecagonalPrism");
      System.out.println("D - Delete DecagonalPrism");
      System.out.println("F - Find DecagonalPrism");
      System.out.println("E - Edit DecagonalPrism");
      System.out.println("Q - Quit");
   
   
   // menu
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
      
         switch (choice) {
            case 'R': //invokes readFile method
               System.out.print("\tFile name: ");
               fileName = userInput.nextLine();
               myPrisms.readFile(fileName);
               System.out.println("\tFile read in and DecagonalPrism List" 
                  + " created\n");
               break;
         
            case 'P': //prints list
               System.out.println("\n" + myPrisms.toString());
               break;
         
            case 'S': //prints summary
               System.out.println("\n" + myPrisms.summaryInfo() + "\n");
               break;
               
            case 'A': //adds decagonal prism to list
               String newLabel = "";
               double newEdge = 0.0;
               double newHeight = 0.0;
            
               System.out.print("\tLabel: ");
               newLabel = userInput.nextLine();
            
               System.out.print("\tEdge: ");
               newEdge = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tHeight: ");
               newHeight = Double.parseDouble(userInput.nextLine());
               
               myPrisms.addDecagonalPrism(newLabel, newEdge, newHeight);
            
               System.out.println("\t*** DecagonalPrism added ***" + "\n");
               break;
            
            case 'D': //deletes decagonal prism from list
               String removeLabel = "";
            
               System.out.print("\tLabel: ");
               removeLabel = userInput.nextLine();
               //myPrisms.deleteDecagonalPrism(removeLabel);
               
               boolean isDeleted = myPrisms.deleteDecagonalPrism(removeLabel);
               myPrisms.deleteDecagonalPrism(removeLabel);
               
               if (isDeleted) {
                  System.out.println("\t" + "\"" + removeLabel + "\"" + " " 
                     + "deleted" + "\n");
               }      
               else {
                  System.out.println("\t" + "\"" + removeLabel
                     + "\"" + " not found");
               }
               break;
            
            case 'F': //finds decagonal prism
               String findLabel = "";
            
               System.out.print("\tLabel: ");
               findLabel = userInput.nextLine();
            
               System.out.println(myPrisms.findDecagonalPrism(findLabel));
            
               break;
               
            case 'E': //edits decagonal prism
               String editedLabel = "";
               double editedEdge = 0.0;
               double editedHeight = 0.0;
               
               System.out.print("\tLabel: ");
               editedLabel = userInput.nextLine();
               
               System.out.print("\tEdge: ");
               editedEdge = Double.parseDouble(userInput.nextLine());
               
               System.out.print("\tHeight: ");
               editedHeight = Double.parseDouble(userInput.nextLine());
               
               boolean isEdited = myPrisms.editDecagonalPrism(editedLabel,
                  editedEdge, editedHeight);
               if (isEdited) {
                  System.out.println("\"" + editedLabel + "\"" + " " 
                      + "successfully edited" + "\n");
               }
               else {
                  System.out.println("\t" + "\"" + editedLabel + "\"" 
                     + " not found");
               }
               
               break;
            
            case 'Q': //quits program
               break;
            
            default: 
               System.out.println("\t*** invalid choice ***" + "\n");
         
         }
      } while (choice != 'Q');
   }
}