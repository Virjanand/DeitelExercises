// Product_of_3_int.java
// Prompts user for 3 integers and gives the product of these three integers
import java.util.Scanner;

public class Product_of_3_int
{
   public static void main( String[] args )
   {
      System.out.println( "This program will calculate the product of three integers." );
      
      Scanner input = new Scanner( System.in );

      int x,
	  y,
	  z;
      
     System.out.print( "Type the first integer: " );
     x = input.nextInt();

     System.out.print( "Type the second integer: " );
     y = input.nextInt();

     System.out.print( "Type the third integer: " );
     z = input.nextInt();
  
     int result = x * y * z;

     System.out.printf( "Product is %d", result); 
   }
}
