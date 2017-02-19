// SalaryCalculator.java
// Answer to exercise 4.20 from Deitel How to program Java
// Calculate gross salary for 3 employees with overtime
import java.util.Scanner;

public class SalaryCalculator
{
   public static void main( String[] args )
   {
      // Initialize constants
      int workWeekHours = 40;
      // Initialize varialbes
      int hoursWorked = 0; // Initialize hours worked to 0
      double hourlyRate = 0.0; // Initialize hourly rate to 0.0
      double overtimeRate = 0.5; // Initialize overtime rate to 0.5
      double grossPay = 0.0; // Initialize gross pay to 0.0
      int counter = 1; // Initialize counter to 1
      
      Scanner input = new Scanner( System.in ); // initialize scanner

      // Input the hourly rate and hours worked for 3 employees
      // While counter is smaller than or equal to 3
      while ( counter <= 3 )
      {
         // Prompt hours worked
         System.out.print( "Hours worked: " );
         // Input number of hours worked
         hoursWorked = input.nextInt();
         // Prompt hourly rate
         System.out.print( "Hourly rate: " );
         // Input hourly rate
         hourlyRate = input.nextDouble();
         
         // Determine and display the gross salary
         // Calculate gross salary
         grossPay = hoursWorked * hourlyRate;

         if ( hoursWorked > workWeekHours )
         {
            hoursWorked -= workWeekHours;
            grossPay += hoursWorked * hourlyRate * overtimeRate;
         }
         // Display gross salary
         System.out.printf( "Gross salary for employee %d: %.2f\n",
               counter, grossPay );
         // increase counter by 1
         ++counter;
      }     
   }
}
