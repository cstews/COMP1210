import java.io.FileNotFoundException;
/**
* Class with main method that creates an AirTicketProcessor,
* reads in the data file, and prints the three
* reports.
*
* Project 11
* @author Courtney Stewart COMP1210-D01
* @version 11/29/2021
*/
public class AirTicketApp {

/**
* Main method, reads in file name and prints out
* reports.
* @param args is file name.
*/
   public static void main(String[] args) {
   
      try {
         if (args.length == 0) {
            System.out.println("*** File name not provided by command " 
               + "line argument.");
            System.out.println("Program ending.");
         }
         
         else {
            AirTicketProcessor ticketProcessor = new AirTicketProcessor();
            ticketProcessor.readAirTicketFile(args[0]);
            System.out.print(ticketProcessor.generateReport());
            System.out.print(ticketProcessor.generateReportByFlightNum());
            System.out.print(ticketProcessor.generateReportByItinerary());
            System.out.print(ticketProcessor.generateReportForInvalidInput());
         }
      }
      
      catch (FileNotFoundException e) {
         System.out.print("*** File not found. \nProgram ending.");
      }
   }
}