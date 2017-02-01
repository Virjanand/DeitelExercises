// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class Addition
{
   // main method begins execution of Java application
   public static void main( String[] args)
   {

      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2

      String firstNumber = JOptionPane.showInputDialog(
	 "Type the first number: " );
      String secondNumber = JOptionPane.showInputDialog(
         "Type the second number: " );

      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );
      sum = number1 + number2; // add numbers, then store total in sum

      String message = String.format( "The sum of %d and %d is %d",
	 number1, number2, sum );
      JOptionPane.showMessageDialog( null, message ); 
   } // end methond main 
} // end class Addition
