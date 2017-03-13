// Factorials.java
// Answer to exercise 5.13 from Deitel How to program Java
// Calculate and display factorials of 1 through 20

public class Factorials
{
   public static void main( String[] args )
   {
      // Initialize variables
      long factorial = 1; // initialize factorial to 1

      // For each number calculate factorial and display
      for ( int i = 1; i <= 20; ++i )
      {
         factorial *= i;
         System.out.printf( "%4d %20d\n", i, factorial );
      } // end for
   } // end main
} // end class Factorials
