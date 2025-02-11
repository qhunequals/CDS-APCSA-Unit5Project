//Air Quality Analyzer 3               A+CR
import java.lang.reflect.Array;
import java.util.ArrayList;

//Use your assigned data set A,B,C, or D

class Main {

  public static void main(String[] args) {

    //create an array for the city names
   
    String[] cityNames = {"Columbo, Sri Lanka", "Manali, Chennai", "Secretariat, Amaravati", "Solapur, Solapur", "Katraj, Pune", "MIDC Khutala, Chandraur"};

    //create 1D arrays for each of the rows of PM2.5 levels from the table - they must all be of the same data type 
    
    double[] ColumboData = {25, 17, 21, 21, 46, 38, 30, 38, 63, 53, 46, 42, 46, 42, 50, 59, 147, 72, 61, 68, 61, 61, 61, 59};
    double[] ManaliData = {134, 88, 120, 64, 58, 47, 153, 111, 59, 85, 73, 81, 107, 97, 107, 134, 118, 109, 150, 151, 118, 140, 165, 118};
    double[] SecretariatData = {60, 50, 30, 77, 71, 66, 67, 63, 76, 74, 50, 30, 30, 0, 0, 0, 9, 12, 21, 0, 0, 0, 0, 0};
    double[] SolapurData = {13, 20, 7, 6, 33,15 ,19, 34, 55, 41, 54, 41, 63, 0, 0, 60, 90, 85, 95, 76, 78, 10, 3, 2};
    double[] KatrajData = {25, 25, 25, 25, 25, 25, 25, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 22, 22, 20, 19};
    double[] KhutalaData = {35, 62, 62, 54, 55, 57, 56, 44, 43, 22, 22, 11, 11, 6, 6, 3, 3, 3, 4, 27, 26, 19, 20, 32};


    //create a 2D array that is an array of arrays, each row is represents a city's PM2.5 levels for 24 hours
    
    double[][] cities = {ColumboData, ManaliData, SecretariatData, SolapurData, KatrajData, KhutalaData};
 
    //call the printData method passing the correct arguments
    
    printData(cityNames, cities);

  //create a 1D data structure (array or ArrayList) and add the average PM2.5 level for a day for each city by calling the average method and passing a 1D array that represents each row in the 2D array
    
    double[] averages = new double[cities.length];
    for(int i = 0; i < cities.length; i++){
      averages[i] = average(cities[i]);
    }
 
    //print a summary of the cities and their average PM2.5 levels rounded to the nearest one hundredth place
    
    for(int i = 0; i < averages.length; i++){
      System.out.print("\nThe average PM2.5 level of " + cityNames[i] + " is " + (double)((int)((averages[i] + 0.005) * 100))/100);
    }
    
  }//end of main method

	// The method below should print all of the data as a table. 
	// The method uses paramaters c which is the array of cities and d which is the 2D array of 24-hour PM2.5 levels.

	public static void printData(String[] c, double[][] d) {
    for(int i = 0; i < c.length; i++){
      System.out.print("\n" + c[i] + ": ");
      for(int j = 0; j < d[i].length; j++){
        System.out.print(d[i][j] + ", ");
      }
    }
	}

  //the method uses a parameter which is a 1D array (one row from the 2D array)
  //the method should calculate and return the average of the values in the 1D array (or row)
 
 public static double average(double[] values) {
  double total = 0;
  for(double i: values){
    total += i;
  }
  return total / values.length;
 }


} //end of class