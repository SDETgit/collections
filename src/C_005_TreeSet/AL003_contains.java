package C_005_TreeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class AL003_contains {

	public static void main(String[] args) {
		TreeSet<String> cars = new TreeSet<String>();
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
