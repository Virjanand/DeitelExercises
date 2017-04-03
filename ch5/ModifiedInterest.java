// ModifiedInterest.java
// Answer to exercise 5.14 from Deitel How to program Java
// Compound-interest calculations for different interest rates

public class ModifiedInterest
{
   public static void main( String[] args )
   {
      double amount; // amount on deposit at end of each year
      double principal = 1000.0; // initial amount before interest
      double rate; // interest rate

      for ( int counter = 5; counter <= 10; counter++ )
      {
         rate = 0.01 * counter;

         System.out.printf( "Showing amount for interest rate %.2f\n",
            rate );
         // display headers
         System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

         // calculate amount on deposit for each of ten years
         for ( int year = 1; year <= 10; year++ )
         {
            // calculate new amount for specified year
            amount = principal * Math.pow( 1.0 + rate, year );

            // display the year and the amount
            System.out.printf( "%4d%,20.2f\n", year, amount );
         } // end inner for
      } // end outer for
   } // end main
} // end class ModifiedInterest
