// Exercise 6.19: SquareOfAnyCharacter.java
// Display solid square of input number size sides of input character
import java.util.Scanner;

public class SquareOfAnyCharacter
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter size of square: " );

      int sizeOfSide = input.nextInt();

      System.out.print( "Enter character: " );

      char fill = input.next().charAt( 0 );

      squareOfAnyCharacter( sizeOfSide, fill );
   } // end main

   private static void squareOfAnyCharacter( int size, char fill )
   {
      System.out.println();

      for ( int x = 1; x <= size; x++ )
      {     
         for ( int y = 1; y <= size; y++ )
            System.out.print( fill );

         System.out.print( "\n" );
      }
   } // end method squareOfAnyCharacter
} // end class SquareOfAnyCharacter
