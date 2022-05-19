/**
* Class that extends OnlineTextitem that
* holds author name.
*
* Activity 10
* @author Courtney Stewart COMP1210-D01
* @version 11/9/2021
*/
public class OnlineBook extends OnlineTextItem {

// variable
   protected String author;

// constructor 
/**
* Constructor for OnlineBook item.
* @param nameIn is inherited from InventoryItem class.
* @param priceIn is inherited from InventoryItem class.
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

// methods
/**
* Setter method for author's name.
* @param authorIn is author name of type String.
*/
   public void setAuthor(String authorIn) {
      author = authorIn;
   }

/**
* Overrides the toString method of OnlineTextItem.
* @return name of book, author's name, and calculated cost.
*/
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }

}