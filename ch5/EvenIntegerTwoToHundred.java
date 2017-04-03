// EvenIntegerTwoToHundred.java
// Answer to exercise 5.9d from Deitel How to program Java

public class EvenIntegerTwoToHundred
{
   public static void main( String[] args )
   {
      int counter = 2;

      do
      {
         System.out.println( counter );
         counter += 2;
      } while ( counter < 100 );
   } // end main
} // end class EvenIntegerTwoToHundred
