// LargestAndSmallestFrom5Int.java
// Answer to exercise 2.24 from Deitel How to program Java
import java.util.Scanner;

public class LargestAndSmallestFrom5Int
{
   public static void main ( String[] args )
   {
      System.out.print( "This program asks for 5 integers and " );
      System.out.println( "returns the largest and smallest of those 5." );
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
     
      int smallest = number1;
      if (number2 <= smallest)
         smallest = number2;
      if (number3 <= smallest)
         smallest = number3;
      if (number3 <= smallest)
         smallest = number3;
      if (number4 <= smallest)
         smallest = number4;
      if (number5 <= smallest)
         smallest = number5;
       
      int largest = number1;
      if (number2 >= largest)
         largest = number2;
      if (number3 >= largest)
         largest = number3;
      if (number3 >= largest)
         largest = number3;
      if (number4 >= largest)
         largest = number4;
      if (number5 >= largest)
         largest = number5;
      
      System.out.printf( "The smallest number is: %d.\n", smallest );
      System.out.printf( "The largest number is: %d.\n", largest ); 
   }
}
