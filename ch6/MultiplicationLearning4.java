// Exercise 6.39: MultiplicationLearning4.java
// Randomly ask math questions e.g.
// "How much is 6 times 7? As the same question until
// correctly answered
import java.util.Scanner;
import java.util.Random;

public class MultiplicationLearning4
{
   public enum mathType
   {
      ADD, SUBTRACT, MULTIPLY, DIVIDE, RANDOM 
   }

   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      // 1: addition, 2: subtraction, 3: multiplication,
      // 4: division, 5: random mix
      boolean keepPlaying = true;

      while ( keepPlaying )
      {
         int numberCorrect = 0;
         int numberOfQuestions = 10;

         System.out.println( "Welk level wil je spelen " +
               "(1/2/3)?" );
         int level = input.nextInt();

         mathType questionType = askQuestionType();

         for ( int questionNr = 1; questionNr <= numberOfQuestions;
              questionNr++ )
         {
            int correctAnswer = 0;

           switch ( questionType )
           {
               case ADD:
                  correctAnswer = askAdditionQuestion( level );
                  break;
              case SUBTRACT:
                  correctAnswer = askSubtractionQuestion( level );
                  break;
              case MULTIPLY:
                  correctAnswer = askMultiplicationQuestion( level );
                  break;
              case DIVIDE:
                  correctAnswer = askDivideQuestion( level );
                  break;
              case RANDOM:
                  correctAnswer = askRandomQuestion( level );
           }
            
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

   public static mathType askQuestionType()
   {
      Scanner input = new Scanner( System.in );

      System.out.println( "Wat wil je doen: " );
      System.out.println( "1. Optellen " );
      System.out.println( "2. Aftrekken " );
      System.out.println( "3. Keer " );
      System.out.println( "4. Delen " );
      System.out.println( "5. Alles door elkaar " );
      int questionType = input.nextInt();

      switch ( questionType )
      {
         case 1: 
            return mathType.ADD;
         case 2:
            return mathType.SUBTRACT;
         case 3:
            return mathType.MULTIPLY;
         case 4:
            return mathType.DIVIDE;
         case 5:
      } // end switch

      return mathType.RANDOM;
   } // end method askQuestionType

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

   public static int askSubtractionQuestion( int difficultyLevel )
   {
      Random randomNumber = new Random();
      int maxNumber = 5 * difficultyLevel;

      int number1 = randomNumber.nextInt( maxNumber ) + 1;
      int number2 = randomNumber.nextInt( maxNumber ) + 1;
      
      if ( number1 > number2 )
      {
         System.out.printf( "Hoeveel is %d min %d?\n",
            number1, number2 );
         return number1 - number2;
      }
      else
      {
         System.out.printf( "Hoveel is %d min %d?\n",
            number2, number1 );
         return number2 - number1;
      }
   } // end method askSubtractQuestion

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

   public static int askDivideQuestion( int difficultyLevel )
   {
      Random randomNumber = new Random();
      int maxNumber = 5 * difficultyLevel;

      int number1 = randomNumber.nextInt( maxNumber ) + 1;
      int number2 = randomNumber.nextInt( maxNumber ) + 1;
      int multiplyNumber = number1 * number2;

      System.out.printf( "Hoeveel is %d gedeeld door %d?\n",
            multiplyNumber, number2 );

      return number1;
   } // end method askDivideQuestion

   public static int askRandomQuestion( int difficultyLevel )
   {
      Random randomNumber = new Random();

      int questionTypeNumber = randomNumber.nextInt( 4 ) + 1;

      int result = 0;

      switch ( questionTypeNumber )
      {
         case 1:
            result = askAdditionQuestion( difficultyLevel );
            break;
         case 2:
            result = askSubtractionQuestion( difficultyLevel );
            break;
         case 3:
            result = askMultiplicationQuestion( difficultyLevel );
            break;
         case 4:
            result = askDivideQuestion( difficultyLevel );
      } // end switch

      return result;
   } // end method askRandomQuestion


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

} // end class MultiplicationLearning4
