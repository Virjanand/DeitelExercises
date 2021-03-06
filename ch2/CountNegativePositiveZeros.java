// CountnegativePositiveZeros.java
// Answer to exercise 2.32 from Deitel Learn to program Java
import java.util.Scanner;

public class CountNegativePositiveZeros
{
   public static void main( String[] args )
   {
      System.out.print( "This program counts the negative, " );
      System.out.println( "positive and zeros in 5 numbers." );

      Scanner input = new Scanner( System.in );

      System.out.print( "Type the first integer: " );
      int number1 = input.nextInt();

      System.out.print( "Type the second integer: " );
      int number2 = input.nextInt();

      System.out.print( "Type the third integer: " );
      int number3 = input.nextInt();

      System.out.print( "Type the fourth integer: " );
      int number4 = input.nextInt();

      System.out.print( "Type the fifth integer: " );
      int number5 = input.nextInt();

      int numNegatives = 0;
      int numPositives = 0;
      int numZeros = 0;

      if ( number1 < 0 )
	      numNegatives++;
      if ( number1 > 0 )
	      numPositives++;
      if ( number1 == 0 )
	      numZeros++;

      if ( number2 < 0 )
	      numNegatives++;
      if ( number2 > 0 )
	      numPositives++;
      if ( number2 == 0 )
	      numZeros++;

      if ( number3 < 0 )
	      numNegatives++;
      if ( number3 > 0 )
	      numPositives++;
      if ( number3 == 0 )
	      numZeros++;

      if ( number4 < 0 )
	      numNegatives++;
      if ( number4 > 0 )
	      numPositives++;
      if ( number4 == 0 )
	      numZeros++;

      if ( number5 < 0 )
	      numNegatives++;
      if ( number5 > 0 )
	      numPositives++;
      if ( number5 == 0 )
	      numZeros++;

      System.out.printf( "The number of negative numbers: %d\n",
		      numNegatives );
      System.out.printf( "The number of positive numbers: %d\n",
		      numPositives );
      System.out.printf( "The number of zeros: %d\n",
		      numZeros );
   }
}
