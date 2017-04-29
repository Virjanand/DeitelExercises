// Exercise 6.21: SeparatingDigits.java
// Separate digits of input number by two spaces

public class SeparatingDigits
{
   public static int calculateQuotient( int numerator, int denominator )
   {
      return numerator / denominator;
   } // end method calculateQuotient

   public static int calculateRemainder( int numerator, int denominator )
   {
      return numerator % denominator;
   } // end method calculateRemainder

   public static void displayDigits( int number )
   {
      int denominator = 10000;

      System.out.println();

      while ( denominator >= 1 )
      {
         if ( number >= denominator )
         {
            int quotient = calculateQuotient( number, denominator );
            int remainder = calculateRemainder( number, denominator );
            number = remainder;
            System.out.printf( "%d  ", quotient );
         }
         denominator /= 10;
      } // end while
   } // end method displayDigits
} // end class SeparatingDigits
