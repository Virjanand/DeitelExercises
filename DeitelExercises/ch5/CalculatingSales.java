// CalculatingSales.java
// Answer to exercise 5.17 from Deitel How to program Java
// Calculate total retail value of all products sold
import java.util.Scanner;

public class CalculatingSales
{
   // Initialize variables
   double totalRetailValue; // initialize totalRetailValue
   double priceProduct1 = 2.98;
   double priceProduct2 = 4.50;
   double priceProduct3 = 9.98;
   double priceProduct4 = 4.49;
   double priceProduct5 = 6.87;

   // prompt user to input product numbers and quantities use ctrl-z to quit
   public void displayPrompt()
   {
      System.out.println( "Input product number and quantity sold.\n" +
          " To quit input type the end-of-file indicator: \n" +
          " On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter,\n" +
          " on Windows type <Ctrl> z then press Enter.\n" );
   } // end method displayPrompt

   // Input product numbers and quantity sold
   public void inputSoldProducts()
   {
      Scanner input = new Scanner( System.in ); // initialize scanner
      int productNumber; // declare productNumber
      int quantitySold; // declare quantitySold
      double productPrice; // declare productPrice

      // while productNumber is input
      while ( input.hasNext() )
      {
         // input productNumber
         productNumber = input.nextInt();
         // prompt quantity
         System.out.print( "How many were sold: " );
         // input quantity
         quantitySold = input.nextInt();
         // get product price
         productPrice = getProductPrice( productNumber );
         // calculate total retail value
         totalRetailValue += quantitySold * productPrice; // add to running total
      } // end while
   } // end method inputSoldProducts

   private double getProductPrice( int productNumber )
   {
      switch ( productNumber )
      {
         case 1:
            return priceProduct1;
         case 2:
            return priceProduct2;
         case 3:
            return priceProduct3;
         case 4:
            return priceProduct4;
         case 5:
            return priceProduct5;
         default:
            System.out.println( "Not a valid product number!" );
            return 0;
      } // end switch
   } // end method getProductPrice

   // Display total retail value
   public void displayTotalRetailValue()
   {
      System.out.printf( "The total retail value is: %.2f\n", totalRetailValue );
   } // end method displayTotalRetailValue
} // end class CalculatingSales
