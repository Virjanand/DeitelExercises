// Exercise 6.35: MultiplicationLearning.java
// Randomly ask multiplication questions e.g.
// "How much is 6 times 7? As the same question until
// correctly answered
import java.util.Scanner;
import java.util.Random;

public class MultiplicationLearning
{
   public static void main( String[] args )
   {
      boolean keepPlaying = true;
      while ( keepPlaying )
      {
         int correctAnswer = askMultiplicationQuestion();
         
         Scanner input = new Scanner( System.in );

         while ( input.nextInt() != correctAnswer )
            System.out.println( "Niet goed. Probeer nog een keer." );

         System.out.println( "Heel goed!" );

         System.out.println( "Nog een keer (y/n)?" );
         char answerContinue = input.next().charAt( 0 );

         if ( answerContinue == 'n' )
            keepPlaying = false;
      } // end while

      System.out.println( "Bedankt voor het spelen." );
   } // end main

   public static int askMultiplicationQuestion()
   {
      Random randomNumber = new Random();

      int number1 = randomNumber.nextInt( 9 ) + 1;
      int number2 = randomNumber.nextInt( 9 ) + 1;

      System.out.printf( "Hoeveel is %d keer %d?\n",
            number1, number2 );

      return number1 * number2;
   } // end method askMultiplicationQuestion
} // end class MultiplicationLearning
