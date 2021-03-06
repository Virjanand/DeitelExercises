// SquareOfAsterisks.java
// Answer to exercise 4.29 from Deitel How to program Java
import java.util.Scanner;

public class SquareOfAsterisks
{
   public static void main( String[] args )
   {
      // Initialize variables
      int sizeOfSquare; // Instantiate sizeOfSquare
      int counter = 2; // Initialize counter to 2
      int innerCounter = 1; // Initialize innerCounter to 1

      // Input size of Square
      Scanner input = new Scanner( System.in );
      System.out.print( "What size should the square be? " );
      sizeOfSquare = input.nextInt();

      // Draw square
      // Draw top line
      counter = 1;
      while ( counter <= sizeOfSquare )
      {
         System.out.print( "*" );
         ++counter;
      } // end while
      // while counter is smaller than sizeOfSquare
      System.out.println();
      counter = 2;
      while ( counter < sizeOfSquare )
      {
         innerCounter = 2;
         System.out.print( "*" );
         while ( innerCounter < sizeOfSquare )
         {
            System.out.print( " " );
            ++innerCounter;
         }
         System.out.print( "*" );
         System.out.println(); 
         ++counter;
      } // end while
         // Draw in between lines
      // Draw bottom line
      counter = 1;
      while ( counter <= sizeOfSquare )
      {
         System.out.print( "*" );
         ++counter;
      } // end while
   } // end main
} // end class SquareOfAsterisks
