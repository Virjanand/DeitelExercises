// InterestInt.java
// Answer to exercise 5.18 from Deitel How to program Java
// Calculate interest by using only integers

public class InterestInt
{
   public static void main( String[] args )
   {
      int amountInPennies = 100000; // amount on deposit at end of each year
      int principalInPennies = 100000; // initial amount before interest
      int rate = 5; // interest rate

      // display headers
      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      // calculate amount on deposit for each of ten years
      for ( int year = 1; year <= 10; year++ )
      {
         // calculate new amount for specified year
         amountInPennies += amountInPennies / 100 * rate;

         // display the year and the amount
         System.out.printf( "%4d%20d.%02d\n", year, amountInPennies / 100, amountInPennies % 100 );
     } // end for
   } // end main
} // end class InterestInt
