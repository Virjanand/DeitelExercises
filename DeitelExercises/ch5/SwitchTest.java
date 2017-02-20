// SwitchTest.java
// Try out switch as shown in question 5.9b in Deitel How to program Java

public class SwitchTest
{
   public static void main( String[] args )
   {
      int value = 5;
      switch ( value % 2 )
      {
         case 0:
            System.out.println( "Even integer" );
            break;
         case 1:
            System.out.println( "Odd integer" );
            break;
      } // end switch
   } // end main
} // end class SwitchTest
