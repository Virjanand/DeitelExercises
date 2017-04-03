// DateTest.java
// Answer to exercise 3.15 from Deitel How to program Java

public class DateTest
{
   public static void main( String[] args )
   {
      Date myDate = new Date( 1, 1, 2017 );

      myDate.displayDate();

      myDate.setMonth( 4 );
      myDate.setDay( 24 );
      myDate.setYear( 1980 );

      myDate.displayDate();
   }
}
