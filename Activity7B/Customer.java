/**
* Simple program to store and edit customer information.
*
* Activity 7B
* @author Courtney Stewart COMP1210-D01
* @version 10/19/2021
*/

public class Customer implements Comparable<Customer> {

// instance variables
   private String name;
   private String location;
   private double balance;

// constructor
/**
* Constructor for Customer object.
* @param nameIn is name of customer.
*/
   public Customer(String nameIn) {
      name = nameIn; // sets name to parameter input
      location = ""; // sets location to empty string
      balance = 0; // sets balance to 0
   }

// methods

/**
* Setter method that sets location of customer.
* @param locationIn is location of customer.
*/
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * Changes the balance of customer by either adding
   * or subtracting amount.
   * @param amount is amount added or taken from account.
   */
   public void changeBalance(double amount) {
      balance += amount;
   }

/**
* Getter method for location of customer.
* @return returns location name.
*/
   public String getLocation() {
      return location;
   }

/**
* Getter method for customer's balance.
* @return returns balance of account.
*/
   public double getBalance() {
      return balance;
   }
   
   /**
   * Another method for setting location if provided the
   * city name and state.
   * @param city is city name.
   * @param state is state name.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

/**
* Creates string output of customer's information 
* (their name, location, and account balance).
* @return returns the customer's information
*/
   public String toString() {
      String output = "";
      output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
   /**
   * Allows comparison of another customer object.
   * @param obj must be customer object.
   * @return 0 if the objects are equal,
   * -1 if the balance of the original customer is 
   * less than the one being compared to, and
   * 1 if the balance of the original customer is
   * more than the one being compared to.
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; // consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; // should return a negative number
      }
      else {
         return 1; // should return a positive number
      }
   }

}