// DrawPanel4.java
// Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel4 extends JPanel
{
   // draws an X from the corners of the panel
   public void paintComponent( Graphics g )
   {
      // call paintComponent to ensure the panel displays correctly
      super.paintComponent( g );

      int width = getWidth(); // total width
      int height = getHeight(); // total height
      int stepHeight = height / 15;
      int stepWidth = width / 15;
      int counter = 1;
      int xstepStart = 0;
      int ystepStart = 0;
      int xstepEnd = stepWidth;
      int ystepEnd = height;

      while ( counter <= 15 )
      {
         g.drawLine( xstepStart, ystepStart, xstepEnd, ystepEnd );

         ystepStart += stepHeight;
         xstepEnd += stepWidth;
         counter++;
      }
   } // end method paintcomponent
} // end class DrawPanel
