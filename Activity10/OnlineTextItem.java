/**
* Class that extends InventoryItem class, represents
* an online text that a user can buy.
*
* Activity 10
* @author Courtney Stewart COMP1210-D01
* @version 11/9/2021
*/
public abstract class OnlineTextItem extends InventoryItem {

// constructor 
/**
* Constructor for OnlineTextItem.
* @param nameIn is inherited from Inventory Item class.
* @param priceIn is inherited from Inventory Item class.
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

// method
/**
* Overrides the calculateCost method in InventoryItem class.
* @return price of tpe double.
*/
   public double calculateCost() {
      return price;
   }

}