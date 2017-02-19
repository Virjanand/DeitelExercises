// SidesOfRightTriangle.java
// Answer to exercise 4.36 from Deitel How to program Java
// Determine if three input integers can be the sides of a right triangle
import java.util.Scanner;

public class SidesOfRightTriangle
{
   public static void main( String[] args )
   {
      // Initialize variables
      int side1; // Initialize side1
      int side2; // Initialize side2
      int side3; // Initialize side3
      boolean isRightTriangle = false; // Initialize isRightTriangle to true
      Scanner input = new Scanner( System.in ); // Initialize scanner

      System.out.println( "Check if 3 integers are sides of a right triangle" );
      // Prompt user for three non-zero integers
      System.out.println( "Give three non-zero numbers to check: " );
      side1 = input.nextInt(); // Input side1
      side2 = input.nextInt(); // Input side2
      side3 = input.nextInt(); // Input side3

      // Check Pythagoras
      if ( side1 * side1 + side2 * side2 == side3 * side3 )
         isRightTriangle = true;
      if ( side1 * side1 + side3 * side3 == side2 * side2 )
         isRightTriangle = true;
      if ( side2 * side2 + side3 * side3 == side1 * side1 )
         isRightTriangle = true;

      // Display if it is a triangle
      // if isRightTriangle then display is triangle
      if ( isRightTriangle )
         System.out.printf( "The sides with length %d %d and %d form a right triangle",
               side1, side2, side3 );
      // else display is not triangle
      else
         System.out.printf( "The sides with length %d %d and %d don't form a right triangle",
               side1, side2, side3 );
   } // end main
} // end class SidesOfRightTriangle
