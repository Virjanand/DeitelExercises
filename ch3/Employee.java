// Employee.java
// Answer to exercise 3.14 from Deitel How to program Java

public class Employee
{
   private String firstName;
   private String lastName;
   private double monthlySalary;

   public Employee( String fName, String lName, double salaryPerMonth )
   {
      firstName = fName;
      lastName = lName;
      monthlySalary = checkMonthlySalary( salaryPerMonth );
   }

   private double checkMonthlySalary( double amount )
   {
      if ( amount > 0.0 )
         return amount;

      return 0.0;
   } 

   public void setFirstName( String fname )
   {
      firstName = fname;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setLastName( String lname )
   {
      lastName = lname;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setMonthlySalary( double salaryPerMonth )
   {
      monthlySalary = checkMonthlySalary ( salaryPerMonth );
   }

   public double getMonthlySalary()
   {
      return monthlySalary;
   }

   public void displayYearlySalary()
   {
      System.out.printf( "The yearly salary of %s %s is $%.2f.\n",
	 firstName, lastName, ( monthlySalary * 12 ) );
   }

   public void giveRaise( double percentage )
   {
      setMonthlySalary ( ( percentage / 100 + 1 ) * monthlySalary );
   }
}
