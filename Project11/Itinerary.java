/**
* Class that stores trip data and provides
* methods for departure times, miles, and
* a toString method.
*
* Project 11
* @author Courtney Stewart COMP1201-D01
* @version 11/29/2021
*/
public class Itinerary {

// variables
   private String fromAirport;
   private String toAirport;
   private String depDateTime;
   private String arrDateTime;
   private int miles;

// constructor
/**
* Constructor for Itinerary class.
* @param fromAirportIn is the airport the plane departs from.
* @param toAirportIn is the airport the plane is arriving to.
* @param depDateTimeIn is the date and time the plane departs.
* @param arrDateTimeIn is the date and time the plane arrives.
* @param milesIn is the amount of miles the plane will fly.
*/
   public Itinerary(String fromAirportIn, String toAirportIn, 
         String depDateTimeIn, String arrDateTimeIn, int milesIn) {
         
      fromAirport = fromAirportIn;
      toAirport = toAirportIn;
      depDateTime = depDateTimeIn;
      arrDateTime = arrDateTimeIn;
      miles = milesIn;
   
   }

// methods
/**
* Getter method for departure airport name.
* @return name of airport departing from.
*/
   public String getFromAirport() {
      return fromAirport;
   }

   
/**
* Getter method for departure date and time.
* @return departure date and time.
*/
   public String getDepDateTime() {
      return depDateTime;
   }
      
/**
* Getter method for miles.
* @return miles traveled.
*/
   public int getMiles() {
      return miles;
   }
   

/**
* Creates string with information about trip.
* @return departing airport, arriving airport, departure date and time,
* arrival date and time, and amount of miles traveled.
*/
   public String toString() {
      return fromAirport + "-" + toAirport + " (" + depDateTime + " - "
         + arrDateTime + ") " + miles + " miles";
   }
}