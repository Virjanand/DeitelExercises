// DiameterCircumferenceAreaCircle.java
// Answer to exercise 2.28 from Deitel How to program Java
import java.util.Scanner;

public class DiameterCircumferenceAreaCircle
{
   public static void main( String[] args )
   {
      System.out.print( "This program calculates the diameter, " );
      System.out.println( "circumference and area of a circle." );

      Scanner input = new Scanner( System.in );

      System.out.print( "Give the radius of the circle (whole number): " );
      int radius = input.nextInt();

      System.out.printf( "The diameter of the circle is: %d.\n",
		      ( 2 * radius ) );
      System.out.printf( "The circumference of the circle is: %f.\n",
		      ( 2 * Math.PI * radius ) );
      System.out.printf( "The area of the circle is: %f.\n",
		      ( Math.PI * radius * radius ) );
     
   }
}
