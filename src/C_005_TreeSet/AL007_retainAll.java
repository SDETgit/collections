package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;

public class AL007_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		
	    
	    TreeSet<String> cars = new TreeSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Toyota");
	    
	    TreeSet<String> valid = new TreeSet<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars.retainAll(valid); //Intersection common elements 
	    
	    System.out.println(cars);
	    //output : [Ford, Mazda, Volvo]



		    
	}

}
