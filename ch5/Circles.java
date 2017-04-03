// Circles.java
// Answer to exercise 5.1 from Deitel How to program Java
// Draw 12 concentric circles in the center of a JPanel
import java.awt.Graphics;
import javax.swing.JPanel;

public class Circles extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;

      int radius = 10;
      int counter = 1;
      int diameter;
      int numberOfCircles = 12;
      int radiusIncrease = 10;

      while ( counter <= numberOfCircles )
      {
         diameter = 2 * radius;
         g.drawOval( xCenter - radius, yCenter - radius, 
            diameter, diameter );
         radius += radiusIncrease;
         ++counter;
      }
   } // end method paintcomponent
} // end class Circles
