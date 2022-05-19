/**
* Class that holds an array of numbers 
* and methods that allow user to interact
* with Scores class.
*
* Activity 8
* @author Courtney Stewart COMP1210-D01
* @version 10/26/2021
*/

public class Scores {

// instance variable
   private int[] numbers;

// constructor

/**
* Constructor for Scores class.
* @param numbersIn is an array with int values.
*/
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   
   }

// methods

/**
* Method that determines the amount of even numbers 
* in the ArrayList and prints them.
* @return returns the even numbers in the ArrayList.
*/
   public int[] findEvens() {
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
   
      int[] evens = new int[numberEvens];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
   
      return evens;
   }
   
   /**
   * Method that determines the amount of odd numbers 
   * in the ArrayList and prints them.
   * @return returns the odd numbers in the ArrayList.
   */
   public int[] findOdds() {
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
   
      int[] odds = new int[numberOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
   
      return odds;
   }

/**
* Calculates the average of all of the numbers in 
* the ArrayList.
* @return returns the average of type double.
*/
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      double sums = sum;
      
      return sums / numbers.length;
   
   }

/**
* Prints the numbers in the ArrayList.
* @return returns a String of the printed numbers of the list.
*/
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }

/**
* Prints the numbers of the ArrayList in the reverse
* order of what they were initially.
* @return returns the String of the reverse order of the numbers.
*/
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }

}