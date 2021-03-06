// Ex. 6.1: DrawBullsEye.java
// Draw a bull's eye that alternates between two random colors
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;

public class DrawBullsEye extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // initialize variables
      // initialize random number generator
      Random randomNumber = new Random();
      // Initialize maxIntensity for random color
      int maxIntensity = 255;
      // create 2 random colors to alternate between
      Color color1 = new Color( // initialize random color 1
            randomNumber.nextInt( maxIntensity ), 
            randomNumber.nextInt( maxIntensity ),
            randomNumber.nextInt( maxIntensity ) );
      Color color2 = new Color( // initialize random color 2
            randomNumber.nextInt( maxIntensity ), 
            randomNumber.nextInt( maxIntensity ),
            randomNumber.nextInt( maxIntensity ) );

      // get width and height of frame
      // determine center
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;

      // draw bull's eye consisting of 5 circles
      // for loop 5 times
      for (int counter = 1; counter <= 5; counter++)
      {
        // determine radius
        int radius = 120 - counter * 20;
         if ( counter % 2 == 0 )
            g.setColor( color1 );
         else
            g.setColor( color2 );
         // draw oval
         g.fillOval( xCenter - radius / 2 , yCenter - radius / 2,
              radius, radius );
      }
   } // end method paintComponent

} // end class DrawBullsEye
