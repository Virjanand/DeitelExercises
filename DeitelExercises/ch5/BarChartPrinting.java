// BarChartPrinting.java
// Answer to exercise 5.16 from Deitel How to program java
import java.util.Scanner;

public class BarChartPrinting
{
   // Initialize variables
   private int number1;
   private int number2;
   private int number3;
   private int number4;
   private int number5;

   // Prompt for 5 numbers
   public void displayPrompt()
   {
      System.out.println( "Enter 5 numbers to make into a bar chart: " );
   } // end method displayPrompt
   
   // Input 5 numbers
   public void input5Integers()
   {
      Scanner input = new Scanner( System.in );

      number1 = input.nextInt();
      number2 = input.nextInt();
      number3 = input.nextInt();
      number4 = input.nextInt();
      number5 = input.nextInt();

   } // end method input5Integers

   // Display bars of asterisks
   public void displayBarChart()
   {
      printNumberOfAsterisks( number1 );
      printNumberOfAsterisks( number2 );
      printNumberOfAsterisks( number3 );
      printNumberOfAsterisks( number4 );
      printNumberOfAsterisks( number5 );

   } // end method displayBarChart

   private void printNumberOfAsterisks( int number )
   {
      for (int i = 1; i <= number; i++ )
         System.out.print( '*' );

      System.out.print( '\n' );
   } // end method printNumberOfAsterisks
} // end class BarChartPrinting
