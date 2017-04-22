// Exercise 6.2: RandomShapes.java
// Create 10 ovals or rectangles with random color, shape and position
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RandomShapes extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // initialize height and width of panel
      int panelHeight = getHeight();
      int panelWidth = getWidth();

      // initialize randomNumber
      Random randomNumber = new Random();
      
      // for loop 10 times
      for (int counter = 1; counter <= 10; counter++)
      {
         // set location shape
         int x = randomNumber.nextInt( panelWidth );
         int y = randomNumber.nextInt( panelHeight );

         // set size shape
         int shapeHeight = randomNumber.nextInt( panelHeight / 2 );
         int shapeWidth = randomNumber.nextInt( panelWidth / 2 );
         // set color shape
         int maxIntensity = 255;
         Color color = new Color( randomNumber.nextInt( maxIntensity ),
               randomNumber.nextInt( maxIntensity ),
               randomNumber.nextInt( maxIntensity ) );
         g.setColor( color );
         // draw oval or rectangle
         if ( randomNumber.nextBoolean() )
            g.fillOval( x, y, shapeWidth, shapeHeight );
         else
            g.fillRect( x, y, shapeWidth, shapeHeight );
      }
   } // end method paintComponent
} // end class RandomShapes
