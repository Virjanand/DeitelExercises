// Exercise 6.6: VolumeSphere.java
// Prompt user for radius and display volume of the sphere
import java.util.Scanner;

public class VolumeSphere
{
   public static void main( String[] args )
   {
      // get radius
      // display prompt for radius
      System.out.print( "Enter radius: " ); 
      // initialize scanner
      Scanner input = new Scanner( System.in );
      // input radius
      double radius = input.nextDouble();

      // calculate volume of sphere
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );

      // display volume of sphere
      System.out.printf( "The volume of a sphere with a radius of %.2f " +
            "is %.2f.", radius, volume );

   } // end main
} // end class VolumeSphere
