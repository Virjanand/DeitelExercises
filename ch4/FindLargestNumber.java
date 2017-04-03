// FindLargestNumber.java
// Answer to exercise 4.21 from Deitel How to program Java
// Find the largest value of 10 integers
import java.util.Scanner;

public class FindLargestNumber
{
   public static void main( String[] args )
   {
      // Initialize variables
      int number; // Instantiate number;
      int largestNumber; // Instantiate largest number;
      int counter = 1; // Initialize counter to 1;
      Scanner input = new Scanner( System.in ); // Initialize scanner

      // Display input 10 numbers to find the largest number of 10
      System.out.print( "This program requests 10 numbers " );
      System.out.println( "and displays the largest." );
      System.out.println();
      // Input 10 numbers
      System.out.print( "Give a number: " ); // Prompt number
      // Input number
      number = input.nextInt();
      // Initialize largest number to input number
      largestNumber = number;
      ++counter;
      // while counter is smaller than or equal to 10
      while ( counter <= 10 )
      {
         // Prompt number
         System.out.print( "Give a number: " );
         // Input number
         number = input.nextInt();

         // Store in largest number if larger than previous largest
         if ( number > largestNumber )
            largestNumber = number;
         // Add one to counter
         ++counter;
      }

      // Display largest number
      System.out.printf( "The largest number is: %d", largestNumber );

   } // end method main
} // end class FindLargestNumber
