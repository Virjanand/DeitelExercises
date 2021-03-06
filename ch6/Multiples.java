// Exercise 6.16: Multiples.java
// Determine if the second input integer is a multiple of the first
import java.util.Scanner;

public class Multiples
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter number 1: " );

      while ( input.hasNext() )
      {
         int number1 = input.nextInt();

         System.out.print( "Enter number 2: " );
         int number2 = input.nextInt();

         boolean isMultiple = isMultiple( number1, number2 );

         if ( isMultiple )
            System.out.printf( "%d is a multiple of %d\n",
                  number2, number1 );
         else
            System.out.printf( "%d is NOT a multiple of %d\n",
                  number2, number1 );

         System.out.print( "Enter number 1: " );
      } // end while
   } // end main

   private static boolean isMultiple( int number1, int number2 )
   {
      return number2 % number1 == 0;
   } // end method isMultiple
} // end class Multiples
