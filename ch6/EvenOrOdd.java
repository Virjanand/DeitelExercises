// Exercise 6.17: EvenOrOdd.java
// Determine if input numbers are even or odd
import java.util.Scanner;

public class EvenOrOdd
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Input number: " );

      while ( input.hasNext() )
      {
         int number = input.nextInt();

         if ( isEven( number ) )
            System.out.printf( "%d is even.\n", number );
         else
            System.out.printf( "%d is odd.\n", number );

         System.out.print( "Input number: " );
      } // end while
   } // end main

   private static boolean isEven( int number )
   {
      return number % 2 == 0;
   } // end method isEven
} // end class EvenOrOdd
