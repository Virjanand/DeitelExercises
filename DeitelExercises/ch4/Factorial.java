// Factorial.java
// Answer to exercise 4.37a from Deitel How to program Java
// Calculate the factorial of an input integer
import java.util.Scanner;

public class Factorial
{
   public static void main( String[] args )
   {
      // Initialize variables
      int counter = 1; // Initialize counter to 1
      int inputNumber; // Initialize inputNumber
      int factorial = 1; // Initialize factorial to 1

      // Input number
      // Prompt user for number
      System.out.println( "Input a number to calculate the factorial for" );
      // Initialize scanner
      Scanner input = new Scanner( System.in );
      // Input inputNumber
      inputNumber = input.nextInt();

      // Calculate factiorial
      // While counter less than or equal to inputNumber
      while ( counter <= inputNumber )
      {
         // Multilply and assign factorial with counter
         factorial *= counter;
         // increase counter by one
         ++counter;
      }
      
      // Display factorial
      System.out.printf( "The factorial of %d is %d", inputNumber, factorial );
   } // end main
} // end class Factorial
