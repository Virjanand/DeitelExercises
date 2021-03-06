// GradeBook.java
// Class declaration with one method.

public class GradeBook
{
   private String courseName; // course name for this GradeBook

   // constructor initiallizes courseName with String argument
   public GradeBook( String name ) // constructor name is class name
   {
      courseName = name; // initializes courseName
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

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // calls getCourseName to get the name of
      // the course this GradeBook represents
      System.out.printf( "Welcome to the Grade Book for\n%s!\n",
         getCourseName() );
   } // end method displayMessage
} // end class GradeBook
