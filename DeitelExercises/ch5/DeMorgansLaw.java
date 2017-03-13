// DeMorgansLaw.java
// Answer to exercise 5.23 of Deitel How to program Java
// Use De Morgan's law to check equivalent logical expressions

public class DeMorgansLaw
{
   public static void main( String[] args )
   {
      int x = 4;
      int y = 8;
      System.out.printf( "%s is equivalent to %s: %b and %b",
            "!( x < 5 ) && !( y >= 7 )", "!( x < 5 || y >= 7 )",
            !( x < 5 ) && !( y >= 7 ), !( x < 5 || y >= 7 ) );

      System.out.println();

      int a = 4;
      int b = 5;
      int g = 6;
      System.out.printf( "%s is equivalent to %s: %b and %b",
            "!( a == b ) || !( g != 5 )", "!( a == b && g != 5 )",
            !( a == b ) || !( g != 5 ), !( a == b && g != 5 ) );
      
      System.out.println();
      System.out.printf( "%s is equivalent to %s: %b and %b",
           "!( ( x <= 8 ) && ( y > 4 ) )", "!( x <= 8 ) || !( y > 4 )",
            !( ( x <= 8 ) && ( y > 4 ) ), !( x <= 8 ) || !( y > 4 ) );

      System.out.println();
      int i = 5;
      int j = 4;
      System.out.printf( "%s is equivalent to %s: %b and %b",
           "!( ( i > 4 ) || ( j <= 6 ) )", "!( i > 4 ) && !( j <= 6 )",
            !( ( i > 4 ) || ( j <= 6 ) ), !( i > 4 ) && !( j <= 6 ) );

  } // end main
} // end class DeMorgansLaw
