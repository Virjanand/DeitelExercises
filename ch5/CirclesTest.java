// CirclesTest.java
// Answer to exercise 5.1 from Deitel How to program Java
// Test class Circles
import javax.swing.JFrame;

public class CirclesTest
{
   public static void main( String[] args )
   {
      Circles panel = new Circles();

      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 400, 400 );
      application.setVisible( true );
   } // end main
} // end class CirclesTest
