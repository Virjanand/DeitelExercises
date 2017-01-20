// OddOrEven.java
// Answer to exercise 2.25 from Deitel How to program Java
import java.util.Scanner;

public class OddOrEven
{
   public static void main( String[] args )
   {
      System.out.print( "This program determines whether a number " );
      System.out.println( "is odd or even." );

      Scanner input = new Scanner( System.in );

      System.out.print( "Type an integer: " );
      int number = input.nextInt();

      if (number % 2 == 0)
         System.out.printf( "The number %d is even.", number );
      if (number % 2 != 0)
         System.out.printf( "The number %d is odd.", number );

   }
}
