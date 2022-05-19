/** Program that stores user
* info.
*
* Activity 4
* @author Courtney Stewart COMP1210-D01
* @version 9/14/2021
*/
public class UserInfo {

// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

// constructor
/** 
* Initializes values for the methods to be used.
* @param firstNameIn first name of user.
* @param lastNameIn last name of user.
*/
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

// methods
   /** 
   * Prints the output the user provides.
   * @return prints output.
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   
   /**
   * Sets location of user.
   * @param locationIn is city of user.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * Sets the age for the user.
   * @param ageIn must be integer.
   * @return sets the age in ageIn.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * Returns the age of user.
   * @return prints the int stores in age.
   */
   public int getAge() {
      return age;
   }
   
   /**
   * Returns location of the user.
   * @return gives city of user.
   */
   public String getLocation() {
      return location;
   }
   
   /**
   * Initializes offline status.
   */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
   * Initializes online status.
   */
   public void logOn() {
      status = ONLINE;
   }

}