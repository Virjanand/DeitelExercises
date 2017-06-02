// Exercise 6.32: Distance.java
// Calculate the distance between two input 2-D points
import java.util.Scanner;

public class Distance
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter point 1.\n" );
      System.out.print( "x: " );
      double x1 = input.nextDouble();
      System.out.print( "y: " );
      double y1 = input.nextDouble();

      System.out.print( "Enter point 2.\n" );
      System.out.print( "x: " );
      double x2 = input.nextDouble();
      System.out.print( "y: " );
      double y2 = input.nextDouble();

      double distance = distance( x1, y1, x2, y2 );

      System.out.printf( "The distance between (%.1f, %.1f) " +
            "and (%.1f, %.1f) is %.1f.",
            x1, y1, x2, y2, distance );
      
   } // end main

   private static double distance( double x1, double y1, 
         double x2, double y2 )
   {
      return Math.sqrt( Math.pow( x1 - x2 , 2 ) + 
            Math.pow( y1 - y2, 2 ) );
   } // end method distance
} // end class Distance
