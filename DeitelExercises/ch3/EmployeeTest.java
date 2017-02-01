// EmployeeTest.java
// Answer to exercise 3.14 from Deitel How to program Java
import java.util.Scanner;

public class EmployeeTest
{
   public static void main( String[] args )
   {
      Employee employee1 = new Employee( "Bob", "Marley", 3000.00 );
      Employee employee2 = new Employee( "Mike", "Miller", 1000.00 );

      employee1.displayYearlySalary();
      employee2.displayYearlySalary();

      System.out.println( "\nGiving raises to all employees!\n" );

      employee1.giveRaise( 10.0 );
      employee2.giveRaise( 10.0 );

      employee1.displayYearlySalary();
      employee2.displayYearlySalary();
     
   }
}
