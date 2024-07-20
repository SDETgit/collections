package C_003_HashSet;

import java.util.HashSet;
import java.util.List;

public class AL004_isEmpty_size {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
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
