package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL006_isEmpty_size {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
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
