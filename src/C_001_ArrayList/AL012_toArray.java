package C_001_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AL012_toArray {

	public static void main(String[] args) {
		
		ArrayList cars = new ArrayList();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Object[] carsArray = cars.toArray(); //Converts the list to an array of Object type.
	    
	    for(Object item : carsArray) {
	      System.out.println(item); }
	    
	    // Convert the ArrayList to a String array
	    String[] array = (String[]) cars.toArray(new String[0]);
	    System.out.println(Arrays.toString(array));
//	    Volvo
//	    BMW
//	    Ford
//	    Mazda
//	    [Volvo, BMW, Ford, Mazda]

	}

}
