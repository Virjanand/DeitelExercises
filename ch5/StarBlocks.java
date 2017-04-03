// StarBlocks.java
// Answer to exercise 5.27 from Deitel How to program Java
// print 5 blocks of 3 rows of 4 asterisks

public class StarBlocks
{
   public static void main( String[] args )
   {
      for ( int i = 1; i<= 5; i++ )
      {
         for ( int j = 1; j <= 3; j++ )
         {
            for ( int k = 1; k <= 4; k++ )
               System.out.print( '*' );

            System.out.println();
         } // end inner for

         System.out.println();
      } // end outer for
   } // end main
} // end class StarBlocks
