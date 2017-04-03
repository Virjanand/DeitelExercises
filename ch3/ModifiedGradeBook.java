// ModifiedGradeBook.java
// Answer to exercise 3.11 from Deitel How to program Java

public class ModifiedGradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName;

   // constructor initiallizes courseName with String argument
   public ModifiedGradeBook( String nameOfCourse, 
      String nameOfInstructor ) // constructor name is class name
   {
      courseName = nameOfCourse; // initializes courseName
      instructorName = nameOfInstructor; // initializes instructorName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // method to set the instructor name
   public void setInstructorName( String name )
   {
      instructorName = name; // store instructor name
   } // end method setInstructorName

   // method to retrieve the instructor name
   public String getInstructorName()
   {
      return instructorName;
   } // end getInstructorName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // calls getCourseName to get the name of
      // the course this GradeBook represents
      System.out.printf( "Welcome to the Grade Book for\n%s!\n",
         getCourseName() );
      System.out.printf( "This course is presented by:\n%s\n\n",
         getInstructorName() );
   } // end method displayMessage
} // end class GradeBook
