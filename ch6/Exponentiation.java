// Exercise 6.14: Exponentiation.java
// Read integer values for base and exponent to calculate exponent
import java.util.Scanner;

public class Exponentiation
{
   public static void main( String[] args )
   {
      // initialize input scanner
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter base: " );

      while ( input.hasNext() )
      {
         // input base
         int base = input.nextInt();

         // input exponent
         System.out.print( "Enter exponent: " );
         int exponent = input.nextInt();
         
         int result = integerPower( base, exponent );

         System.out.printf( "%d to the power of %d is %d.\n",
               base, exponent, result );
         
         System.out.print( "Enter base: " );
      } // end while
   } // end main

   private static int integerPower( int base, int exponent )
   {
      int result = 1;

      while ( exponent > 0 )
      {
         result *= base;
         exponent--;
      } // end while

      return result;
   } // end method integerPower
} // end class Exponentiation
