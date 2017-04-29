// Exercise 6.24: PerfectNumbers.java
// Display all perfect number between 1 and 1000
// a perfect number: its factors including 1 sum to that number

public class PerfectNumbers
{
   public static void main( String[] args )
   {
      for ( int number = 1; number <= 1000000; number++ )
      {
         if ( isPerfect ( number ) )
         {
            System.out.printf( "%d is a perfect number.\n", number );
            System.out.printf( "Its factors are:" );
            displayFactors( number );
         }
      }
   } // end main

   private static boolean isPerfect( int number )
   {
      int runningSum = 1;

      for ( int factor = 2; factor < number; factor++ )
      {
         if ( number % factor == 0 )
            runningSum += factor;
      } // end for

      if ( runningSum == number )
         return true;
      else
         return false;
   } // end method isPerfect

   private static void displayFactors( int number )
   {
      for ( int factor = 1; factor <= number; factor++ )
      {
         if ( number % factor == 0 )
            System.out.printf( " %d ", factor );
      }

      System.out.println();
   } // end method displayFactors
} // end class PerfectNumbers
