// Exercise 6.34: BinaryOctalHexadecimalTable.java
// Display a dable of binary, octal and hexidecimal values of 1 to 256

public class BinaryOctalHexadecimalTable
{
   public static void main( String[] args )
   {
      for ( int counter = 1; counter <= 256; counter++ )
      {
         System.out.printf( "%5d %15s %10s %10s\n", 
               counter, 
               convertToBinaryString( counter ),
               convertToOctalString( counter ),
               convertToHexidecimalString( counter ) );
      } // end for
   } // end main

   public static String convertToBinaryString( int number )
   {
      String result = "";

      while ( number >= 1 )
      {
         int remainder = number % 2;
         number = number / 2;
         result = remainder + result;
      } // end while

      return result;
   } // end method convertToBinaryString

   public static String convertToOctalString( int number )
   {
      String result = "";

      while ( number >= 1 )
      {
         int remainder = number % 8;
         number = number / 8;
         result = remainder + result;
      } // end while

      result = "0o" + result;
      return result;
   } // end method convertToOctalString

   public static String convertToHexidecimalString( int number )
   {
      String result = "";

      while ( number >= 1 )
      {
         int remainder = number % 16;
         number = number / 16;
         switch ( remainder ) 
         {
            case 15:
               result = "F" + result;
               break;
            case 14:
               result = "E" + result;
               break;
            case 13:
               result = "D" + result;
               break;
            case 12:
               result = "C" + result;
               break;
            case 11:
               result = "B" + result;
               break;
            case 10:
               result = "A" + result;
               break;
            default:
               result = remainder + result;
         } // end switch
      } // end while

      result = "0x" + result;
      return result;
   } // end method convertToOctalString

} // end class BinaryOctalHexadecimalTable
