// DrawPanel3Test.java
// Application to display a DrawPanel.
import javax.swing.JFrame;

public class DrawPanel3Test
{
   public static void main( String[] args )
   {
      // create a panel that contains our drawing
      DrawPanel3 panel = new DrawPanel3();

      // create a new frame to hold the panel
      JFrame application = new JFrame();

      // set the fram to exit when it is closed
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      application.add( panel ); // add the panel to the frame
      application.setSize( 250, 250 ); // set the size of the frame
      application.setVisible( true ); // make the frame visible
   } // end main
} // end class DrawPanelTest