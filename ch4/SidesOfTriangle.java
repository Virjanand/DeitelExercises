// SidesOfTriangle.java
// Answer to exercise 4.35 from Deitel How to program Java
// Determine if three input integers can be the sides of a triangle
import java.util.Scanner;

public class SidesOfTriangle
{
   public static void main( String[] args )
   {
      // Initialize variables
      int side1; // Initialize side1
      int side2; // Initialize side2
      int side3; // Initialize side3
      boolean isTriangle = true; // Initialize isTriangle to true
      Scanner input = new Scanner( System.in ); // Initialize scanner

      System.out.println( "Check if 3 integers are sides of a triangle" );
      // Prompt user for three non-zero integers
      System.out.println( "Give three non-zero numbers to check: " );
      side1 = input.nextInt(); // Input side1
      side2 = input.nextInt(); // Input side2
      side3 = input.nextInt(); // Input side3

      // Check triangle inequality Theorem
      // If side1 + side2 <= side3 set isTriangle to false
      if ( side1 + side2 <= side3 )
         isTriangle = false;
      // If side1 + side3 <= side2 set isTriangle to false
      if ( side1 + side3 <= side2 )
        isTriangle = false;
      // If side2 + side3 <= side1 set isTriangle to false
      if ( side2 + side3 <= side1 )
        isTriangle = false;

      // Display if it is a triangle
      // if isTriangle then display is triangle
      if ( isTriangle )
         System.out.printf( "The sides with length %d %d and %d form a triangle",
               side1, side2, side3 );
      // else display is not triangle
      else
         System.out.printf( "The sides with length %d %d and %d don't form a triangle",
               side1, side2, side3 );
   } // end main
} // end class SidesOfTriangle
