package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL006_isEmpty_size {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
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
