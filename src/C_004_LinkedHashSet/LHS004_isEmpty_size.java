package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LHS004_isEmpty_size {

	public static void main(String[] args) {
		
		LinkedHashSet<String> cars = new LinkedHashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.isEmpty());
	    
	    System.out.println(cars.size());
	    cars.clear();

	    System.out.println(cars.isEmpty());

	    System.out.println(cars.size());
	    //output 
//	    false
//	    4
//	    true
//	    0



	}

}
