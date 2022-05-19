/**
* Class that stores trip data and provides
* methods for departure times, miles, and
* a toString method.
*
* Project 9
* @author Courtney Stewart COMP1201-D01
* @version 11/5/2021
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
* Setter method for departure airport name.
* @param fromAirportIn is name of departing airport.
*/
   // public void setFromAirport(String fromAirportIn) {
      // fromAirport = fromAirportIn;
   // }

/**
* Getter method for name of airport arriving to.
* @return arrival airport name.
*/
   // public String getToAirport() {
      // return toAirport;
   // }
   
/**
* Setter method for name of arrival airport.
* @param toAirportIn is name of arrival airport.
*/
   // public void setToAirport(String toAirportIn) {
      // toAirport = toAirportIn;
   // }
   
/**
* Getter method for departure date and time.
* @return departure date and time.
*/
   public String getDepDateTime() {
      return depDateTime;
   }
   
/**
* Setter method for departure date and time.
* @param depDateTimeIn is departure date and time.
*/
   // public void setDepDateTime(String depDateTimeIn) {
      // depDateTime = depDateTimeIn;
   // }
   
/**
* Getter method for arrival date and time.
* @return arrival date and time.
*/
   // public String getArrDateTime() {
      // return arrDateTime;
   // }
   
/**
* Setter method for arrival date and time.
* @param arrDateTimeIn is arrival date and time.
*/
   // public void setArrDateTime(String arrDateTimeIn) {
      // arrDateTime = arrDateTimeIn;
   // }
//    
/**
* Getter method for miles.
* @return miles traveled.
*/
   public int getMiles() {
      return miles;
   }
   
/**
* Setter method for miles.
* @param milesIn is miles traveled.
*/
   // public void setMiles(int milesIn) {
      // miles = milesIn;
   // }

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