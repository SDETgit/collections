package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LHS003_contains {

	public static void main(String[] args) {
		LinkedHashSet<String> cars = new LinkedHashSet<String>();
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
