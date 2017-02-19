// SalesCommissionCalculator.java
// Answer to exercise 4.19 from Deitel How to Program Java
// Determine salesperson's earnings based on items sold
import java.util.Scanner;

public class SalesCommissionCalculator
{
   public static void main( String[] args )
   {
      // Initialize variables
      double baseSalery = 200.00; //    Initialize baseSalary to 200
      // Initialize commissionPercentage to 0.09
      double commissionPercentage = 0.09; 
      double totalCommission = 0; // Initialize totalCommission to 0
      double item1Price = 239.99; // Initialize item1Price to 239.99
      double item2Price = 129.75; // Initialize item2Price to 129.75
      double item3Price = 99.95; //  Initialize item3Price to 99.95
      double item4Price = 350.89; // Initialize item4Price to 350.89
      int counter = 1; // Initialize counter to 1
      int numberSold;

      Scanner input = new Scanner( System.in );
      // Input item's sold
      while ( counter <= 4 ) //    while counter is less than 4
      {
         // Prompt number of Item counter sold
         System.out.printf( "How many item %d were sold? ", counter );
         // Input number of Item counter sold
         numberSold = input.nextInt();
         if ( counter == 1)
            totalCommission += commissionPercentage * item1Price * numberSold;
         if ( counter == 2)
            totalCommission += commissionPercentage * item2Price * numberSold;
         if ( counter == 3)
            totalCommission += commissionPercentage * item3Price * numberSold;
         if ( counter == 4)
            totalCommission += commissionPercentage * item4Price * numberSold;
      counter++;
      }     
      // calculate earnings and display
      //    Calculate earnings
      double earnings = baseSalery + totalCommission;
      //    Display earnings
      System.out.printf( "Total salary: %.2f.\n", earnings );

   } // end method main
} // end class SalesCommissionCalculator
