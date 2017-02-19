// WorldPopulationGrowth.java
// Answer to exercise 4.39 from Deitel How to program Java
// Display population numbers for next 75 years in table

public class WorldPopulationGrowth
{
   public static void main( String[] args )
   {
      // Initialize variables
      double populationSize = 7.4; // Initialize populationSize to 7.4 (billion)
      double populationGrowth = 0.0111; // Initialize populationGrowht to 0.0111 (1.11 %)
      double populationIncrease; // Initialize populationIncrease
      int year = 2017; // Initialize year to 2017
      int counter = 1; // Initialize counter to 1
      int numberOfYears = 75; // Initialize numberOfYears to 75

      // Calculate population size and growth
      // Display population size and growth
      // While counter is smaller than or equal to numberOfYears
      while ( counter <= numberOfYears )
      {
         // calculate the population increase in the year
         populationIncrease = populationSize * populationGrowth;
         // calculate populationSize at the end of the year
         populationSize += populationIncrease;
        // display line with year populationSize and population increase
        System.out.printf( "%-6d%-4.2f  %-4.2f\n", 
              year, populationSize, populationIncrease );
        ++year;
        ++counter;
      }
   } // end main
} // end class WorldPopulationGrowth
