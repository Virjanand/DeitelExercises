// Decryption.java
// Answer to exercise 4.38 from Deitel How to program Java
// Decrypt a 4 digit integer
import java.util.Scanner;

public class Decryption
{
   public static void main( String[] args )
   {
      // Initialize variables
      int decryptedNumber; // Initialize encryptedNumber
      int digit1; // Initialize digit1
      int digit2; // Initialize digit2
      int digit3; // Initialize digit3
      int digit4; // Initialize digit4
      // Initialize scanner
      Scanner input = new Scanner( System.in );
     
      // Input unencryptedNumber
      System.out.print( "Enter a 4 digit number to decrypt: " );
      int encryptedNumber = input.nextInt();
      // Extract digit1
      digit1 = encryptedNumber / 1000;
      encryptedNumber %= 1000;
      // Extract digit2
      digit2 = encryptedNumber / 100;
      encryptedNumber %= 100;
      // Extract digit3
      digit3 = encryptedNumber / 10;
      // Extract digit4
      digit4 = encryptedNumber % 10;

      // Apply encryption protocol
      // Add 7 to digits and take remainder of 10
      digit1 = ( digit1 + 3 ) % 10;
      digit2 = ( digit2 + 3 ) % 10;
      digit3 = ( digit3 + 3 ) % 10;
      digit4 = ( digit4 + 3 ) % 10;
   
      // Build encryptedNumber digit3, digit4, digit1, digit2
      encryptedNumber = 1000 * digit3 + 100 * digit4 + 10 * digit1 + digit2;
      // Display encrypted number
      System.out.printf( "Encrypted number is: %04d", encryptedNumber );
   } // end main
} // end class Encryption
