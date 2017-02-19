// Encryption.java
// Answer to exercise 4.38 from Deitel How to program Java
// Encrypt a 4 digit integer
import java.util.Scanner;

public class Encryption
{
   public static void main( String[] args )
   {
      // Initialize variables
      int encryptedNumber; // Initialize encryptedNumber
      int digit1; // Initialize digit1
      int digit2; // Initialize digit2
      int digit3; // Initialize digit3
      int digit4; // Initialize digit4
      // Initialize scanner
      Scanner input = new Scanner( System.in );
     
      // Input unencryptedNumber
      System.out.print( "Enter a 4 digit number to encrypt: " );
      int unencryptedNumber = input.nextInt();
      // Extract digit1
      digit1 = unencryptedNumber / 1000;
      unencryptedNumber %= 1000;
      // Extract digit2
      digit2 = unencryptedNumber / 100;
      unencryptedNumber %= 100;
      // Extract digit3
      digit3 = unencryptedNumber / 10;
      // Extract digit4
      digit4 = unencryptedNumber % 10;

      // Apply encryption protocol
      // Add 7 to digits and take remainder of 10
      digit1 = ( digit1 + 7 ) % 10;
      digit2 = ( digit2 + 7 ) % 10;
      digit3 = ( digit3 + 7 ) % 10;
      digit4 = ( digit4 + 7 ) % 10;
   
      // Build encryptedNumber digit3, digit4, digit1, digit2
      encryptedNumber = 1000 * digit3 + 100 * digit4 + 10 * digit1 + digit2;
      // Display encrypted number
      System.out.printf( "Encrypted number is: %04d", encryptedNumber );
   } // end main
} // end class Encryption
