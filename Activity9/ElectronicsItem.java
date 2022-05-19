/**
* Class that represents the electronic
* items in a store's inventory, inherits from
* InventoryItem class.
*
* Activity 9
* @author Courtney Stewart COMP1210-D01
* @version 11/2/2021
*/
public class ElectronicsItem extends InventoryItem {

// variables
   protected double weight;
   
   /** Shipping cost. */
   public static final double SHIPPING_COST = 1.5;

// constructor
/**
* Constructor for Electronics Item.
* @param nameIn is name inherited from Inventory Item class.
* @param priceIn is price inherited from Inventory Item class.
* @param weightIn is weight of item of type double.
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

/**
* Overrrides the calculateCost method for InventoryItem class
* by factoring in the weight of the item and the shipping cost.
* @return the cost of the item with tax and shipping cost included.
*/
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}