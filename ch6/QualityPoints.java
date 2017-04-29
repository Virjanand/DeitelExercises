// Exercise 6.28: QualityPoints.java
// Convert a number between 0-100 to a rating of 0-4
import java.util.Scanner;

public class QualityPoints
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter student average: " );
      double average = input.nextDouble();

      int rating = qualityPoints( average );

      System.out.printf( "Quality point for student is: %d.\n",
            rating );
   } // end main

   private static int qualityPoints( double average )
   {
      if ( average >= 90 )
         return 4;
      if ( average >= 80 )
         return 3;
      if ( average >= 70 )
         return 2;
      if (average >= 60 )
         return 1;
      else
         return 0;
   } // end method qualityPoints
} // end class QualityPoints
