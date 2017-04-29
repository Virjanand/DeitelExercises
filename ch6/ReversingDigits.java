// Exercise 6.26: ReversingDigits.java
// Reverse digits of an input number
import java.util.Scanner;

public class ReversingDigits
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.printf( "Enter number between 1 and 99999: " );
      int number = input.nextInt();

      displayReverseNumber( number );

   } // end main

   private static void displayReverseNumber( int number )
   {
      int denominator = 10;

      System.out.println();

      while ( number > 0 )
      {
         int quotient = SeparatingDigits.calculateQuotient( number,
              denominator );
         int remainder = SeparatingDigits.calculateRemainder( number, 
              denominator );
         number = quotient;
         System.out.printf( "%d  ", remainder );
      }
   } // end method reverseNumber
} // end class ReversingDigits
