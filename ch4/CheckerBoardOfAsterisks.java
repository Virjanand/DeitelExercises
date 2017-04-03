// CheckerBoardOfAsterisks.java
// Answer to exercise 4.32 from Deitel How to program Java
// Display checkerboard pattern

public class CheckerBoardOfAsterisks
{
   public static void main( String[] args )
   {
      // Initalize variable
      int counter = 1; // Initialize counter to 1
      int innerCounter = 1; // Initialize innerCounter to 1
      int gridSize = 8; // Initialize gridSize to 8

      // Print pattern
      // While counter is smaller than or equal to gridSize
      while ( counter <= gridSize )
      {
         // Initialize innerCounter to 1
         innerCounter = 1;
         // While innerCounter is smaller than or equal to gridSize
         // if counter is even print space
         if ( counter % 2 == 0 )
            System.out.print( " " );
        while ( innerCounter <= gridSize )
         {
            // print *
            System.out.print( "* " );
            // increase innerCounter by 1
            ++innerCounter;
         }
         // print end of line
         System.out.println();
         // increase counter by 1
         ++counter;
      }
   } // end main
} // end class CheckerBoardOfAsterisks
