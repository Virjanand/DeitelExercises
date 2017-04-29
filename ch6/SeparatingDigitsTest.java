// Exercise 6.21: SeparatingDigitsTest.java
// Test the SeparatingDigits class
import java.util.Scanner;

public class SeparatingDigitsTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      System.out.print( "Enter number between 1 and 99999: " );
      int number = input.nextInt();

      SeparatingDigits.displayDigits( number );
   } // end main
} // end class SeparatingDigitsTest
