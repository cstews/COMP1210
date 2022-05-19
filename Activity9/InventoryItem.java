/**
* Class that represents an inventory
* for items in a store.
*
* Activity 9
* @author Courtney Stewart COMP1210-D01
* @version 11/2/2021
*/
public class InventoryItem {

// variables
   protected String name;
   protected double price;
   private static double taxRate;

// constructor
/**
* Constructor for Inventory Item.
* @param nameIn is name of item of type string.
* @param priceIn is price of item of type double.
*/
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }


// methods
/**
* Getter method for name of item.
* @return pridcut name.
*/
   public String getName() {
      return name;
   }

/**
* Calculates the cost of the item with the 
* tax rate included.
* @return price with tax rate included.
*/
   public double calculateCost() {
      return price * (1 + taxRate);
   }

/**
* Setter method for the tax rate.
* @param taxRateIn is the tax rate of type double.
*/
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
   * Creates a string of the name of the product
   * along with its price with tax included.
   * @return product information.
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }

}
