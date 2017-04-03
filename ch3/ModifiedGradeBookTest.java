// ModifiedGradeBookTest.java
// Answer to exercise 3.11 from Deitel How to program Java
import java.util.Scanner;

public class ModifiedGradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   {
      // create GradeBook object
      ModifiedGradeBook gradeBook1 = new ModifiedGradeBook(
         "CS101 Introduction to Java Programming" ,
	 "John Snow" );
      ModifiedGradeBook gradeBook2 = new ModifiedGradeBook(
         "CS102 Data Structures in Java",
	 "Mr. T" );

      gradeBook1.displayMessage();
      gradeBook2.displayMessage();
   } // end main
} // end class GradeBookTest
