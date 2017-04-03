// SeparateDigitsInteger.java
// Answer to exercise 2.30 from Deitel How to program Java
import java.util.Scanner;

public class SeparateDigitsInteger
{
   public static void main( String[] args )
   {
      System.out.print( "This program separates the digits of an " );
      System.out.println( "integer with 5 digits into digits with spaces." );

      Scanner input = new Scanner( System.in );
      System.out.print( "Type an integer with 5 digits: " );
      int number = input.nextInt();

      int ones = number % 10;
      int tens = ( number % 100 - ones ) / 10;
      int hundreds = ( number % 1000 - tens - ones ) / 100;
      int thousands = ( number % 10000 - hundreds - tens - ones ) / 1000;
      int tenthousands = ( number - thousands - hundreds - tens - ones ) /
	      10000;
      System.out.printf( "%d   %d   %d   %d   %d",
		      tenthousands, thousands, hundreds, tens, ones );
   }
}
