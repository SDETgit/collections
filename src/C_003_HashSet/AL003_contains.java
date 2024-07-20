package C_003_HashSet;

import java.util.HashSet;
import java.util.List;

public class AL003_contains {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.contains("BMW"));
	    System.out.println(cars.contains("Toyota"));
		
	    //Output 
	    //true
	    //false

	}

}
