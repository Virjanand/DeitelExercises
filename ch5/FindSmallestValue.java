// FindSmallestValue.java
// Answer to exercise 5.11 from Deitel How to program Java
// Find the smallest value of input number of values
import java.util.Scanner;

public class FindSmallestValue
{
   public static void main( String[] args )
   {
      // Initialize values
      int numberOfValues; // Declare numberOfValues
      int smallestValue; // Declare smallest value
      int valueEntered; // Declare value entered
      Scanner input = new Scanner( System.in ); // Initialize input scanner

      // Input number of values
      // Prompt how many values do you want to enter?
      System.out.print( "How many values do you want to enter? " );
      // Input number of values
      numberOfValues = input.nextInt();

      // Input all values and keep track of the smallest
      // if number of values is larger than 0
      //    prompt for value
      //    set smallest value to inputvalue
      //    decrement number of values
      if ( numberOfValues > 0 )
      {
         System.out.print( "Enter value: " );
         smallestValue = input.nextInt();
         --numberOfValues;
         // while number of values is larger than 0
         //    prompt for value
         //    check if smaller than smallest
         //       set smallest to input value
         //    decrement number of values
         while ( numberOfValues > 0 )
         {
            System.out.print( "Enter value: " );
            valueEntered = input.nextInt();
         
            if ( valueEntered < smallestValue )
               smallestValue = valueEntered;

            --numberOfValues;

         } // end while
         
         // Display smallest value
         System.out.printf( "The smallest value is: %d", smallestValue );
      
      } // end if
      else
         System.out.println( "Please enter a number larger than 0." );

   } // end main
} // end class FindSmallestValue
