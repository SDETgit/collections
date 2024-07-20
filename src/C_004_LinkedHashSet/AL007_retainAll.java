package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class AL007_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		
	    
	    LinkedHashSet<String> cars = new LinkedHashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Toyota");
	    
	    LinkedHashSet<String> valid = new LinkedHashSet<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars.retainAll(valid); //Intersection common elements 
	    
	    System.out.println(cars);
	    //output : [Volvo, Ford, Mazda]


		    
	}

}
