// Fig. 7.22: ArrayManipulations.java
// Arrays class methods and System.arraycopy.
import java.util.Arrays;

public class ArrayManipulations
{
   public static void main( String[] args )
   {
      // sort doubleArray into ascending order
      double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4 };
      Arrays.sort( doubleArray );
      System.out.printf( "\ndoubleArray: " );

      for ( double value: doubleArray )
         System.out.printf( "%.1f ", value );

      // fill 10-element array with 7s
      int[] filledIntArray = new int[ 10 ];
      Arrays.fill( filledIntArray, 7 );
      displayArray( filledIntArray, "filledIntArray" );

      // copy array intArray into array intArrayCopy
      int[] intArray = { 1, 2, 3, 4, 5, 6 };
      int[] intArrayCopy = new int[ intArray.length ];
      
   } // end main
} // end class ArrayManipulations
