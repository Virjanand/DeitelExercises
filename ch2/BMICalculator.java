// BMICalculator.java
// Answer to exercise 2.33 from Deitel Learn to program Java
import java.util.Scanner;

public class BMICalculator
{
   public static void main( String[] args )
   {
      System.out.println( "BMI Calculator" );
      System.out.print( "\n" );

      Scanner input = new Scanner( System.in );
      System.out.print( "Weight in kg: " );
      int weight = input.nextInt();

      System.out.print( "Height in m: " );
      int height = input.nextInt();

      System.out.print( "\n" );
      System.out.printf( "BMI is: %d", ( weight / ( height * height ) ) );

      System.out.print( "\n\n" );
      System.out.println( "BMI VALUES" );
      System.out.println( "Underweight:  less than 18.5" );
      System.out.println( "Normal:       between 18.5 and 24.9" );
      System.out.println( "Overweight:   between 25 and 29.9" );
      System.out.println( "Obese:        30 or greater" );
   }
}
