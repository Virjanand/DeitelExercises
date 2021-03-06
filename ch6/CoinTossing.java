// Exercise 6.29: CoinTossing.java
// Simulate coin tossing and track number of times each side appears
import java.util.Scanner;
import java.util.Random;

public class CoinTossing
{
   private enum Coin {HEADS, TAILS}

   private static int numberHeads;
   private static int numberTails;
   
   public static void main( String[] args )
   {
      displayMenu();

      Scanner input = new Scanner( System.in );

      int choice = input.nextInt();

      while ( choice != 3 )
      {
         if ( choice == 1 )
         {
            Coin coinFlipResult = flip();
            System.out.println();
            if ( coinFlipResult == Coin.HEADS )
            {
               System.out.println( "Head" );
               numberHeads++;
            }
            else
            {
               System.out.println( "Tail" );
               numberTails++;
            }
         }
         else
         {
            displayTotalHeadsAndTails();
         }

         displayMenu();
         choice = input.nextInt();

      } // end while

   } // end main

   private static void displayMenu()
   {
      System.out.println();
      System.out.println( "1. Toss Coin" );
      System.out.println( "2. Display Total Heads and Tails" );
      System.out.println( "3. Quit" );
      System.out.print( "Enter menu option: " );
   } // end method displayMenu

   private static Coin flip()
   {
      Random randomBoolean = new Random();

      if ( randomBoolean.nextBoolean() )
         return Coin.HEADS;
      else
         return Coin.TAILS;
   } // end method flip

   private static void displayTotalHeadsAndTails()
   {
      System.out.println();
      System.out.printf( "%d number of heads\n", numberHeads );
      System.out.printf( "%d number of tails\n", numberTails );
   } // end method displayTotalHeadsAndTails

} // end class CoinTossing
