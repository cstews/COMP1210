/**
* Program that creates two instances 
* of user info.
* 
* Activity 4
* @author Courtney Stewart COMP1210-D01
* @version 9/14/2021
*/
public class UserInfoDriver {

/**
* Prints information for 2 distinct users.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
      
   }
}