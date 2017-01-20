// Arithmetic.java
// Answer to exercise 2.15 from Deitel How to program Java
import java.util.Scanner;

public class Arithmetic
{
   public static void main( String[] args )
   {
      System.out.print( "This program does arithmetic operations on" );
      System.out.print( " two integers.\n\n" );

      Scanner input = new Scanner( System.in );

      System.out.print( "Type the first integer: " );
      int firstInt = input.nextInt();

      System.out.print( "Type the second integer: ");
      int secondInt = input.nextInt();

      System.out.print( "\n" );

      System.out.printf( "The sum of %d and %d is %d.\n", firstInt,
		     secondInt, (firstInt + secondInt));
      
      System.out.printf( "The product of %d and %d is %d.\n", firstInt,
		     secondInt, (firstInt * secondInt)); 
      
      System.out.printf( "The difference of %d and %d is %d.\n", firstInt,
		     secondInt, (firstInt - secondInt)); 
      
      System.out.printf( "The quotient of %d and %d is %d.\n", firstInt,
		     secondInt, (firstInt / secondInt)); 

   }
}
