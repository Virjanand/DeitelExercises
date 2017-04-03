// Multiples.java
// Answer to exercise 2.26 from Deitel How to program Java
import java.util.Scanner;

public class Multiples
{
   public static void main( String[] args )
   {
      System.out.print( "This program determines whether the frist " );
      System.out.println( "number is a multiple of the second." );

      Scanner input = new Scanner( System.in );

      System.out.print( "Type the first number: " );
      int firstNumber = input.nextInt();

      System.out.print( "Type the second number: " );
      int secondNumber = input.nextInt();

      if (firstNumber % secondNumber == 0)
         System.out.printf( "The number %d is a multiple of %d by %d.", 
			 firstNumber, secondNumber, firstNumber/secondNumber );
      
      if (firstNumber % secondNumber != 0)
         System.out.printf( "The number %d is not a multiple of %d.",
			 firstNumber, secondNumber );
   }
}
