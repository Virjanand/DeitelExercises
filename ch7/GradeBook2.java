// Fig. 7.18: GradeBook2.java
// GradeBook class using a two-dimensional array to store grades.

public class GradeBook2
{
   private String courseName; // course name for this GradeBook
   private int[][] grades; // two-dimensional array of student grades

   // two-argument constructor initiallizes courseName and grades array
   public GradeBook2( String name, int[][] gradesArray ) 
   {
      courseName = name; // initializes courseName
      grades = gradesArray; // store grades
   } // end two-argument GradeBook2 constructor

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
      System.out.printf( "Welcome to the Grade Book for\n%s!\n\n",
         getCourseName() );
   } // end method displayMessage

   // perform various operations on the data
   public void processGrades()
   {
      // output grades array
      outputGrades();

      // call methods getMinimum and getMaximum
      System.out.printf( "\n%s %d\n%s %d\n\n",
         "Lowest grade is in the grade book is", getMinimum(),
         "Highest grade is in the grade book is", getMaximum() );

      // output grade distribution chart of all grades on all tests
      outputBarChart();
   } // end method processGrades

   // find minimum grade
   public int getMinimum()
   {
      // assume first element of grades array is smallest
      int lowGrade = grades[ 0 ][ 0 ];

      // loop through rows of grades array
      for ( int[] studentGrades : grades )
      {
         // loop through columns of current row
         for ( int grade : studentGrades )
         {
            // if grade lower than lowGrade, assign it to lowGrade
            if ( grade < lowGrade )
               lowGrade = grade; // new lowest grade
         } // end inner for
      } // end for

      return lowGrade; // return lowest grade
   } // end method getMinimum

   // find maximum grade
   public int getMaximum()
   {
      int highGrade = grades[ 0 ][ 0 ]; // assume grades[ 0 ] is largest

      // lopp through rows of grades array
      for ( int[] studentGrades: grades )
      {
         // loop through columns of current row
         for ( int grade : studentGrades )
         {
            // if grade greater than highGrade, assign it to highGrade
            if ( grade > highGrade )
               highGrade = grade; // new highest grade
         } // end inner for
      } // end outer for

      return highGrade; // return highest grade
   } // end method getMaximum

   // determine average grade for particular set of grades
   public double getAverage(int[] setOfGrades )
   {
      int total = 0; // initial total

      // sum grades for one student
      for ( int grade : setOfGrades )
         total += grade;
      
      // return average of grades
      return (double) total / setOfGrades.length;
   } // end method getAverage

   // output bar chart displaying overall grade distribution
   public void outputBarChart()
   {
      System.out.println( "Overall grade distribution:");

      // stores frequency of grades in each range of 10 grades
      int[] frequency = new int[ 11 ];

      // for each grade in GradeBook, increment the appropriate frequency
      for ( int[] studentGrades : grades )
      {
         for ( int grade : studentGrades )
            ++frequency[ grade / 10 ];
      } // end outer for

      // for each grade frequency, print bar in chart
      for ( int count = 0; count < frequency.length; count++ )
      {
         // outer bar label ( "00-09: ", ..., "90-99: ", "100: " )
         if ( count == 10 )
            System.out.printf( "%5d: ", 100 );
         else System.out.printf( "%02d-%02d: ",
               count * 10, count * 10 + 9 );

         // print bar of asterisks
         for ( int stars = 0; stars < frequency[ count ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // start a new lline of output
      } // end outer for
   } // end method outputBarChart

   // output the contents of the grades array
   public void outputGrades()
   {
      System.out.println( "The grades are:\n" );
      System.out.print( "            " ); // align column heads

      // create a column heading for each of the tests
      for ( int test = 0; test < grades[ 0 ].length; test++ )
         System.out.printf( "Test %d  ", test + 1 );

      System.out.println( "Average" ); // student average column heading

      // create rows/columns of text representing array grades
      for ( int student = 0; student < grades.length; student++ )
      {
         System.out.printf( "Student %2d", student + 1 );

         for ( int test : grades[ student ] ) // output student's grades
            System.out.printf( "%8d", test );

         // call method getAverage to calculate student's average grade;
         // pass row of grades as the argument to geAverage
         double average = getAverage( grades[ student ] );
         System.out.printf( "%9.2f\n", average );
      } // end outer for
   } // end method outputGrades
} // end class GradeBook2
