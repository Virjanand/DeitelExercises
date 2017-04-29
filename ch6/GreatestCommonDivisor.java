// Exercise 6.27: GreatestCommonDivisor.java
// Read two integers and determine greatest common divisor
import java.util.Scanner;

public class GreatestCommonDivisor
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter number 1: " );
      int number1 = input.nextInt();

      System.out.print( "Enter number 2: " );
      int number2 = input.nextInt();

      int greatestCommonDivisor = gcd( number1, number2 );

      System.out.printf( "Greatest common divisor: %d",
            greatestCommonDivisor );
   } // end main

   // using Euclids algorithm to calculate the gcd
   private static int gcd( int number1, int number2 )
   {
      int largerNumber, smallerNumber;

      // determine the largest and smallest number
      if ( number1 > number2 )
      {
         largerNumber = number1;
         smallerNumber = number2;
      }
      else
      {
         largerNumber = number2;
         smallerNumber = number1;
      }

      while ( smallerNumber > 0 )
      {
         int remainder = SeparatingDigits.calculateRemainder( largerNumber,
               smallerNumber );
         
         largerNumber = smallerNumber;    
         smallerNumber = remainder; 

      } // end while

      return largerNumber;
   } // end method gcd
} // end class GreatestCommonDivisor
