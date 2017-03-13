// BarChartPrintingGUITest.java
// Answer to exercise 5.16 from Deitel How to program Java
// Test BarChartPrintingGUI class
import javax.swing.JFrame;

public class BarChartPrintingGUITest
{
   public static void main( String[] args )
   {
      BarChartPrintingGUI barChart = new BarChartPrintingGUI();
      barChart.input5Integers();

      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      application.add( barChart );
      application.setSize( 300, 300 );
      application.setVisible( true );
   } // end main
} // end class BarChartPrintingGUITest
