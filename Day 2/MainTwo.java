// Air Quality Analyzer 2    A+CR
import java.util.ArrayList;

class MainTwo {

  // make sure to pass the correct arguments when calling the methods


  public static void main(String[] args) {
    //instantiate 1 ArrayList of City objects and initialize the ArrayList with City objects using the loadValues() method in the City class

	ArrayList<CityTwo> cities = new ArrayList<CityTwo>();
	cities = CityTwo.loadValues();

    //print all the cities and their PM2.5 level

	for(CityTwo c: cities){
		System.out.println(c);
	}

    //call the findMax method and print all the cities (using a loop) with the worst air quality

	for(CityTwo c: cities){
		if(c.getPMValue() == findMax(cities)){
			System.out.println("\n\nCities with the most pollution:\n" + c);
		}
	}


    //call the findMin method and print all the cities (using a loop) with the best air quality

	for(CityTwo c: cities){
		if(c.getPMValue() == findMin(cities)){
			System.out.println("\n\nCities with the least pollution:\n" + c);
		}
	}



  } //end of main method



	// The method below should find the maximum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the maxinum pollution value
	public static int findMax(ArrayList<CityTwo> c) {
		int max = 0;  
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() > max){
			  max = c.get(i).getPMValue();
			}
		  }
		  return max;
	}

  // The method below should find the minimum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the minimum pollution value
	public static int findMin(ArrayList<CityTwo> c) {
		int min = c.get(0).getPMValue();  
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() < min){
			  min = c.get(i).getPMValue();
			}
		  }
		  return min;
	}

 
}