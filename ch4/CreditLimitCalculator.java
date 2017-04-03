// CreditLimitCalculator.java
// Answer to exercise 4.18 from How to program Java
// Analyze each customer's balance and notify if Credit limit exceeded
import java.util.Scanner;

public class CreditLimitCalculator
{
   public static void main( String[] args )
   {
      // Initialize variables
      int accountNumber = 0; // initialize account number
      int balance = 0; // initialize balance to 0
      int totalCharged = 0; // initialize total charged to 0
      int totalCredits = 0; // initialize total credits to 0
      int allowedCredit = 0; // initialize allowed credit to 0

      // Input customer account details
      Scanner input = new Scanner( System.in );

      // input account number etc
      System.out.print( "Account number (-1 to quit): " );
      accountNumber = input.nextInt();
      System.out.print( "Starting balance: " );
      balance = input.nextInt();
      System.out.print( "Total charged: " );
      totalCharged = input.nextInt();
      System.out.print( "Total credits: " );
      totalCredits = input.nextInt();
      System.out.print( "Allowed credit limit (Enter a positive value): " );
      allowedCredit = input.nextInt();

      // while sentinel value isn't entered
      while ( accountNumber != -1 )
      {
         // Calculate new balance and determine credit limit exceeded
         balance += totalCharged - totalCredits;

         // print Credit limit exceeded if so
         if ( balance > allowedCredit )
            System.out.println( "Credit limit exceeded!" );
         // input account number etc.
         System.out.print( "Account number (-1 to quit): " );
         accountNumber = input.nextInt();
         System.out.print( "Starting balance: " );
         balance = input.nextInt();
         System.out.print( "Total charged: " );
         totalCharged = input.nextInt();
         System.out.print( "Total credits: " );
         totalCredits = input.nextInt();
         System.out.print( "Allowed credit limit (Enter a positive value): " );
         allowedCredit = input.nextInt();
     } // end while
   } // end method main
} // end class CreditLimitCalculator
