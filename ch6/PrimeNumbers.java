// Exercise 6.25: PrimeNumbers.java
// Determine and display all the prime numbers less than 10,000

public class PrimeNumbers
{
   public static void main( String[] args )
   {
      for ( int number = 2; number <= 10000; number++ )
      {
         if ( isPrime( number ) )
            System.out.printf( "%d is a prime number.\n", number );
      }
   } // end main

   private static boolean isPrime( int number )
   {
      int maxSearch = number / 2;
      for ( int factor = 2; factor <= maxSearch; factor++ )
         if ( number % factor == 0 )
            return false;

      return true;
   } // end method isPrime
} // end class PrimeNumbers
