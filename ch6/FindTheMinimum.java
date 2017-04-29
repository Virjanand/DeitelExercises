// Exercise 6.23: FindTheMinimum.java
// Find the minimum of 3 floating-point numbers
import java.util.Scanner;

public class FindTheMinimum
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter 3 floating-point numbers:\n" );

      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();

      double minimumValue = minimum3( number1, number2, number3 );

      System.out.printf( "The smallest value of %.2f, %.2f and %.2f " +
            "is: %.2f", number1, number2, number3, minimumValue );
   } // end main

   private static double minimum3( double value1, double value2,
         double value3 )
   {
      return Math.min( value1, Math.min( value2, value3 ) );
   } // end method ninimum3
} // end class FindTheMinimum
