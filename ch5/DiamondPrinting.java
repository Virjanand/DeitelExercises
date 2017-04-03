// DiamondPrinting.java
// Answer to exercise 5.24 from Deitel How to program Java
// print a diamond from asterisks (*)

public class DiamondPrinting
{
   int numberOfRows;
   int halfway; 

   public DiamondPrinting( int size )
   {
      numberOfRows = size;
      halfway = numberOfRows / 2 + 1;
   } // end constructor

   public void printDiamond()
   {
      for ( int row = 1; row <= halfway; row++ )
      {
         printRow( row );
      } // end for
 
      for ( int row = halfway - 1; row >= 1; row-- )
      {
         printRow( row );
      } // end for
  } // end method printDiamond

  private void printRow( int rowNumber )
  {
     for ( int spaces = 1; spaces <= halfway - rowNumber; spaces++ )
        System.out.print( ' ' );

     for (int asterisks = 1; asterisks <= rowNumber * 2 - 1; asterisks++ )
        System.out.print( '*' );

     System.out.println();

  } // end method printRow

} // end class DiamondPrinting
