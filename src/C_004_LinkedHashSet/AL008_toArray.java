package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.List;

public class AL008_toArray {

	public static void main(String[] args) {
		
		LinkedHashSet<String> cars = new LinkedHashSet();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Object[] carsArray = cars.toArray(); //Converts the list to an array of Object type.
	    
	    for(Object item : carsArray) {
	      System.out.println(item); }
	    
	    // Convert the HashSet to a String array
	    String[] array = (String[]) cars.toArray(new String[0]);
	    System.out.println(Arrays.toString(array));
//	    Volvo
//	    BMW
//	    Ford
//	    Mazda
//	    [Volvo, BMW, Ford, Mazda]


	}

}
