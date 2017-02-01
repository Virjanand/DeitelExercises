// Date.java
// Answer to exercise 3.15 from Deitel How to program Java

public class Date
{
   private int month;
   private int day;
   private int year;

   public Date( int monthNumber, int dayNumber, int yearNumber )
   {
      month = monthNumber;
      day = dayNumber;
      year = yearNumber;
   }

   public void setMonth( int monthNumber )
   {
      month = monthNumber;
   }

   public int getMonth()
   {
      return month;
   }

   public void setDay( int dayNumber )
   {
      day = dayNumber;
   }

   public int getDay()
   {
      return day;
   }

   public void setYear( int yearNumber )
   {
      year = yearNumber;
   }

   public int getYear()
   {
      return year;
   }

   public void displayDate()
   {
      System.out.printf( "%d/%d/%d\n", getMonth(), getDay(), getYear() );
   }
}
