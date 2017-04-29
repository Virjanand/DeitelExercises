// Exercise 6.20: CircleArea.java
// Calculate area of circle from input radius
import java.util.Scanner;

public class CircleArea
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter radius: " );
      double radius = input.nextDouble();

      double area = circleArea( radius );

      System.out.printf( "The area of a circle with radius %.2f is %.2f.\n",
            radius, area );
   } // end main

   private static double circleArea( double radius )
   {
      return Math.PI * Math.pow( radius, 2 );
   } // end method circleArea
} // end class CircleArea
