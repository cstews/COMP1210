import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

/**
* Class with methods for reading in a data
* file and generatign reports.
*
* Project 11
* @author Courtney Stewart COMP1210-D01
* @version 11/29/2021
*/
public class AirTicketProcessor {

// fields
   private AirTicket[] tickets;
   
   // will be used for Project 11
   private String[] invalidRecords;

// constructor
/**
* Constructor for AirTicketProcessor.
*/
   public AirTicketProcessor() {
   
      tickets = new AirTicket[0];
   
      invalidRecords = new String[0];
      
   }

//methods
/**
* Method that reads in a file, scans through each line
* and creates the corresponding ticket type, and adds the
* ticket type to the tickets array.
* @param fileName is name of file of tickets.
* @throws FileNotFoundException if file isn't found.
*/
   public void readAirTicketFile(String fileName) 
      throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileName));
      //category = scanFile.nextLine();
      //scan.useDelimiter(",");
      
      while (scanFile.hasNext()) {
         String lines = scanFile.nextLine();
         Scanner scan = new Scanner(lines);
         scan.useDelimiter(",");
         
         try {
            String category = scan.next();
            String flightNum = scan.next();
            String fromCity = scan.next();
            String toCity = scan.next();
            String depDateTime = scan.next();
            String arrDateTime = scan.next();
            int miles = Integer.parseInt(scan.next());
            double basePrice = Double.parseDouble(scan.next());
            double fareAdjFactor = Double.parseDouble(scan.next());
         
            Itinerary itineraryIn = new Itinerary(fromCity, toCity, depDateTime,
               arrDateTime, miles);
         
            char type = category.charAt(0);
         
         
            switch (type) {
            // NonRefundable Ticket Type
               case 'N':
                  double disFactor = Double.parseDouble(scan.next());
                  NonRefundable nonRef = new NonRefundable(flightNum, 
                     itineraryIn, basePrice, fareAdjFactor, disFactor);
                  addAirTicket(nonRef);
                  break;
            
            // Economy Ticket Type
               case 'E':
                  Economy econ = new Economy(flightNum, itineraryIn, basePrice, 
                     fareAdjFactor);
                  addAirTicket(econ);
                  break;
            
            // Business Ticket Type
               case 'B':
                  double foodAndBev = Double.parseDouble(scan.next());
                  double entertainment = Double.parseDouble(scan.next());
               
                  Business bus = new Business(flightNum, itineraryIn, 
                     basePrice, fareAdjFactor, foodAndBev, entertainment);
                  addAirTicket(bus);
                  break;
            
            // Elite Ticket Type (also called First)
               case 'F':
                  double foodAndBevs = Double.parseDouble(scan.next());
                  double entertainments = Double.parseDouble(scan.next());
                  double commServices = Double.parseDouble(scan.next());
               
                  Elite elite = new Elite(flightNum, itineraryIn, basePrice, 
                     fareAdjFactor, foodAndBevs, entertainments, commServices);
               
                  addAirTicket(elite);
                  break;
               
            // If not valid category    
               default:
                  throw new InvalidCategoryException(category);
            
            }
         }
         catch (InvalidCategoryException e) {
            String invalidCategory = e + " in: " + lines;
            addInvalidRecord(invalidCategory);
         }
         
         catch (NumberFormatException e) {
            String invalidNum = e + " in: " + lines;
            addInvalidRecord(invalidNum);
         }
      
      }
   }

/**
* Adds an air ticket to the ticket array.
* @param ticketIn is an air ticket of varying types.
*/
   public void addAirTicket(AirTicket ticketIn) {
      tickets = Arrays.copyOf(tickets, tickets.length + 1);
      tickets[tickets.length - 1] = ticketIn;
   }
   
   /**
   * Adds a string that is invalid to the InvalidRecord
   * array.
   * @param invalidIn is the invalid record.
   */
   public void addInvalidRecord(String invalidIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, 
         invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidIn;
   }

/**
* Generates a report by printing the associated information
* with each air ticket in the AirTicket array in the original
* order from the file.
* @return report with information from each ticket in AirTicket array.
*/
   public String generateReport() {
      String output = "";
      for (int i = 0; i < tickets.length; i++) {
         output += tickets[i].toString() + "\n";
      }
      return "----------------------------"
         + "\nAir Ticket Report"
         + "\n----------------------------\n\n"
         + output;
   }

/**
* Generates a report by flight number.
* @return report with information for each ticket organized by
* increasing flight number.
*/
   public String generateReportByFlightNum() {
      String output = "";
      AirTicket[] ticketsCopy = Arrays.copyOf(tickets, tickets.length);
      Arrays.sort(ticketsCopy);
      for (AirTicket t : ticketsCopy) {
         output += t.toString() + "\n";
      }
      return "--------------------------------------"
         + "\nAir Ticket Report (by Flight Number)"
         + "\n--------------------------------------\n\n"
         + output;
   }
   
   /**
   * Generates a report by sorting by itinerary using the
   * ItineraryComparator class.
   * @return report with ticket information organized by itinerary.
   */
   public String generateReportByItinerary() {
      String output = "";
      AirTicket[] ticketsCopy = Arrays.copyOf(tickets, tickets.length);
      Arrays.sort(ticketsCopy, new ItineraryComparator());
      for (AirTicket t : ticketsCopy) {
         output += t.toString() + "\n";
      }
      return "--------------------------------------"
         + "\nAir Ticket Report (by Itinerary)"
         + "\n--------------------------------------\n\n"
         + output;
   }
   
   /**
   * Getter method for the array of air tickets.
   * @return AirTicket array.
   */
   public AirTicket[] getTickets() {
      return tickets;
   }
   
   /**
   * Getter method for the invalid input from file.
   * @return array containing the invalid input.
   */
   public String[] getInvalidInput() {
      return invalidRecords;
   }

/**
* Generates a report of the invalid inputs from the file.
* @return report of invalid inputs.
*/
   public String generateReportForInvalidInput() {
      String output = "";
      for (int i = 0; i < invalidRecords.length; i++) {
         output += invalidRecords[i].toString() + "\n";
      }
      return "--------------------------------------"
         + "\nAir Ticket Report for Invalid Input"
         + "\n--------------------------------------\n"
         + output;
   }

}