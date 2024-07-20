package C_003_HashSet;

import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

public class HS008_toArray {

	public static void main(String[] args) {
		
		HashSet cars = new HashSet();
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
//	    Mazda
//	    Ford
//	    BMW
//	    [Volvo, Mazda, Ford, BMW]

	}

}
