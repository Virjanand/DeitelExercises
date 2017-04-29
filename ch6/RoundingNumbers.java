// Exercise 6.9: RoundingNumbers.java
// Read double values and round to nearest integer
import java.util.Scanner;

public class RoundingNumbers
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      displayPromptForNumber();

      while ( input.hasNext() )
      {
         double number = input.nextDouble();
         int roundedToInteger = roundToInteger( number );
         double roundedToTenths = roundToTenths( number );
         double roundedToHundreths = roundToHundredths( number );
         double roundedToThousandths = roundToThousandths( number );

         System.out.printf( "%.5f %d %.5f %.5f %.5f\n",
               number, roundedToInteger,
               roundedToTenths, roundedToHundreths,
               roundedToThousandths );

         displayPromptForNumber();
      } // end while
   } // end main

   private static void displayPromptForNumber()
   {
      System.out.print( "Enter a floating number: " );
   } // end method displayPromptForNumber

   private static double roundToDecimal( double number, int position )
   {
      double roundedNumber = Math.floor( number * position + 0.5 ) / 
         position;

      return roundedNumber;
   } // end method roundToDecimal

   private static int roundToInteger( double number )
   {
      int roundedNumber = (int) roundToDecimal( number, 1 );

      return roundedNumber;
   } // end method roundToInteger

   private static double roundToTenths( double number )
   {
      double roundedNumber = roundToDecimal( number, 10 );

      return roundedNumber;
   } // end method roundToInteger

   private static double roundToHundredths( double number )
   {
      double roundedNumber = roundToDecimal( number, 100 );

      return roundedNumber;
   } // end method roundToInteger

   private static double roundToThousandths( double number )
   {
      double roundedNumber = roundToDecimal( number, 1000 );

      return roundedNumber;
   } // end method roundToInteger

} // end class RoundingNumbers
