/**
* Driver program for InventoryItem class, ElectronicsItem
* class, OnlineTestItem class, OnlineArtice class, and 
* OnlineBook class.
*
* Activity 9
* @author Courtney Stewart COMP1210-D01
* @version 11/2/2021
*/
public class InventoryApp {

/**
* Main method for InventoryApp.
* @param args not used.
*/
   public static void main(String[] args) {
   
      InventoryItem.setTaxRate(0.05);
   
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.5);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1.toString());
      System.out.println(item2.toString());
      System.out.println(item3.toString());
      System.out.println(item4.toString());
   
   }

}