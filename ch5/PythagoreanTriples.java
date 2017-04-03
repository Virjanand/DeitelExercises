// PythagoreanTriples.java
// Answer to exercise 5.21 from Deitel How to program Java
// Display a table with all Pythagorean triples, that is
// all integers that satisfy a^2+b^2 = c^2

public class PythagoreanTriples
{
   public static void main( String[] args )
   {
      System.out.printf( "%5s %5s %10s\n", "Side1", "Side2", "Hypotenuse" );
      for ( int side1 = 1; side1 <= 500; side1++ )
         for ( int side2 = side1; side2 <= 500; side2++ )
            for ( int hypotenuse = side2; hypotenuse <= 500; hypotenuse++)
               if ( side1 * side1 + side2 * side2 == hypotenuse * hypotenuse )
                  System.out.printf( "%5d %5d %10d\n", side1, side2,
                        hypotenuse );
   } // end main
} // end class PythagoreanTriples
