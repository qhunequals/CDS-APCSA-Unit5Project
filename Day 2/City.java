import java.util.ArrayList;

// instance variables are the city name and the PM value for that city

class City {
    String name;
    int pmValue;

    public City() {
        name = "no name";
        pmValue = 0;
    }

    public City(String nm, int pm) {
        name = nm;
        pmValue = pm;
    }

    public String getName() {
        return name;
    }

    public int getPMValue() {
        return pmValue;
    }

    public static ArrayList<City> loadValues() {
         // set up parallel arrays with the city names and pollution data
          // initialize each array with the information from the Student Data Set A, B, C, or D
      String[] cities = {"Miami", "New Orleans", "San Francisco", "Atlanta"};

      int[] pmValues = {48,46,25,46,};

      //create an array of City objects
      ArrayList<City> theC = new ArrayList<City>();

      for (int i = 0; i < 4; i++)
      {
        theC.add(new City(cities[i], pmValues[i]));
      }
      
      return theC;

    }

    public String toString() {
        return (name + " has pollution value of " + pmValue +".");
    }

}