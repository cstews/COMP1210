import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/** Program to decode ticket.
*
* Project 3
* @author Courtney Stewart
* @version 9/10/2021
*/

public class MoonTrip {

/** Decodes ticket information by printing
* date, time, price, discount, seat, and
* description of the ticket.
*
* @param args Command line arguments (not used).
*/ 

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
   
      //Asks for ticket number.
      System.out.print("Enter ticket code: ");
      String ticket = userInput.nextLine();
      System.out.println("");
      
      //Initializing variables.
      double price;
      double discount;
      double cost;
      double prize;
      String hours;
      String minutes;
      String month;
      String day;
      String year;
      String seat;
      String description;
      
      
      DecimalFormat style1 = new DecimalFormat("$#,##0.00");
      DecimalFormat style2 = new DecimalFormat("00");
      DecimalFormat style3 = new DecimalFormat("00000");
      
     //Decoding.
      if (ticket.length() < 27) {
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least " 
            + "27 characters.");
         System.out.println(" ");
      }
      
      else {
         ticket = ticket.trim();
      
         month = ticket.substring(0, 2);
         day = ticket.substring(2, 4);
         year = ticket.substring(4, 8);
      
         hours = ticket.substring(8, 10);
         minutes = ticket.substring(10, 12);
      
         price = Double.parseDouble(ticket.substring(12, 21 - 2));
         discount = Double.parseDouble(ticket.substring(21, 23));
         double discountDisplay = discount / 100;
         double discountActual = 1 - (discount / 100);
         seat = ticket.substring(23, 26);
         description = ticket.substring(26, 55);
      
      //Calculates cost.
         cost = price * discountActual;
      
      //Generates random prize number.
         Random win = new Random();
         prize = win.nextInt(99999) + 1;
      
      //Prints information.
         System.out.println("Ticket: " + description + "   Date: "
            + month + "/" + day + "/" + year + "   Time: " + hours 
            + ":" + minutes);
         System.out.println("Seat: " + seat + "   Price: " 
            + style1.format(price) + "   Discount: " + style2.format(discount)
            + "%" + "   Cost: " + style1.format(cost));
         System.out.println("Prize Number: " + style3.format(prize));
      }
      
      
   
   
   }
}