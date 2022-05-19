/**
* Program to determine information about bank loans.
* 
* Activity 7A
* @author Courtney Stewart
* @version 10/12/2021
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   //initialize loansCreated variable
   private static int loansCreated = 0;

/**
* Constructor for a BankLoan using the customer's name and
* their interest rate. 
* @param customerNameIn is input for the customer's name.
* @param interestRateIn is input for interest rate.
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
* Method for determining the balance after borrowing 
* from bank.
* @param amount is input for amount in account
* @return returns true if a loan was made, fale if not.
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
* Method for changing balance after amount was paid.
* @param amountPaid is user input for amount paid.
* @return returns the amount the customer must pay bank.
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * Getter method to retrieve balance.
   * @return returns the account balance.
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * Method to set the interest rate for an account.
   * @param interestRateIn is rate set for customer's account.
   * @return returns whether the rate was set or not.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * Getter method to get interest rate for account.
   * @return returns the rate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * Method to charge interest to an account.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * Method to determine if an amount is positive.
   * @param amount is input amount from customer.
   * @return returns the amount if it is greater than
   * or equal to zero.
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
   * Method to determine if customer is in debt.
   * @param loan input for BankLoan object.
   * @return returns whether customer is in debt or not.
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   * Getter method to get amount of loans created.
   * @return returns amount of loans created.
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * Method to reset amount of loans created. 
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   /**
   * Prints customer's name, interest rate, and balance.
   * @return returns customer's information
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
