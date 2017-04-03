// HealthProfile.java
// Anser to exercise 3.17 from Deitel How to program Java

public class HealthProfile
{
   private String firstName;
   private String lastName;
   private String gender;
   private int birthdayMonth;
   private int birthdayDay;
   private int birthdayYear;
   private double weight;
   private double height;

   public HealthProfile( String fName, String lName, String genderInput,
        int bdayMonth, int bdayDay, int bDayYear,
        double weightInput, double heightInput )
   {
      firstName = fName;
      lastName = lName;
      gender = genderInput;
      birthdayMonth = bdayMonth;
      birthdayDay = bdayDay;
      birthdayYear = bDayYear;
      weight = weightInput;
      height = heightInput;
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

   public void setGender( String genderInput )
   {
      gender = genderInput;
   }

   public String getGender()
   {
      return gender;
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

   public void setWeight( double weightInput )
   {
      weight = weightInput;
   }

   public double getWeight()
   {
      return weight;
   }

   public void setHeight( double heightInput )
   {
      height = heightInput;
   }

   public double getHeight()
   {
      return height;
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

   public double calculateBMI()
   {
      double bmi = weight / ( height * height );

      return bmi;
   }


   public void printBMITable()
   {
      System.out.print( "\n\n" );
      System.out.println( "BMI VALUES" );
      System.out.println( "Underweight:  less than 18.5" );
      System.out.println( "Normal:       between 18.5 and 24.9" );
      System.out.println( "Overweight:   between 25 and 29.9" );
      System.out.println( "Obese:        30 or greater" );
   }
}
