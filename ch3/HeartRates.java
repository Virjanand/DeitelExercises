// HeartRates.java
// Anser to exercise 3.16 from Deitel How to program Java

public class HeartRates
{
   String firstName;
   String lastName;
   int birthdayMonth;
   int birthdayDay;
   int birthdayYear;

   public HeartRates( String fName, String lName, int bdayMonth,
      int bdayDay, int bDayYear )
   {
      firstName = fName;
      lastName = lName;
      birthdayMonth = bdayMonth;
      birthdayDay = bdayDay;
      birthdayYear = bDayYear;
   }

   public void setFirstName( String fName )
   {
      firstName = fName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setLastName( String lName )
   {
      lastName = lName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setBirthdayMonth( int month )
   {
      birthdayMonth = month;
   }

   public int getBirthdayMonth()
   {
      return birthdayMonth;
   }

   public void setBirthdayDay( int day )
   {
      birthdayDay = day;
   }

   public int getBirthdayDay()
   {
      return birthdayDay;
   }

   public void setBirthdayYear( int year )
   {
      birthdayYear = year;
   }

   public int getBirthdayYear()
   {
      return birthdayYear;
   }

   public int calculateAge()
   {
      int todayDay = 26;
      int todayMonth = 1;
      int todayYear = 2017;

      int age = todayYear - getBirthdayYear();

      if ( getBirthdayMonth() <= todayMonth )
        if ( getBirthdayDay() <= todayDay ) 
          return age;

      return age - 1;
   }

   public int calculateMaxHeartRate()
   {
      int age = calculateAge();
      int topHeartRate = 220;
      int maxHeartRate = topHeartRate - age;

      return maxHeartRate;
   }

   public String calculateTargetHeartRateRange()
   {
      double lowerFraction = 0.50;
      double upperFraction = 0.85;

      double maxHeartRate = calculateMaxHeartRate();
      double lowerHeartRate = lowerFraction * maxHeartRate;
      double upperHeartRate = upperFraction * maxHeartRate;

      String range = String.format( "%.0f - %.0f",
            lowerHeartRate, upperHeartRate );

      return range;
   }
}
