// Palindromes.java
// Answer to exercise 4.30 from Deitel How to program Java
// Determine if 5 digits are a palindrome
import java.util.Scanner;

public class Palindromes
{
   public static void main( String[] args )
   {
      // Initialize variables
      int inputNumber; // Instantiate inputNumber
      boolean isPalindrome = true; // Initialize isPalindrome to true
      boolean is5Digits = true;
      Scanner input = new Scanner( System.in ); // Initialize scanner

      System.out.println( "Please enter a 5 digit number." );
      // Input 5 digit number
      inputNumber = input.nextInt();
      // while inputNumber is not 5 digit number
      if ( inputNumber / 10000 == 0 )
         is5Digits = false;
      if ( inputNumber / 10000 > 10 )
         is5Digits = false;

      while ( is5Digits == false )
      {
      //    Display error message
         System.out.println( "Please enter a 5 digit number." );
      //    Input 5 digit number
         inputNumber = input.nextInt();
         is5Digits = true;
         if ( inputNumber / 10000 == 0 )
           is5Digits = false;
         if ( inputNumber / 10000 > 10 )
           is5Digits = false;
      }

      // Determine if number is palindrome
      // If first digit (inputNumber / 10000) not equal to fifth
      if ( inputNumber / 10000 != inputNumber % 10 )
      //    Set isPalindrome to false
         isPalindrome = false;
      // If second digit not equal to second
      inputNumber %= 10000;
      inputNumber -= inputNumber % 10;
      if ( inputNumber / 1000 != inputNumber % 100 / 10 )
      //    Set isPalindrome to false
         isPalindrome = false;

      // Display yes or no
      if ( isPalindrome )
         System.out.println( "The number is palindrome" );
      else
         System.out.println( "The number is not a palindrome" );
   } // end main
} // end class Palindromes
