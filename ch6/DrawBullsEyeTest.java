// Ex. 6.1: DrawBullsEyeTest.java
// Test DrawBullsEye application
import javax.swing.JFrame;

public class DrawBullsEyeTest
{
   public static void main( String[] args )
   {
      DrawBullsEye bullsEye = new DrawBullsEye();

      JFrame application = new JFrame();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( bullsEye );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class DrawBullsEyeTest
