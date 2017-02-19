// DecimalFromBinary.java
// Answer to exercise 4.31 from Deitel How to program Java
// Input a binary number and print decimal value
import java.util.Scanner;

public class DecimalFromBinary
{
   public static void main( String[] args )
   {
      // Initalize variables
      int binaryNumber; // Initialize binary number
      int oneDigit; // Initialize oneDigit
      int decimalNumber = 0; // Initialize decimal number to 0
      int powerOfTwo = 1; // Initalize powerOfTwo to 1
      // Initialize scanner
      Scanner input = new Scanner( System.in );

      // Prompt binary number
      System.out.println( "Enter a binary number: " );
      // Input binary number
      binaryNumber = input.nextInt();

      // Convert binary to decimal number
      // While binary number is larger than 0
      while ( binaryNumber > 0 )
      {
         // Set oneDigit to binary number remainder 10
         oneDigit = binaryNumber % 10;
         // Add powerOfTwo times oneDigit decimal number
         decimalNumber += oneDigit * powerOfTwo;
         // multiply powerOfTwo by 2
         powerOfTwo *= 2;
         // Set binaryNumber to binaryNumber / 10
         binaryNumber /= 10;
      }

      // Display decimal number
      System.out.printf( "The decimal representation is: %d", decimalNumber );
   } // end main
} // end class DecimalFromBinary
