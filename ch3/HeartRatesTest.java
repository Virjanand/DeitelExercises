// HeartRatesTest.java
// Answer to exercise 3.16 from Deitel How to program Java
import java.util.Scanner;

public class HeartRatesTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter first name: " );
      String firstName = input.nextLine();
      
      System.out.print( "Enter last name: " );
      String lastName = input.nextLine();

      System.out.print( "Enter month of birthday: " );
      int birthdayMonth = input.nextInt();

      System.out.print( "Enter day of birthday: " );
      int birthdayDay = input.nextInt();

      System.out.print( "Enter year of birthday: " );
      int birthdayYear = input.nextInt();
 
      HeartRates myHeartRate = new HeartRates( firstName, lastName,
            birthdayMonth, birthdayDay, birthdayYear );

      System.out.printf( "First name: %s.\n", 
            myHeartRate.getFirstName() );
      System.out.printf( "Last name: %s.\n",
            myHeartRate.getLastName() );

      System.out.printf( "Age: %d.\n",
            myHeartRate.calculateAge() );

      System.out.printf( "Maximum heart rate: %d.\n",
            myHeartRate.calculateMaxHeartRate() );

      System.out.printf( "Target-heart-rate: %s.\n",
            myHeartRate.calculateTargetHeartRateRange() );
   }
}
