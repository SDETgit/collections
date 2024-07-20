package C_003_HashSet;

import java.util.HashSet;
import java.util.List;

public class HS007_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		
		  	    
		    HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Toyota");
		    
		    HashSet<String> valid = new HashSet<String>();
		    valid.add("Volvo");
		    valid.add("Ford");
		    valid.add("Mazda");
		    
		    cars.retainAll(valid); //Intersection common elements 
		    
		    System.out.println(cars);
		    //output : [Volvo, Mazda, Ford]

		    
	}

}
