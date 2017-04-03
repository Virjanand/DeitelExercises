// ModifiedContinueTest.java
// Answer to exercise 5.28 from Deitel How to program Java
// replace continue statement terminating an iteration of a for statement.

public class ModifiedContinueTest
{
   public static void main( String[] args )
   {
      boolean skip = false;
      for ( int count = 1; count <= 10; count++ ) // loop 10 times
      {
         if ( count == 5 ) // if count is 5,
         {
            skip = true; // skip remaining code in loop
         }

         if (!skip)
         {
            System.out.printf( "%d ", count );
         }
         else
            skip = false;
      } // end for

      System.out.println( "\nUsed continue to skip printing 5" );
   } // end main
} // end class ModifiedContinueTest
