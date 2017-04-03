// Invoice.java
// Answer to exercise 3.13 from Deitel How to program Java

public class Invoice
{
   private String partNumber;
   private String partDescription;
   private int quantityPurchased;
   private double pricePerItem;

   public Invoice(String number, String description,
      int quantity, double price)
   {
      partNumber = number;
      partDescription = description;
      if ( quantity > 0 )
         quantityPurchased = quantity;
      if ( price > 0.0 )
         pricePerItem = price;
   }

   public void setPartNumber( String number )
   {
      partNumber = number;
   }

   public String getPartNumber()
   {
      return partNumber;
   }

   public void setPartDescription( String description )
   {
      partDescription = description;
   }

   public String getPartDescription()
   {
      return partDescription;
   }

   public void setQuantityPurchased( int quantity )
   {
      quantityPurchased = quantity;
   }

   public int getQuantityPurchased()
   {
      return quantityPurchased;
   }

   public void setPricePerItem( double price )
   {
      pricePerItem = price;
   }

   public double getPricePerItem()
   {
      return pricePerItem;
   }

   public double getInvoiceAmount()
   {
      return quantityPurchased * pricePerItem;
   }

} // end class Invoice
