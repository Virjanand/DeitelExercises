// DrawPanel5.java
// Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel5 extends JPanel
{
   private int width;
   private int height;
   private int stepHeight;
   private int stepWidth;

   // draws an X from the corners of the panel
   public void paintComponent( Graphics g )
   {
      // call paintComponent to ensure the panel displays correctly
      super.paintComponent( g );

      width = getWidth(); // total width
      height = getHeight(); // total height
      stepHeight = height / 15;
      stepWidth = width / 15;

      // Lines from top left corner
      drawLinesFromCorner( g, 0, 0 );
      // Lines from top right corner
      drawLinesFromCorner( g, width, 0);
      // Lines from bottom right corner
      drawLinesFromCorner( g, width, height );
      // Lines from bottom left corner
      drawLinesFromCorner( g, 0, height );
  } // end method paintcomponent

   public void drawLinesFromCorner( Graphics g, int xCorner, int yCorner )
   {
      // top left corner (0, 0): xstepStart = 0, ystepStart = 0(+)
      //    xstepEnd = stepWidth(+), ystepEnd = height
      // top right corner (width, 0): xstepStart = width, ystepStart = 0(+)
      //    xstepEnd = width - stepWidth(-), ystepEnd = height
      // bottom right corner (width, height): xstepStart = width,
      //    ystepStart = height(-), xstepEnd = width - stepWidth(-), 
      //    ystepEnd = 0
      // bottom left corner (0, height): xstepStart = 0, ystepStart = height(-)
      //    xstepEnd = stepWidth(+), ystepEnd = 0
      int counter = 1;
      int yStart = yCorner;
      int stepWidthLocal = stepWidth;
      int stepHeightLocal = stepHeight;
      int xEnd = stepWidth;
      int yEnd = height;

      if ( xCorner == width )
      {
         xEnd = width - stepWidth;
         stepWidthLocal *= -1; 
      }
      if (yCorner == height )
      {
         yEnd = 0;
         stepHeightLocal *= -1;
      }
      while ( counter <=15 )
      {
         g.drawLine( xCorner, yStart, xEnd, yEnd );

         xEnd += stepWidthLocal;
         yStart += stepHeightLocal;
         counter++;
      }
  }
} // end class DrawPanel
