package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL003_contains {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
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
