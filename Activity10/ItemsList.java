/**
* Class that holds an array of Inventory
* Item objects and keeps count of how many
* are in the array.
*
* Activity 10
* @author Courtney Stewart COMP1210-D01
* @version 11/9/2021
*/

public class ItemsList {

// variables
   private InventoryItem[] inventory;
   private int count;


// constructor
/**
* Constructor for ItemsList object.
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }


// methods
/**
* Method to add an inventory item to the inventory array.
* @param itemIn is the inventory item.
*/
   public void addItem(InventoryItem itemIn) {
      if (count < inventory.length) {
         inventory[count++] = itemIn;
      }
   }

/**
* Calculates the total for all of the items, adding a surcharge to
* the item if it is an electronics item.
* @param electronicsSurcharge is a predetermined surcharge for the item.
* @return the total of all of the items.
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      
      }
      return total;
   
   }

/**
* toString method that prints out all of the items
* in the inventory.
* @return a summary of the inventory items.
*/
   public String toString() {
      String output = "All inventory: \n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }

}