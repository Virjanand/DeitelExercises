// Answers2_3.java
// Answers to question 2.3 Deitel
import java.util.Scanner;

public class Answers2_3
{
   public static void main ( String[] args )
   {
      int c,
	  thisIsAVariable,
	  q76354,
	  number;
      
      System.out.print ( "Type a number: " );

      Scanner input = new Scanner ( System.in );
      int value = input.nextInt();

      System.out.println( "This is a Java program" );

      System.out.println( "This is a Java\nprogram" );

      System.out.printf( "%s\n%s\n", "This is a Java", "Program" );

      System.out.print( "Type another number: ");

      number = input.nextInt();

      if ( number != 7)
         System.out.println ( "The variable number is not equal to 7" );
   }
}	
