// Exercise 6.22: TemperatureConversionTest.java
// Get input in either Celsius or Fahrenheit and convert to the other
import java.util.Scanner;

public class TemperatureConversionTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "If you want to enter a Temperature in " +
            "Celsius enter c else enter f: " );
      char choice = input.next().charAt( 0 );

      System.out.print( "Enter temperature: " );
      double temp = input.nextDouble();

      double convertedTemp;
      if ( choice == 'c' )
         convertedTemp = TemperatureConversion.fahrenheit( temp );
      else
         convertedTemp = TemperatureConversion.celsius ( temp );

      System.out.printf( "%.1f", convertedTemp );
   } // end main
} // end class TemperatureConversionTest
