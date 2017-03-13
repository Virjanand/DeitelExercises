// ModifiedTrianglePrinting.java
// Answer to exercise 5.15 from Deitel How to program Java
// Print 4 types of triangles with asterisks

public class ModifiedTrianglePrinting
{
   public static void main( String[] args )
   {
      // Initialize variables
      int height = 10; // initialize height to 10 lines
      int width = 10; // initialize width to 10 * max

      // Print each triangle
      for ( int counter = 1; counter <= height; counter++ )
      {
         for ( int innerCounter = 1; innerCounter <= counter; innerCounter++ )
            System.out.print( '*' );

         for ( int spaceCounter = width - counter; spaceCounter > 0; spaceCounter-- )
            System.out.print( ' ' );

         System.out.print( "     " );

         for (int spaceCounter = width - counter; spaceCounter >= 0; spaceCounter-- )
            System.out.print( '*' );


         for ( int innerCounter = counter; innerCounter > 0; innerCounter-- )
            System.out.print( ' ' );

        System.out.print( "     " );

        for ( int innerCounter = counter; innerCounter > 0; innerCounter-- )
         {
            System.out.print( ' ' );
         }

         if ( counter <= width )
           for ( int spacesCounter = width - counter; spacesCounter >= 0; spacesCounter-- )
               System.out.print( '*' );

        System.out.print( "     " );

        if ( counter < width )
            for ( int spacesCounter = width - counter; spacesCounter > 0; spacesCounter-- )
               System.out.print( ' ' );

         for ( int innerCounter = 1; innerCounter <= counter; innerCounter++ )
            System.out.print( '*' );

         System.out.println();
      } // end outer for

  } // end main
} // end class ModifiedTrianglePrinting
