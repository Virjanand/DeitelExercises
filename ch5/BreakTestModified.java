// BreakTestModified
// Answer to Exercise 5.26 from Deitel How to program Java
// replace break statement exiting a for statement.

public class BreakTestModified
{
   public static void main( String[] args )
   {
      int count; // control variable also used after loop terminates
      boolean stop = true;

      for ( count = 1; count <= 10 && stop; count++ ) // loop 10 times
      {
         if ( count == 5 ) // if count is 5.
         {
            stop = false;         // terminate loop
            count--;
         }

         if ( stop )
            System.out.printf( "%d ", count );
      } // end for

      System.out.printf( "\nBroke out of loop at count = %d\n", count );
   } // end main
} // end class BreakTest
