class City {
    // instance variables are the city name and the PM value for that city
    private String name;
    private int pmValue;

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

    public static City[] loadValues() {
         // set up parallel arrays with the city names and pollution data
         // initialize each array with the information from the Student Data Set A, B, C, or D

        String[] cities = {"Miami", "New Orleans", "San Francisco", "Atlanta"};

        int[] pmValues = {48,46,25,46};

        //create an array of City objects
        City[] theC = new City[4];

        for (int i = 0; i < 4; i++)
        {
            theC[i] = new City(cities[i], pmValues[i]);
        }
        
        return theC;

    }

    public String toString() {
        return (name + " has pollution value of " + pmValue +".");
    }

}