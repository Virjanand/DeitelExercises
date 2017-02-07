// Sum1To10.java
// Answer to exercise 4.6 from Deitel How to Program Java

public class SummingToEleven
{
   public static void main( String[] args )
   {
      int sum, x;
      x = 1;
      sum = 0;
      while ( x <= 10 )
      {
         sum += x;
         x++;
      }

      System.out.printf( "The sum is: %d.\n", sum );
      System.out.printf( "The value of x is: %d.", x );
   }
}
