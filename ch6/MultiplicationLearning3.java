// Exercise 6.36: MultiplicationLearning3.java
// Randomly ask multiplication questions e.g.
// "How much is 6 times 7? As the same question until
// correctly answered
import java.util.Scanner;
import java.util.Random;

public class MultiplicationLearning3
{
   public static void main( String[] args )
   {
      boolean keepPlaying = true;
      Scanner input = new Scanner( System.in );

      while ( keepPlaying )
      {
         int numberCorrect = 0;
         int numberOfQuestions = 10;

         System.out.println( "Welk level wil je spelen " +
               "(1/2/3)?" );
         int level = input.nextInt();

         for ( int questionNr = 1; questionNr <= numberOfQuestions;
              questionNr++ )
         {
            int correctAnswer = askAdditionQuestion( level );
            
            if ( input.nextInt() != correctAnswer )
               displayIncorrectResponse();
            else
            {
               displayCorrectResponse();
               numberCorrect++;
            }

         } // end for
 
         displayPerformance( numberCorrect, numberOfQuestions );

         System.out.println( "Nog een keer (y/n)?" );
         char answerContinue = input.next().charAt( 0 );

         if ( answerContinue == 'n' )
            keepPlaying = false;
     } // end while

      System.out.println( "Bedankt voor het spelen." );
   } // end main

   public static int askMultiplicationQuestion( int difficultyLevel )
   {
      Random randomNumber = new Random();
      int maxNumber = 5 * difficultyLevel;

      int number1 = randomNumber.nextInt( maxNumber ) + 1;
      int number2 = randomNumber.nextInt( maxNumber ) + 1;

      System.out.printf( "Hoeveel is %d keer %d?\n",
            number1, number2 );

      return number1 * number2;
   } // end method askMultiplicationQuestion

   public static int askAdditionQuestion( int difficultyLevel )
   {
      Random randomNumber = new Random();
      int maxNumber = 5 * difficultyLevel;

      int number1 = randomNumber.nextInt( maxNumber ) + 1;
      int number2 = randomNumber.nextInt( maxNumber ) + 1;

      System.out.printf( "Hoeveel is %d plus %d?\n",
            number1, number2 );

      return number1 + number2;
   } // end method askAdditionQuestion

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

   public static void displayPerformance( int numberCorrect,
        int totalNumber )
   {
      float percentageCorrect = ( float ) numberCorrect /
        totalNumber * 100; 
      System.out.printf( "percentage correct: %.0f.\n", percentageCorrect );
      if ( percentageCorrect < 75 )
         System.out.println( "Vraag de juf of meester om hulp." );
      else
         System.out.println( "Gefeliciteerd! Je bent klaar voor " +
               "het volgende level!" );
   } // end method displayPerformance

} // end class MultiplicationLearning3
