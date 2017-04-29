// Exercise 6.30: GuessTheNumber.java
// Guess a number between 1 and 1000, 
// with too high, too low feedback
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber
{
   public static void main( String[] args )
   {
      Random randomNumber = new Random();
      
      Scanner input = new Scanner( System.in );

      boolean playAgain = true;
      boolean gameWon = false;

      while ( playAgain )
      {

         int numberToBeGuessed = randomNumber.nextInt( 1000 ) + 1;

         while ( !gameWon )
         {
            System.out.print( "Guess a number between 1 and 1000: " );
            int guess = input.nextInt();

            if ( guess > numberToBeGuessed )
               System.out.println( "Too high. Try again." );
            else if ( guess < numberToBeGuessed )
               System.out.println( "Too low. Try again." );
            else
            {
               System.out.println( "Congratulations. You guessed the number!" );
               gameWon = true;
            }
         } // end inner while

         System.out.print( "Do you want to play again (y/n)?" );
         char playAgainAnswer = input.next().charAt( 0 );

         if ( playAgainAnswer == 'n' )
            playAgain = false;

         gameWon = false;
      } // end outer while
   } // end main
} // end class GuessTheNumber
