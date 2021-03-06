// DiamondPrintingTest.java
// Answer to exercise 5.24 from Deitel How to program Java
// Test the DiamondPrinting class
import java.util.Scanner;

public class DiamondPrintingTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      System.out.print( "Enter the size of the diamond " +
            "(odd integer only): " );
      int size = input.nextInt();

      DiamondPrinting diamond = new DiamondPrinting( size );
      diamond.printDiamond();
   } // end main
} // end class DiamondPrintingTest
