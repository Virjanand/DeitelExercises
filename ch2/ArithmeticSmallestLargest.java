// ArithmeticSmallestLargest.java
// Answer to exercise 2.17 from Deitel How to program Java
import java.util.Scanner;

public class ArithmeticSmallestLargest
{
   public static void main( String[] args )
   {
      System.out.print( "This program does arithmetic operations on" );
      System.out.print( " three integers.\n\n" );

      Scanner input = new Scanner( System.in );

      System.out.print( "Type the first integer: " );
      int firstInt = input.nextInt();

      System.out.print( "Type the second integer: ");
      int secondInt = input.nextInt();

      System.out.print( "Type the third integer: " );
      int thirdInt = input.nextInt();

      System.out.print( "\n" );

      System.out.printf( "The sum of %d, %d and %d is %d.\n", firstInt,
		     secondInt, thirdInt, (firstInt + secondInt + thirdInt));
      
      System.out.printf( "The average of %d, %d and %d is %d.\n", firstInt,
		     secondInt, thirdInt,
		     (firstInt * secondInt * thirdInt) / 3); 

      System.out.printf( "The product of %d, %d and %d is %d.\n", firstInt,
		     secondInt, thirdInt, (firstInt * secondInt * thirdInt)); 

      int smallestInt = firstInt;
      if (secondInt <= smallestInt)
         smallestInt = secondInt;
      if (thirdInt <= smallestInt)
	 smallestInt = thirdInt;	      

      System.out.printf( "The smallest of %d, %d and %d is %d.\n", firstInt,
		     secondInt, thirdInt, smallestInt); 

      int largestInt = firstInt;
      if (secondInt >= largestInt)
         largestInt = secondInt;
      if (thirdInt >= largestInt)
	 largestInt = thirdInt;	      

      System.out.printf( "The largest of %d, %d and %d is %d.\n", firstInt,
		     secondInt, thirdInt, largestInt);
   }
}
