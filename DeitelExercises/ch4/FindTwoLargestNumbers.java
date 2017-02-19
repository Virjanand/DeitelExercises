// FindTwoLargestNumber.java
// Answer to exercise 4.23 from Deitel How to program Java
// Find the two largest value of 10 integers
import java.util.Scanner;

public class FindTwoLargestNumbers
{
   public static void main( String[] args )
   {
      // Initialize variables
      int number; // Instantiate number
      int largestNumber; // Instantiate largest number
      int secondLargestNumber; // Instantiate second largest number
      int counter = 1; // Initialize counter to 1
      Scanner input = new Scanner( System.in ); // Initialize scanner

      // Display input 10 numbers to find the largest number of 10
      System.out.print( "This program requests 10 numbers " );
      System.out.println( "and displays the largest and second largest." );
      System.out.println();
      // Input 10 numbers
      System.out.print( "Give a number: " ); // Prompt number
      // Input number
      number = input.nextInt();
      // Initialize largest number to input number
      largestNumber = number;
      // Initialize second largest number to input number
      secondLargestNumber = number;
      ++counter;
      // while counter is smaller than or equal to 10
      while ( counter <= 10 )
      {
         // Prompt number
         System.out.print( "Give a number: " );
         // Input number
         number = input.nextInt();

         // Store in largest number if larger than previous largest
         if ( number > secondLargestNumber )
         {
            if ( number > largestNumber )
            {
               secondLargestNumber = largestNumber;
               largestNumber = number;
            }
            else
            {
               secondLargestNumber = number;
            }
         // Add one to counter
         }
         ++counter;
      }

      // Display largest number
      System.out.printf( "The largest number is: %d\n", largestNumber );
      System.out.printf( "The second largest number is: %d", secondLargestNumber );

   } // end method main
} // end class FindTwoLargestNumbers
