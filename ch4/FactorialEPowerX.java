// FactorialEPowerX.java
// Answer to exercise 4.37c from Deitel How to program Java
// Calculate e power x to the number of terms input
import java.util.Scanner;

public class FactorialEPowerX
{
   public static void main( String[] args )
   {
      // Initialize variables
      int counter = 1; // Initialize counter to 1
      int inputNumber; // Initialize inputNumber
      int factorial = 1; // Initialize factorial to 1
      int x; // Initialize x (the power)
      double e = 1.0; // Initialize e to 1.0

      // Input number
      // Prompt user for number
      System.out.println( "Input the number of terms to approximate e" );
      // Initialize scanner
      Scanner input = new Scanner( System.in );
      // Input inputNumber
      inputNumber = input.nextInt();

      System.out.println( "Input the power of e" );
      x = input.nextInt(); 

      // Calculate e approximation
      // While counter less than or equal to inputNumber
      while ( counter <= inputNumber )
      {
         // Multilply and assign e with counter
         factorial *= counter;
         e += (double) x / factorial;
         // increase counter by one
         ++counter;
      }
      
      // Display e
      System.out.printf( "e to the power of %d approximated to %d terms is %f", 
            x, inputNumber, e );
   } // end main
} // end class FactorialEPowerX
