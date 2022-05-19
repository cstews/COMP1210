/**
* Class that keeps track of word count for an
* OnlineTextItem, is an extension of InventoryItem class
* and OnlineTextItemClass.
*
* Activity 9
* @author Courtney Stewart COMP1210-D01
* @version 11/2/2021
*/
public class OnlineArticle extends OnlineTextItem {

// variable
   private int wordCount;

// constructor
/**
* Constructor for OnlineArticle item.
* @param nameIn is inherited from InventoryItem class.
* @param priceIn is inherited from InventoyItem class.
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

/**
* Setter method for word count.
* @param wordCountIn is word count of OnlineTextItem.
*/
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }

}