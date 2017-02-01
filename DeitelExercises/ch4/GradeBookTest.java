// GradeBookTest.java
// Creating a GradeBook object and calling its determineClassAverage method.

public class GradeBookTest
{
   public static void main( String[] args )
   {
      // create GradeBook object and
      // pass course name to constructor
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage(); // display welcome message
      myGradeBook.determineClassAverage(); // find average of 10 grades
   } // end main
} // end class GradeBookTest
