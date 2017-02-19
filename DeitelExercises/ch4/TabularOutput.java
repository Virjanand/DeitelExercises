// TabularOutput.java
// Anser to exercise 4.22 from Deitel How to program Java
// Print a table of values

public class TabularOutput
{
   public static void main( String[] args )
   {
      // Initialize variables
      int counter = 1; // initialize counter to 1
      int multiplier1 = 10; // set multiplier1 to 10
      int multiplier2 = 100; // set multiplier2 to 100
      int multiplier3 = 1000; // set multiplier3 to 1000

      // print table
      // Print header
      System.out.printf( "%-8s%-8s%-8s%-8s", "N", "10*N", "100*N", "1000*N" );
      System.out.println();
      System.out.println();
     // while counter is less than or equal to 5
      while ( counter <= 5 )
      {
         // print row
         System.out.printf( "%-8d%-8d%-8d%-8d\n", counter, counter * multiplier1,
               counter * multiplier2, counter * multiplier3 );
         ++counter;
         // increment counter by one
      }
   }
} // end class TabularOutput
