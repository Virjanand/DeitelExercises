// Exercise 6.36: MultiplicationLearning2.java
// Randomly ask multiplication questions e.g.
// "How much is 6 times 7? As the same question until
// correctly answered
import java.util.Scanner;
import java.util.Random;

public class MultiplicationLearning2
{
   public static void main( String[] args )
   {
      boolean keepPlaying = true;
      while ( keepPlaying )
      {
         int correctAnswer = askMultiplicationQuestion();
         
         Scanner input = new Scanner( System.in );

         while ( input.nextInt() != correctAnswer )
            displayIncorrectResponse();

         displayCorrectResponse();

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

   public static void displayCorrectResponse()
   {
      Random randomNumber = new Random();

      int responseNumber = randomNumber.nextInt( 4 ) + 1;

      switch ( responseNumber )
      {
         case 1:
            System.out.println( "Heel goed!" );
            break;
         case 2:
            System.out.println( "Geweldig!" );
            break;
         case 3:
            System.out.println( "Goed gedaan!" );
            break;
         case 4:
            System.out.println( "Ga zo door!" );
      } // end switch
   } // end method displayCorrectResponse

   public static void displayIncorrectResponse()
   {
      Random randomNumber = new Random();

      int responseNumber = randomNumber.nextInt( 4 ) + 1;

      switch ( responseNumber )
      {
         case 1:
            System.out.println( "Nee, probeer het nog een keer." );
            break;
         case 2:
            System.out.println( "Fout. Probeer het nog een keer." );
            break;
         case 3:
            System.out.println( "Geef niet op!" );
            break;
         case 4:
            System.out.println( "Nee, blijf proberen." );
      } // end switch
   } // end method displayCorrectResponse

} // end class MultiplicationLearning2
