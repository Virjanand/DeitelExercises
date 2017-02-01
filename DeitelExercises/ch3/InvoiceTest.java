// InvoiceTest.java
// Answer to exercise 3.13 from Deitel How to program Java
import java.util.Scanner;

public class InvoiceTest
{
   public static void main( String[] args )
   {
      System.out.println( "Let's create an invoice" );
      System.out.println();

      Scanner input = new Scanner( System.in );

      System.out.print( "Part number: " );
      String partNumber = input.nextLine();
      
      System.out.print( "Part description: " );
      String partDescription = input.nextLine();

      System.out.print( "Quantity: " );
      int quantity = input.nextInt();

      System.out.print( "Price per item: " );
      double price = input.nextDouble();

      Invoice myInvoice = new Invoice( partNumber, partDescription,
	 quantity, price );

      System.out.printf( "The total price is: %.2f.",
         myInvoice.getInvoiceAmount() );
   }
}
