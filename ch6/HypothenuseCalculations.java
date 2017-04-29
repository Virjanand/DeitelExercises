// Exercise 6.15: HypothenuseCalculations.java
// Calculate the hypothenuse of a triangle from 2 sides input
import java.util.Scanner;

public class HypothenuseCalculations
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter length side 1: " );

      while ( input.hasNext() )
      {
         double side1 = input.nextDouble();

         System.out.print( "Enter length side 2: " );
         double side2 = input.nextDouble();

         double hypothenuse = hypothenuse( side1, side2 );

         System.out.printf( "Hypothenuse: %.1f\n",
               hypothenuse );

         System.out.print( "Enter length side 1: " );
      } // end while
   } // end main

   private static double hypothenuse( double side1, double side2 )
   {
      double result = Math.sqrt( Math.pow( side1, 2 ) +
            Math.pow( side2, 2 ) );

      return result;
   } // end method hypothenuse
} // end class HypothenuseCalculations
