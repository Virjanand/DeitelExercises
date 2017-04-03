// GlobalWarmingQuiz.java
// Answer to exercise 5.30 from Deitel How to program Java
// A quiz on global warming (5 multiple choice questions with 4 choices)
import java.util.Scanner;

public class GlobalWarmingQuiz
{
   public static void main( String[] args )
   {
      // Initialize variables
      int totalCorrect = 0; // initialize totalCorrect
      Scanner input = new Scanner( System.in ); // initialize input
      char answer; // declare answer

      // For loop 5 times
         // Ask question
         // Get answer
         // Keep track of number correct
      for ( int i = 1; i <= 5; i++ )
      {
         switch ( i )
         {
            case 1:
               System.out.println( "1) What is the Hockey stick graph?" );
               System.out.println( "A) A graph of the number of " + 
                     "hockey sticks sold." );
               System.out.println( "B) A graph made from hockey sticks." );
               System.out.println( "C) A graph showing the rapid increase " +
                     "of temperature the last century." );
               System.out.println( "D) A scare tactic of the progressives " +
                     "to make you feel bad about buying a hummer." );
               answer = input.next().charAt(0);
               if (answer == 'C' || answer == 'c')
                  totalCorrect++;
               break;
            case 2:
               System.out.println( "2) What is currently the main" +
                     "counter argument for climate change deniers?" );
               System.out.println( "A) There is no global warming." );
               System.out.println( "B) Global warming is not caused by man" );
               System.out.println( "C) God wouldn't do this to us" );
               System.out.println( "D) It's a scare tactic." ); 
               answer = input.next().charAt(0);
               if (answer == 'B' || answer == 'b')
                  totalCorrect++;
               break;
            case 3:
               System.out.println( "3) Who will suffer the most?" );
               System.out.println( "A) The poor" );
               System.out.println( "B) The rich" ); 
               System.out.println( "C) The people with big cars" );
               System.out.println( "D) The liberals." );
               answer = input.next().charAt(0);
               if (answer == 'A' || answer == 'a')
                  totalCorrect++;
               break;
            case 4:
               System.out.println( "What is the Hockey stick graph?" );
               System.out.println( "A) A graph of the number of " + 
                     "hockey sticks sold." );
               System.out.println( "B) A graph made from hockey sticks." );
               System.out.println( "C) A graph showing the rapid increase " +
                     "of temperature the last century." );
               System.out.println( "D) A scare tactic of the progressives " +
                     "to make you feel bad about buying a hummer." );
               answer = input.next().charAt(0);
               if (answer == 'C' || answer == 'c')
                  totalCorrect++;
               break;
            case 5:
               System.out.println( "What is the Hockey stick graph?" );
               System.out.println( "A) A graph of the number of " + 
                     "hockey sticks sold." );
               System.out.println( "B) A graph made from hockey sticks." );
               System.out.println( "C) A graph showing the rapid increase " +
                     "of temperature the last century." );
               System.out.println( "D) A scare tactic of the progressives " +
                     "to make you feel bad about buying a hummer." );
               answer = input.next().charAt(0);
               if (answer == 'C' || answer == 'c')
                  totalCorrect++;
               break;

         } // end switch
      } // end for

      // Display result
      // Use switch:
         // five -> Excellent
         // four -> Very good
         // three- -> Time to brush up on your knowledge of global warming
      switch( totalCorrect )
      {
         case 5:
            System.out.println( "Excellent" );
            break;
         case 4:
            System.out.println( "Very good" );
            break;
         case 3:
         case 2:
         case 1:
            System.out.println( "Time to brush up on your knowledge of " +
                  "global warming" );
      }
      System.out.printf( "Total correct answers: %d", totalCorrect );
   } // end main
} // end class GlobalWarmingQuiz
