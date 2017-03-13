// Statements.java
// Answer to exercise 5.19 from Deitel How to program Java
// Execute given statements to check output

public class Statements
{
   public static void main( String[] args )
   {
      int i = 1; // initialize 1 to 1
      int j = 2; // initialize j to 2
      int k = 3; // initialize k to 3
      int m = 2; // initialize m to 2

      System.out.println( i == 1 ); // prints true

      System.out.println( j == 3 ); // prints false

      System.out.println( ( i >= 1 ) && ( j < 4 ) ); // prints true

      System.out.println( ( m <= 99 ) & ( k < m ) ); // prints false

      System.out.println( ( j >= i ) || ( 3 - j >= k ) ); // prints true

      System.out.println( ( k + m < j ) | ( 3 - j >= k ) ); // prints false

      System.out.println( !( k > m ) ); // prints false
   } // end main
} // end class Statements
