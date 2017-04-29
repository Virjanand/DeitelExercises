// Exercise 6.18: SquareOfAsterisks.java
// Display solid square of input number size sides of asterisks
import java.util.Scanner;

public class SquareOfAsterisks
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter size of square: " );

      int sizeOfSide = input.nextInt();

      squareOfAsterisks( sizeOfSide );
   } // end main

   private static void squareOfAsterisks( int size )
   {
      System.out.println();

      for ( int x = 1; x <= size; x++ )
      {     
         for ( int y = 1; y <= size; y++ )
            System.out.print( "*" );

         System.out.print( "\n" );
      }
   } // end method squareOfAsterisks
} // end class SquareOfAsterisks
