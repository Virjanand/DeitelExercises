// Exercise 6.2: RandomShapesTest.java
// Test RandomShapes.java
import javax.swing.JFrame;

public class RandomShapesTest
{
   public static void main( String[] args )
   {
      JFrame application = new JFrame();
      RandomShapes randomShapesPanel = new RandomShapes();

      application.add( randomShapesPanel );
      application.setSize( 300, 300 );
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setVisible( true );
   } // end main
} // end class RandomShapesTest
