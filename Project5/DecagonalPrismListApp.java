import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
* Simple program that reads and print input files.
* 
* Project 5
* @author Courtney Stewart COMP1210-D01
* @version 9/24/2021
*/

public class DecagonalPrismListApp {

/**
* Creates ArrayList for info from fioe to be stored in.
* Prints file info. 
*
* @param args is not used.
* @throws IOException from scanning input file.
*/
   public static void main(String[] args) throws IOException {
      ArrayList<DecagonalPrism> myList = new ArrayList<DecagonalPrism>();
      String listName = "";
      String name1 = "";
      double edge1 = 0.0;
      double height1 = 0.0;
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         name1 = scanFile.nextLine();
         edge1 = Double.parseDouble(scanFile.nextLine());
         height1 = Double.parseDouble(scanFile.nextLine());
      
         DecagonalPrism prism1 = new DecagonalPrism(name1, edge1, height1);
         myList.add(prism1);
      
      }
      
      DecagonalPrismList myPrismList = new DecagonalPrismList(listName, myList);
      System.out.println("\n" + myPrismList);
      System.out.println(myPrismList.summaryInfo());
      
   }
}