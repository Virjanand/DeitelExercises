// TwelveDaysOfChristmas.java
// Answer to exercise 5.29 from Deitel How to program Java
// print the lyrics of 'The twelve days of Christmas' song using loops
// and switch

public class TwelveDaysOfChristmas
{
   public static void main( String[] args )
   {
      String gifts = "";
      
      for ( int day = 1; day <= 12; day++ )
      {
         System.out.print( "On the " );

         switch ( day )
         {
            case 1:
               System.out.print( "First " );
               break;
            case 2:
               System.out.print( "Second " );
               break;
            case 3:
               System.out.print( "Third " );
               break;
            case 4:
               System.out.print( "Fourth " );
               break;
            case 5:
               System.out.print( "Fifth " );
               break;
            case 6:
               System.out.print( "Sixth " );
               break;
            case 7:
               System.out.print( "Seventh " );
               break;
            case 8:
               System.out.print( "Eighth " );
               break;
            case 9:
               System.out.print( "Ninth " );
               break;
            case 10:
               System.out.print( "Tenth " );
               break;
            case 11:
               System.out.print( "Eleventh " );
               break;
            case 12:
               System.out.print( "Twelfth " );

         } // end switch

         System.out.print( "day of Christmas my true love sent to me\n" );

         switch ( day )
         {
            case 12:
               System.out.print( "Twelve Drummers Drumming\n" );
            case 11:
               System.out.print( "Eleven Pipers Piping\n" );
            case 10:
               System.out.print( "Ten Lords a-Leaping\n" );
            case 9:
               System.out.print( "Nine Ladies Dansing\n" );
            case 8:
               System.out.print( "Eight Maids a-Milking\n" );
            case 7:
               System.out.print( "Seven Swans a-Swimming\n" );
            case 6:
               System.out.print( "Six Geese a-Laying\n" );
            case 5:
               System.out.print( "Five Gold Rings\n" );
            case 4:
               System.out.print( "Four Calling Birds\n" );
            case 3:
               System.out.print( "Three French Hens\n" );
            case 2:
               System.out.print( "Two Turtle Doves\nand " );
            case 1:
               System.out.print( "a Partridge in a Pear Tree.\n" );
         } // end switch

         System.out.println();
      } // end for
   } // end main
} // end class TwelveDaysOfChristmas
